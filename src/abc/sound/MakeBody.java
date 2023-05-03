package abc.sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.abcBodyListener;
import abc.parser.abcBodyParser;
import abc.parser.abcBodyParser.NoteContext;
import abc.parser.abcBodyParser.NoteelementContext;

public class MakeBody implements abcBodyListener {
	private Stack<Music> stack = new Stack<>();
	private Stack<Music> repeat = new Stack<>();
	private Stack<Music> FirstMusic = new Stack<>();
	private Music body;
	private Map<String, Stack<Music>> VMusic = new HashMap<>();
	private Map<String, Music> allVMusicMap = new HashMap<>();
	
	private static Map<String, String> header;
	private static Map<String, Integer> measureAccidentals = new HashMap<>();
	
	private boolean inrepeat = true;
	private boolean atEnding = false;
	private String currentVoice = "Default";
	
	public Map<String, Music> getBody() {
		Map<String, Music> MusicBody = new HashMap<>();
		MusicBody.put("Music", body);
		return MusicBody;
		
	}
	
	public Map<String, Music> getAllMusic(){
		return allVMusicMap;
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
	  
	  private static int keyChange(String basenoteString) {
		  Map<String, Integer> accidentalMap = AccidentalMap();
		  String[] sharporder = {"F", "C", "G", "D", "A", "E", "B"};
		  String[] flatorder = {"B", "E", "A", "D", "G", "C", "F"};
		  
		  String upperbasenote = basenoteString.toUpperCase();
		  
		  String key = header.get("K");	  
		  Integer numAccidentals = accidentalMap.get(key);
		  
		  Integer keyTranspose = 0;
		  
		  if(measureAccidentals.containsKey(upperbasenote)) {
			  keyTranspose = measureAccidentals.get(upperbasenote);
	      }
		  
		  if (numAccidentals != null) {			  
			  if (numAccidentals == 0) {
				  return 0 + keyTranspose;
	          }else if (numAccidentals > 0) {
	        	  for (int i = 0; i < numAccidentals; i++) {
	        		  if (sharporder[i].equals(upperbasenote)) {
	        			  return 1 + keyTranspose;
	        			  }
	        	  }
	          }else if (numAccidentals < 0) {
				  numAccidentals = -1 * numAccidentals;
				  for (int i = 0; i < numAccidentals; i++) {
					  if (flatorder[i].equals(upperbasenote)) {
						  return -1 + keyTranspose;
	                  }
	              }
	          }
	      }
		  return 0 + keyTranspose;
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
			  }else if(!length.isEmpty()) {

				  duration = Double.valueOf(length);                                 
			  }else {                                                                
				  duration = 1.0;                                                    
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
			  
			  pitch = pitch.transpose(keyChange(basenoteString));
	          
	          
	          String accidental = null;
	          if (ctx.noteorrest().pitch().accidental() != null) {
	        	  accidental = ctx.noteorrest().pitch().accidental().getText();
	        	  
	        	  int numsharps = countChar(accidental, '^');
	        	  int numflats = countChar(accidental, '_');
	              int numnaturals = countChar(accidental, '=');
	              int naturalchange = 0;
	              
	        	  if(measureAccidentals.containsKey(basenoteString)) {
	        		  naturalchange = -1 * measureAccidentals.get(basenoteString);
	        	  }
	        	  
	        	  int allaccidental = numsharps - numflats + numnaturals * naturalchange;
	        	  
	        	  /**
	        	   * Use the transpose effect above
	        	   */
	        	  if(measureAccidentals.containsKey(basenoteString.toUpperCase()) && (numflats != 0 || numsharps != 0)) {
	        		  pitch = pitch.transpose(-1 * measureAccidentals.get(basenoteString));
	        	  }
	                
	        	  if(numnaturals > 0) {
	        		  measureAccidentals.put(basenoteString.toUpperCase(), 0);
	        	  }
	        	  else{
	        		  measureAccidentals.put(basenoteString.toUpperCase(), allaccidental);
	        	  }

	        	  pitch = pitch.transpose(allaccidental);
	          }
	          Note note = new Note(duration, pitch);
	          if (inrepeat) {
	        	  repeat.push(note);
	          }
		  }
	  }

	  @Override public void enterNoteorrest(abcBodyParser.NoteorrestContext ctx) { }

