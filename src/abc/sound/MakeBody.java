package abc.sound;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.abcBodyListener;
import abc.parser.abcBodyParser;

public class MakeBody implements abcBodyListener {
	private Stack<Music> stack = new Stack<>();
	private Stack<Music> repeat = new Stack<>();
	private Music body;
	private Map<String, Stack<Music>> VMusic = new HashMap<>();
	private Map<String, Music> allVMusicMap = new HashMap<>();
	
	private static Map<String, String> header;
	private static Map<String, Integer> measureAccidentals = new HashMap<>();
	
	public Map<String, Music> getBody(){
		Map<String, Music> MusicBody = new HashMap<>();
		MusicBody.put("Music", body);
		return MusicBody;
		
	}
	
	public void SetHeader(Map<String, String> Musicheader) {
		header = Musicheader;
	}
	
	private static Map<String, Integer> AccidentalMap() {
        Map<String, Integer> accidentalMap = new HashMap<>();
        accidentalMap.put("C", 0);
        accidentalMap.put("G", 1);
        accidentalMap.put("D", 2);
        accidentalMap.put("A", 3);
        accidentalMap.put("E", 4);
        accidentalMap.put("B", 5);
        accidentalMap.put("F#", 6);
        accidentalMap.put("C#", 7);
        accidentalMap.put("Am", 0);
        accidentalMap.put("Em", 1);
        accidentalMap.put("Bm", 2);
        accidentalMap.put("F#m", 3);
        accidentalMap.put("C#m", 4);
        accidentalMap.put("G#m", 5);
        accidentalMap.put("D#m", 6);
        accidentalMap.put("A#m", 7);
        accidentalMap.put("F", -1);
        accidentalMap.put("Bb", -2);
        accidentalMap.put("Eb", -3);
        accidentalMap.put("Ab", -4);
        accidentalMap.put("Db", -5);
        accidentalMap.put("Gb", -6);
        accidentalMap.put("Cb", -7);
        accidentalMap.put("Dm", -1);
        accidentalMap.put("Gm", -2);
        accidentalMap.put("Cm", -3);
        accidentalMap.put("Fm", -4);
        accidentalMap.put("Bbm", -5);
        accidentalMap.put("Ebm", -6);
        accidentalMap.put("Abm", -7);
        return accidentalMap;

    }

	
	
	
	@Override public void enterRoot(abcBodyParser.RootContext ctx) { }
	
	
	@Override public void exitRoot(abcBodyParser.RootContext ctx) {
		if(header.containsKey("V")) {
			for (String key : VMusic.keySet()) {
                Stack<Music> CurrentVoice = VMusic.get(key);
                if (CurrentVoice.size() >= 2) {
                    Concat concat = new Concat(CurrentVoice.pop(), CurrentVoice.pop());
                    while(!CurrentVoice.isEmpty()) {
                    	concat = new Concat(concat, CurrentVoice.pop());
                    }
                    allVMusicMap.put(key, concat);
                } else {
                	allVMusicMap.put(key, VMusic.get(key).pop());
                }
			}
		}else {
            stack.addAll(repeat);
            if (stack.size() >= 2) {
                Concat concat = new Concat(stack.pop(), stack.pop());
                while(!stack.isEmpty()) {
                	concat = new Concat(concat, stack.pop());
                }
                body = concat;
            } else {
            	body = stack.pop();
            }
        }
	}
	

	  @Override public void enterAbcline(abcBodyParser.AbclineContext ctx) { }

	  @Override public void exitAbcline(abcBodyParser.AbclineContext ctx) { }

	  @Override public void enterElement(abcBodyParser.ElementContext ctx) { }

	  @Override public void exitElement(abcBodyParser.ElementContext ctx) { }

	  @Override public void enterNoteelement(abcBodyParser.NoteelementContext ctx) { }

	  @Override public void exitNoteelement(abcBodyParser.NoteelementContext ctx) { }

	  @Override public void enterNote(abcBodyParser.NoteContext ctx) { }

	  private static int countChar(String str, char c) {
		  String[] arr = str.split(String.valueOf(c));
		  return arr.length - 1;
	  }
	  
	  private static int keyChange(String basenoteString, String OctaveString, String octaveInfo) {
		  Map<String, Integer> accidentalMap = AccidentalMap();
		  String[] flatorder = {"B", "E", "A", "D", "G", "C", "F"};
		  String[] sharporder = {"F", "C", "G", "D", "A", "E", "B"};
		  
		  String uppercasebasenote = basenoteString.toUpperCase();
		  
		  String key = header.get("K");	  
		  Integer numAccidentals = accidentalMap.get(key);
		  
		  Integer measureEffect = 0;
		  
		  if(measureAccidentals.containsKey(OctaveString)){
			  measureEffect = measureAccidentals.get(OctaveString);
	      }
		  
		  if (numAccidentals != null){			  
			  if (numAccidentals == 0){
				  return 0 + measureEffect;
	          }else if (numAccidentals > 0){
				  for (int i = 0; i < numAccidentals; i++){
					  if (sharporder[i].equals(uppercasebasenote)){
						  return 1 + measureEffect;
					  }
	              }
	          }else if (numAccidentals < 0){
				  numAccidentals = -1 * numAccidentals;
				  for (int i = 0; i < numAccidentals; i++){
					  if (flatorder[i].equals(uppercasebasenote)){
						  return -1 + measureEffect;
	                  }
	              }
	          }
	      }
		  return 0 + measureEffect;
	  }
	  
