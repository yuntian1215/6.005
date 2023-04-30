// Generated from abcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class abcHeaderLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, DIGIT=30, 
    STRING=31, NEWLINE=32, SPACES=33;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
    "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
    "T__25", "T__26", "T__27", "T__28", "DIGIT", "STRING", "NEWLINE", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'/'", "'M:'", "'C'", "'C|'", 
    "'Q:'", "'='", "'V:'", "'K:'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", 
    "'c'", "'d'", "'e'", "'f'", "'g'", "'a'", "'b'", "'#'", "'M'", "'m'", 
    "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, "DIGIT", "STRING", "NEWLINE", "SPACES"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public abcHeaderLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "abcHeader.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u009d\b\1\4\2"+
      "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
      "\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
      "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
      "\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
      "\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
      "\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
      "\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
      "\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
      "\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
      "\3\36\3\36\3\37\3\37\3 \6 \u008c\n \r \16 \u008d\3!\3!\3!\5!\u0093"+
      "\n!\5!\u0095\n!\3\"\6\"\u0098\n\"\r\"\16\"\u0099\3\"\3\"\2\2#\3\3"+
      "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
      "\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
      ";\37= ?!A\"C#\3\2\5\3\2\62;\b\2))..\60\60C\\^^c|\3\2\"\"\u00a0\2\3"+
      "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
      "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
      "\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
      "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
      "\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
      "\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
      "\2\3E\3\2\2\2\5H\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13Q\3\2\2\2\rS\3\2"+
      "\2\2\17V\3\2\2\2\21X\3\2\2\2\23[\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31"+
      "c\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2"+
      "%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-x\3\2\2\2/z\3\2\2\2\61|"+
      "\3\2\2\2\63~\3\2\2\2\65\u0080\3\2\2\2\67\u0082\3\2\2\29\u0084\3\2"+
      "\2\2;\u0086\3\2\2\2=\u0088\3\2\2\2?\u008b\3\2\2\2A\u0094\3\2\2\2C"+
      "\u0097\3\2\2\2EF\7Z\2\2FG\7<\2\2G\4\3\2\2\2HI\7V\2\2IJ\7<\2\2J\6\3"+
      "\2\2\2KL\7E\2\2LM\7<\2\2M\b\3\2\2\2NO\7N\2\2OP\7<\2\2P\n\3\2\2\2Q"+
      "R\7\61\2\2R\f\3\2\2\2ST\7O\2\2TU\7<\2\2U\16\3\2\2\2VW\7E\2\2W\20\3"+
      "\2\2\2XY\7E\2\2YZ\7~\2\2Z\22\3\2\2\2[\\\7S\2\2\\]\7<\2\2]\24\3\2\2"+
      "\2^_\7?\2\2_\26\3\2\2\2`a\7X\2\2ab\7<\2\2b\30\3\2\2\2cd\7M\2\2de\7"+
      "<\2\2e\32\3\2\2\2fg\7F\2\2g\34\3\2\2\2hi\7G\2\2i\36\3\2\2\2jk\7H\2"+
      "\2k \3\2\2\2lm\7I\2\2m\"\3\2\2\2no\7C\2\2o$\3\2\2\2pq\7D\2\2q&\3\2"+
      "\2\2rs\7e\2\2s(\3\2\2\2tu\7f\2\2u*\3\2\2\2vw\7g\2\2w,\3\2\2\2xy\7"+
      "h\2\2y.\3\2\2\2z{\7i\2\2{\60\3\2\2\2|}\7c\2\2}\62\3\2\2\2~\177\7d"+
      "\2\2\177\64\3\2\2\2\u0080\u0081\7%\2\2\u0081\66\3\2\2\2\u0082\u0083"+
      "\7O\2\2\u00838\3\2\2\2\u0084\u0085\7o\2\2\u0085:\3\2\2\2\u0086\u0087"+
      "\7\'\2\2\u0087<\3\2\2\2\u0088\u0089\t\2\2\2\u0089>\3\2\2\2\u008a\u008c"+
      "\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2"+
      "\2\u008d\u008e\3\2\2\2\u008e@\3\2\2\2\u008f\u0095\7\f\2\2\u0090\u0092"+
      "\7\17\2\2\u0091\u0093\7\f\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2"+
      "\2\2\u0093\u0095\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
      "B\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2"+
      "\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
      "\u009c\b\"\2\2\u009cD\3\2\2\2\7\2\u008d\u0092\u0094\u0099\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}