	  @Override public void exitNoteorrest(abcBodyParser.NoteorrestContext ctx) { }

	  @Override public void enterPitch(abcBodyParser.PitchContext ctx) { }

	  @Override public void exitPitch(abcBodyParser.PitchContext ctx) { }

	  @Override public void enterOctave(abcBodyParser.OctaveContext ctx) { }

	  @Override public void exitOctave(abcBodyParser.OctaveContext ctx) { }

	  @Override public void enterNotelength(abcBodyParser.NotelengthContext ctx) { }

	  @Override public void exitNotelength(abcBodyParser.NotelengthContext ctx) { }

	  @Override public void enterAccidental(abcBodyParser.AccidentalContext ctx) { }

	  @Override public void exitAccidental(abcBodyParser.AccidentalContext ctx) { }

	  @Override public void enterBasenote(abcBodyParser.BasenoteContext ctx) { }

	  @Override public void exitBasenote(abcBodyParser.BasenoteContext ctx) { }

	  @Override public void enterRest(abcBodyParser.RestContext ctx) { }

	  @Override public void exitRest(abcBodyParser.RestContext ctx) { }

	  @Override public void enterTupletelement(abcBodyParser.TupletelementContext ctx) { }

	  @Override public void exitTupletelement(abcBodyParser.TupletelementContext ctx) {
		  double nplet = Double.valueOf(ctx.tupletspec().getText().substring(1));
		  List<NoteelementContext> noteelems = ctx.noteelement();
		  List<Music> tuplets = new ArrayList<>();
		  int nplet_t = (int) nplet;
	     
		  /**
		   * Duplet: 2 notes in the time of 3 notes
		   * Triplet: 3 notes in the time of 2 notes
		   * Quadruplet: 4 notes in the time of 3 notes
		   */		  
		  for (NoteelementContext noteelem: noteelems) {
			  Music item = repeat.pop();
			  if (item.isNote()) {
				  Note note = (Note) item;
				  Note tupletnote;
				  if (nplet == 3) {
					  tupletnote = new Note(note.duration() * 2 / nplet, note.pitch());
				  }else if (nplet == 2) {
					  tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());
				  } else{
					  tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());
				  }
				  tuplets.add(tupletnote);
				  
			  }else if (item.isChord()) {
				  Chord chord = (Chord) item;
				  List<Note> chordNotes = new ArrayList<Note>();
				  for (Note note: chord.getNotes()) {
					  Note tupletnote;
					  if (nplet == 3) {
						  tupletnote = new Note(note.duration() * 2 / nplet, note.pitch());
					  }else if (nplet == 2) {
						  tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());
					  }else{
						  tupletnote = new Note(note.duration() * 3 / nplet, note.pitch());
					  }
					  chordNotes.add(tupletnote);
				  }
				  tuplets.add(new Chord(chordNotes));
			  }
		  }
		  /**
		   * Reverse the order because of the FILO nature of the stack
		   */
		  for (int i = tuplets.size() - 1; i >= tuplets.size()-nplet_t; i--) {
			  repeat.push(tuplets.get(i));
		  }
	  }

	  @Override public void enterTupletspec(abcBodyParser.TupletspecContext ctx) { }

	  @Override public void exitTupletspec(abcBodyParser.TupletspecContext ctx) { }

	  @Override public void enterMultinote(abcBodyParser.MultinoteContext ctx) { }

	  @Override public void exitMultinote(abcBodyParser.MultinoteContext ctx) {
		  List<NoteContext> notectxs = ctx.note();
		  List<Note> chordNotes = new ArrayList<>();
		  for (NoteContext notectx : notectxs) {
			  Note note = (Note) repeat.pop();
			  chordNotes.add(note);
		  }
		  /**
		   * ?????
		   */
		  Collections.reverse(chordNotes);    
		  Chord chord = new Chord(chordNotes);
		  repeat.push(chord);
	  }

	  @Override public void enterBarline(abcBodyParser.BarlineContext ctx) { }

	  @Override public void exitBarline(abcBodyParser.BarlineContext ctx) {
		  if(ctx != null) {
			  measureAccidentals.clear();
		  }
		  
		  if (ctx.getText().equals("|:") || ctx.getText().equals("[|") || ctx.getText().equals("||") || ctx.getText().equals("|]")) {
			  if(!(VMusic.isEmpty())) {
				  for(int i = 0; i <= repeat.size() - 1; i++) {
					  stack.push(repeat.get(i));
				  }
				  
				  Stack<Music> currentVoiceStack = VMusic.get(currentVoice);
				  for(int j = 0; j <= stack.size() - 1; j++) {
					  currentVoiceStack.push(stack.get(j));
				  }
				  VMusic.put(currentVoice, currentVoiceStack);
				  stack = new Stack<>();
				  
			  }else{
				  for(int k = 0; k <= repeat.size() - 1; k++) {
					  stack.push(repeat.get(k));
				  }
			  }
			  
			  inrepeat = true;
			  repeat = new Stack<>();
	            
		  }else if(ctx.getText().equals(":|")) {
			  if(repeat.size() > 0 && !(atEnding)) {
				  for (int i = 0; i < 2; i++) {
					  for (int j = 0; j <= repeat.size() - 1; j++) {
						  stack.push(repeat.get(j));
					  }
				  }
				  repeat = new Stack<>();
			  }
			  if(atEnding) {
				  for(int k = 0; k <= repeat.size() - 1; k++) {
					  stack.push(repeat.get(k));
				  }
				  for(int l = 0; l <= FirstMusic.size() - 1; l++) {
					  stack.push(FirstMusic.get(l));
				  }
				  repeat = new Stack<>();
				  FirstMusic = new Stack<>();
				  atEnding = false;
			  }
		  }
	  }

	  @Override public void enterNthrepeat(abcBodyParser.NthrepeatContext ctx) { }

	  @Override public void exitNthrepeat(abcBodyParser.NthrepeatContext ctx) {
		  if(ctx.getText().equals("[1")) {
			  for(int i = 0; i <= repeat.size(); i++) {
				  FirstMusic.push(repeat.get(i));
				  atEnding = true;
			  }
		  }else if(ctx.getText().equals("[2")){
			  atEnding = false;
		  }
	  }

	  @Override public void enterFieldvoice(abcBodyParser.FieldvoiceContext ctx) { }

	  @Override public void exitFieldvoice(abcBodyParser.FieldvoiceContext ctx) {
		  if(currentVoice.equals("Default")) {
			  if(repeat.size() > 0) {
				  VMusic.put(currentVoice, repeat);
				  repeat = new Stack<Music>();
			  }
		  }
		  
		  currentVoice = ctx.getText();
		  if(!(VMusic.containsKey(currentVoice))) {
			  if(repeat.size() > 0) {
				  VMusic.put(currentVoice, repeat);
			  }else {
				  VMusic.put(currentVoice, new Stack<Music>());
			  }
		  }else {
			  Stack<Music> currentVoiceStack = VMusic.get(currentVoice);
			  
			  for(int i = 0; i <= repeat.size() - 1; i++) {
				  currentVoiceStack.push(repeat.get(i));
			  }
			  VMusic.put(currentVoice, currentVoiceStack);
		  }
		  
		  repeat = new Stack<Music>();
		  stack = new Stack<Music>();
	  }

	  @Override public void enterComment(abcBodyParser.CommentContext ctx) { }

	  @Override public void exitComment(abcBodyParser.CommentContext ctx) { }

	  @Override public void enterEndofline(abcBodyParser.EndoflineContext ctx) { }

	  @Override public void exitEndofline(abcBodyParser.EndoflineContext ctx) {
		  if(!VMusic.isEmpty()) {
			  for(int i = 0; i <= repeat.size() -1; i++) {
				  stack.push(repeat.get(i));
			  }
			  
			  Stack<Music> currentVoiceStack = VMusic.get(currentVoice);
			  for (int j = 0; j <= stack.size() - 1; j++) {
				  currentVoiceStack.push(stack.get(j));
			  }
			  VMusic.put(currentVoice, currentVoiceStack);
			  repeat = new Stack<Music>();
			  stack = new Stack<Music>();
		  }
	  }


	  @Override public void enterEveryRule(ParserRuleContext ctx) { }

	  @Override public void exitEveryRule(ParserRuleContext ctx) { }

	  @Override public void visitTerminal(TerminalNode node) { }

	  @Override public void visitErrorNode(ErrorNode node) { }
}