	  @Override public void exitNote(abcBodyParser.NoteContext ctx) { 
		  double duration;
		  
		  if(ctx.notelength() != null) {
			  String length = ctx.notelength().getText();
			  if(length.contains("/")) {
				  String[] numbers = length.split("/");
				  
				  /**
				   * An absent numerator should be treated as 1, and an absent denominator as 2
				   */
				  if(numbers.length == 0) {
					duration = 0.5;  
				  }else if(numbers[0].length() == 0) {
					  duration = 1.0 / Double.valueOf(numbers[1]);
				  }else if(numbers[1].length() == 0) {
					  duration = Double.valueOf(numbers[0]) / 2.0;
				  }else {
					  duration = Double.valueOf(numbers[0]) / Double.valueOf(numbers[1]);
				  }
			  }else {
				  duration = Double.valueOf(length);
			  }
		  }else {
			  duration = 1.0;
		  }
		  
		  if(ctx.noteorrest().rest() != null) {
			  Rest rest = new Rest(duration);
			  repeat.push(rest);
		  }else {
			  String basenoteString = ctx.noteorrest().pitch().basenote().getText();
			  char basenote = basenoteString.charAt(0);
			  Pitch pitch;
			  
			  if (Character.isLowerCase(basenote)) {
	                basenote = basenoteString.toUpperCase().charAt(0);
	                pitch = new Pitch(basenote);
	                pitch = pitch.transpose(12);
	            }else {
	                pitch = new Pitch(basenote);
	            }
			  
			  String octaveString = null;
			  if(ctx.noteorrest().pitch().octave() != null) {
				  octaveString = ctx.noteorrest().pitch().octave().getText();
	              int downoctaves = countChar(octaveString, ',');
	              int upoctaves = countChar(octaveString, "'".charAt(0));
	              int change = upoctaves - downoctaves;
	              pitch = pitch.transpose(change * 12);
			  }
			  
			  String Octavenote = basenoteString;
	          if(ctx.noteorrest().pitch().octave() != null) {
	        	  Octavenote += octaveString;
	        	  pitch = pitch.transpose(keyChange(basenoteString, Octavenote, octaveString));
	          }else {
	        	  pitch = pitch.transpose(keyChange(basenoteString, Octavenote, ""));
	          }
	          
	          String accidental = null;
		  }
	  }

	  @Override public void enterNoteorrest(abcBodyParser.NoteorrestContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitNoteorrest(abcBodyParser.NoteorrestContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterPitch(abcBodyParser.PitchContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitPitch(abcBodyParser.PitchContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterOctave(abcBodyParser.OctaveContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitOctave(abcBodyParser.OctaveContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterNotelength(abcBodyParser.NotelengthContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitNotelength(abcBodyParser.NotelengthContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterAccidental(abcBodyParser.AccidentalContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitAccidental(abcBodyParser.AccidentalContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterBasenote(abcBodyParser.BasenoteContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitBasenote(abcBodyParser.BasenoteContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterRest(abcBodyParser.RestContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitRest(abcBodyParser.RestContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterTupletelement(abcBodyParser.TupletelementContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitTupletelement(abcBodyParser.TupletelementContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterTupletspec(abcBodyParser.TupletspecContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitTupletspec(abcBodyParser.TupletspecContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterMultinote(abcBodyParser.MultinoteContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitMultinote(abcBodyParser.MultinoteContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterBarline(abcBodyParser.BarlineContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitBarline(abcBodyParser.BarlineContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterNthrepeat(abcBodyParser.NthrepeatContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitNthrepeat(abcBodyParser.NthrepeatContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterFieldvoice(abcBodyParser.FieldvoiceContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitFieldvoice(abcBodyParser.FieldvoiceContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterComment(abcBodyParser.CommentContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitComment(abcBodyParser.CommentContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterEndofline(abcBodyParser.EndoflineContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitEndofline(abcBodyParser.EndoflineContext ctx) { }

	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void enterEveryRule(ParserRuleContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void exitEveryRule(ParserRuleContext ctx) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void visitTerminal(TerminalNode node) { }
	  /**
	   * {@inheritDoc}
	   *
	   * <p>The default implementation does nothing.</p>
	   */
	  @Override public void visitErrorNode(ErrorNode node) { }
}