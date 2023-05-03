package abc.sound;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.Split;
import abc.parser.abcBodyLexer;
import abc.parser.abcBodyParser;
import abc.parser.abcHeaderLexer;
import abc.parser.abcHeaderParser;
import abc.sound.SequencePlayer;

/** 
 * Music represents a piece of music played by multiple instruments.
 */

public interface Music{
	
	/**
     * @return total duration of this piece in beats
     */
    public double duration();
    
    /**
     * Play this piece.
     * @param player player to play on
     * @param atBeat when to play
     */
    public void play(SequencePlayer player, double atBeat);
    
    public boolean isNote();
    
    public boolean isChord();
    
    public static Map<String, String> parseHeader(String header) {
    	CharStream headstream = new ANTLRInputStream(header);
        abcHeaderLexer lexer = new abcHeaderLexer(headstream);
        lexer.reportErrorsAsExceptions();
       
        TokenStream tokens = new CommonTokenStream(lexer);
        abcHeaderParser parser = new abcHeaderParser(tokens);
        parser.reportErrorsAsExceptions();
        
        ParseTree tree = parser.root();
        MakeHeader headerMaker = new MakeHeader();
        new ParseTreeWalker().walk(headerMaker, tree);
        return headerMaker.getHeader();
    }
    
    public static Map<String, Music> parseBody(String body, Map<String, String> header) {
    	CharStream bodystream = new ANTLRInputStream(body);
        abcBodyLexer lexer = new abcBodyLexer(bodystream);
        lexer.reportErrorsAsExceptions();
        
        TokenStream bodyTokens = new CommonTokenStream(lexer);
        abcBodyParser parser = new abcBodyParser(bodyTokens);
        parser.reportErrorsAsExceptions();
        
        ParseTree tree = parser.root();
        MakeBody bodyMaker = new MakeBody();
        bodyMaker.SetHeader(header);
        new ParseTreeWalker().walk(bodyMaker, tree);
        if(header.containsKey("V")) {
            return bodyMaker.getAllMusic();
        }

        else{
            return bodyMaker.getBody();
        }
    }
    
    public static Map<String, String> parseHeaderFromFile(File file) throws IOException {
		List<String> Abcpiece = Split.SplitHeader(file);
		String header = Abcpiece.get(0);
		return parseHeader(new String(header));
	}
    
    public static Map<String, Music> parseBodyFromFile(File file) throws IOException {
		List<String> Abcpiece = Split.SplitHeader(file);
		String header = Abcpiece.get(0);
		String body = Abcpiece.get(1);
		return parseBody(new String(body), parseHeader(new String(header)));
	}
    
    public static void main() throws IOException, MidiUnavailableException, InvalidMidiDataException {
    	File file = new File("sample_abc/invention.abc");
        List<String> headbody = Split.SplitHeader(file);
        
        System.out.println(headbody.get(1));
        Map<String, String> header = parseHeader(headbody.get(0));
        System.out.println(header);
        Map<String, Music> body = parseBody(headbody.get(1),header);
        System.out.println(body);
        
        SequencePlayer player = new SequencePlayer(file);
        double voicedelay = 0;
        
        if(body.keySet().contains("Default")) {
            Music defaultvoice = body.get("Default");
            defaultvoice.play(player, 0);
            voicedelay = defaultvoice.duration() * player.getTicksDefaultNote();
        }
        
        for(String key: body.keySet()) {
            if(!key.equals("Default")) {
            	body.get(key).play(player, voicedelay);
            }
        }
        player.play();
    }

    
	
}