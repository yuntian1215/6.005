package abc.sound;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.abcBodyListener;
import abc.parser.abcBodyParser;

public class MakeHeader implements abcBodyListener {
	private Stack<Music> stack = new Stack<>();
	
	
	@Override public void enterRoot(abcBodyParser.RootContext ctx) { }
	
	@Override public void exitRoot(abcBodyParser.RootContext ctx) {
		
	}
}