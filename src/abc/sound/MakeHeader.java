package abc.sound;

import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.abcHeaderListener;
import abc.parser.abcHeaderParser;

public class MakeHeader implements abcHeaderListener {
	
	private Map<String, String> header = new HashMap<>();
	
	/**
     * Returns the expression constructed by this listener object.
     * Requires that this listener has completely walked over an abcHeader
     * parse tree using ParseTreeWalker.
     * @return abcHeader for the parse tree that was walked
     */
    public Map<String, String> getHeader() {
        return header;
    }
    
    @Override public void enterRoot(abcHeaderParser.RootContext ctx) { }
    
    /**
     * exitRoot with default configuration.
     * When the field M is omitted, the default meter is 4/4.
     * When the field L is omitted, If the meter is less than 0.75, the default unit note length is a sixteenth note. 
     * If the meter is 0.75 or greater, it is an eighth note.
     * When the field Q is omitted, the default tempo is 100 beats per minute, 
     * where a beat is the default note length given by field L .
     */
    @Override public void exitRoot(abcHeaderParser.RootContext ctx) { 
    	if(!header.containsKey("M")) {
    		header.put("M", "4/4");
    		if(!header.containsKey("L"))
    			header.put("L", "1/8");
    	}
    	
    	if(!header.containsKey("L")) {
    		String fractionString = header.get("M");
            String[] parts = fractionString.split("/");
            BigDecimal numerator = new BigDecimal(parts[0]);
            BigDecimal denominator = new BigDecimal(parts[1]);
            BigDecimal result = numerator.divide(denominator);
            
            double meterresult = result.doubleValue();
            if(meterresult < 0.75)
            	header.put("L", "1/16");
            else {
				header.put("L", "1/8");
			}            
    	}
    	
    	if(!header.containsKey("Q")) {
    		String tempo = header.get("L") + "=100";
    		header.put("Q", tempo);
    	} 	
    }

    @Override public void enterFieldnumber(abcHeaderParser.FieldnumberContext ctx) { }
    
    /**
     * exitFieldnumber set X which must exist as required
     */
    @Override public void exitFieldnumber(abcHeaderParser.FieldnumberContext ctx) { 
    	String Fnumber = ctx.getText().substring(2);
    	header.put("X", Fnumber);
    }
  
    @Override public void enterFieldtitle(abcHeaderParser.FieldtitleContext ctx) { }
    
    /**
     * exitFieldtitle set T which must exist as required
     */
    @Override public void exitFieldtitle(abcHeaderParser.FieldtitleContext ctx) { 
    	String Ftitle = ctx.getText().substring(2);
    	header.put("T", Ftitle);
    }
 
    @Override public void enterOtherfields(abcHeaderParser.OtherfieldsContext ctx) { }

    @Override public void exitOtherfields(abcHeaderParser.OtherfieldsContext ctx) { }
 
    @Override public void enterFieldcomposer(abcHeaderParser.FieldcomposerContext ctx) { }
    
    /**
     * exitFieldcomposer set C (may be have no use but only to express the header information)
     */
    @Override public void exitFieldcomposer(abcHeaderParser.FieldcomposerContext ctx) {
    	String Fcomposer = ctx.getText();
    	if(!Fcomposer.isEmpty())
    		header.put("C", Fcomposer.substring(2));
    }

    @Override public void enterFielddefaultlength(abcHeaderParser.FielddefaultlengthContext ctx) { }

    /**
     * exitFielddefaultlength set L (when L is not empty)
     */
    @Override public void exitFielddefaultlength(abcHeaderParser.FielddefaultlengthContext ctx) { 
    	String Flength = ctx.getText();
    	if(!Flength.isEmpty())
    		header.put("L", Flength.substring(2));
    }

    @Override public void enterFieldmeter(abcHeaderParser.FieldmeterContext ctx) { }
    
    /**
     * exitFieldmeter set M (when M is not empty)
     * The special meter C (“common time”) means 4/4 , and C| (“cut common time”) means 2/2
     */
    @Override public void exitFieldmeter(abcHeaderParser.FieldmeterContext ctx) { 
    	String Fmeter = ctx.getText();
    	
    	if(!Fmeter.isEmpty()) {
    		if(Fmeter.substring(2).equals("C")) {
        		header.put("M", "4/4");
        	}else if(Fmeter.substring(2).equals("C|")) {
        		header.put("M", "2/2");
        	}else {
        		header.put("M", Fmeter.substring(2));
        	}
    	}
    }
    
    @Override public void enterFieldtempo(abcHeaderParser.FieldtempoContext ctx) { }
    
    /**
     * exitFielddefaultlength set Q (when Q is not empty)
     */
    @Override public void exitFieldtempo(abcHeaderParser.FieldtempoContext ctx) { 
    	String Ftempo = ctx.getText();
    	if(!Ftempo.isEmpty())
    		header.put("Q", Ftempo.substring(2));
    }

    @Override public void enterFieldvoice(abcHeaderParser.FieldvoiceContext ctx) { }
    
    /**
     * exitFielddefaultlength set V (when V is not empty)
     */
    @Override public void exitFieldvoice(abcHeaderParser.FieldvoiceContext ctx) { 
    	String Fvoice = ctx.getText();
    	if(!Fvoice.isEmpty())
    		header.put("V", "1");
    }

    @Override public void enterFieldkey(abcHeaderParser.FieldkeyContext ctx) { }
    
    /**
     * exitFieldkey set K (when K is not empty)
     */
    @Override public void exitFieldkey(abcHeaderParser.FieldkeyContext ctx) { 
    	String Fkey = ctx.getText().substring(2);
    	header.put("K", Fkey);
    }

    /**
     * Don't need these here, so just make them empty implementations
     */
    @Override public void enterComment(abcHeaderParser.CommentContext ctx) { }
  
    @Override public void exitComment(abcHeaderParser.CommentContext ctx) { }

    @Override public void enterEndofline(abcHeaderParser.EndoflineContext ctx) { }
 
    @Override public void exitEndofline(abcHeaderParser.EndoflineContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
    
	
}