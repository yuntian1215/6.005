// Generated from abcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class abcHeaderParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, DIGIT=29, STRING=30, 
    NEWLINE=31, SPACES=32;
  public static final int
    RULE_root = 0, RULE_fieldnumber = 1, RULE_fieldtitle = 2, RULE_otherfields = 3, 
    RULE_fieldcomposer = 4, RULE_fielddefaultlength = 5, RULE_fieldmeter = 6, 
    RULE_fieldtempo = 7, RULE_fieldvoice = 8, RULE_fieldkey = 9, RULE_notelengthstrict = 10, 
    RULE_key = 11, RULE_keynote = 12, RULE_keyaccidental = 13, RULE_modeminor = 14, 
    RULE_basenote = 15, RULE_meter = 16, RULE_meterfraction = 17, RULE_tempo = 18, 
    RULE_comment = 19, RULE_endofline = 20;
  public static final String[] ruleNames = {
    "root", "fieldnumber", "fieldtitle", "otherfields", "fieldcomposer", 
    "fielddefaultlength", "fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", 
    "notelengthstrict", "key", "keynote", "keyaccidental", "modeminor", 
    "basenote", "meter", "meterfraction", "tempo", "comment", "endofline"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'/'", "'#'", "'b'", "'m'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", 
    "'B'", "'c'", "'d'", "'e'", "'f'", "'g'", "'a'", "'C|'", "'='", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, "DIGIT", "STRING", "NEWLINE", "SPACES"
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

  @Override
  public String getGrammarFileName() { return "abcHeader.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public abcHeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public FieldnumberContext fieldnumber() {
      return getRuleContext(FieldnumberContext.class,0);
    }
    public FieldtitleContext fieldtitle() {
      return getRuleContext(FieldtitleContext.class,0);
    }
    public FieldkeyContext fieldkey() {
      return getRuleContext(FieldkeyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(abcHeaderParser.EOF, 0); }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<OtherfieldsContext> otherfields() {
      return getRuleContexts(OtherfieldsContext.class);
    }
    public OtherfieldsContext otherfields(int i) {
      return getRuleContext(OtherfieldsContext.class,i);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42);
      fieldnumber();
      setState(46);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__27) {
        {
        {
        setState(43);
        comment();
        }
        }
        setState(48);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(49);
      fieldtitle();
      setState(53);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__27))) != 0)) {
        {
        {
        setState(50);
        otherfields();
        }
        }
        setState(55);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(56);
      fieldkey();
      setState(57);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldnumberContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public FieldnumberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldnumber; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldnumber(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldnumber(this);
    }
  }

  public final FieldnumberContext fieldnumber() throws RecognitionException {
    FieldnumberContext _localctx = new FieldnumberContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_fieldnumber);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      match(T__0);
      setState(61); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(60);
        match(DIGIT);
        }
        }
        setState(63); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(65);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldtitleContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> STRING() { return getTokens(abcHeaderParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(abcHeaderParser.STRING, i);
    }
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public FieldtitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldtitle; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldtitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldtitle(this);
    }
  }

  public final FieldtitleContext fieldtitle() throws RecognitionException {
    FieldtitleContext _localctx = new FieldtitleContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_fieldtitle);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      match(T__1);
      setState(69); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(68);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(71); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
      setState(73);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class OtherfieldsContext extends ParserRuleContext {
    public FieldcomposerContext fieldcomposer() {
      return getRuleContext(FieldcomposerContext.class,0);
    }
    public FielddefaultlengthContext fielddefaultlength() {
      return getRuleContext(FielddefaultlengthContext.class,0);
    }
    public FieldmeterContext fieldmeter() {
      return getRuleContext(FieldmeterContext.class,0);
    }
    public FieldtempoContext fieldtempo() {
      return getRuleContext(FieldtempoContext.class,0);
    }
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_otherfields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterOtherfields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitOtherfields(this);
    }
  }

  public final OtherfieldsContext otherfields() throws RecognitionException {
    OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_otherfields);
    try {
      setState(81);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(75);
        fieldcomposer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(76);
        fielddefaultlength();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(77);
        fieldmeter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(78);
        fieldtempo();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 5);
        {
        setState(79);
        fieldvoice();
        }
        break;
      case T__27:
        enterOuterAlt(_localctx, 6);
        {
        setState(80);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldcomposerContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> STRING() { return getTokens(abcHeaderParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(abcHeaderParser.STRING, i);
    }
    public FieldcomposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldcomposer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldcomposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldcomposer(this);
    }
  }

  public final FieldcomposerContext fieldcomposer() throws RecognitionException {
    FieldcomposerContext _localctx = new FieldcomposerContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_fieldcomposer);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      match(T__2);
      setState(85); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(84);
        match(STRING);
        }
        }
        setState(87); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING );
      setState(89);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FielddefaultlengthContext extends ParserRuleContext {
    public NotelengthstrictContext notelengthstrict() {
      return getRuleContext(NotelengthstrictContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FielddefaultlengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fielddefaultlength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFielddefaultlength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFielddefaultlength(this);
    }
  }

  public final FielddefaultlengthContext fielddefaultlength() throws RecognitionException {
    FielddefaultlengthContext _localctx = new FielddefaultlengthContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_fielddefaultlength);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(91);
      match(T__3);
      setState(92);
      notelengthstrict();
      setState(93);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldmeterContext extends ParserRuleContext {
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldmeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldmeter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldmeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldmeter(this);
    }
  }

  public final FieldmeterContext fieldmeter() throws RecognitionException {
    FieldmeterContext _localctx = new FieldmeterContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_fieldmeter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(95);
      match(T__4);
      setState(96);
      meter();
      setState(97);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldtempoContext extends ParserRuleContext {
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldtempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldtempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldtempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldtempo(this);
    }
  }

  public final FieldtempoContext fieldtempo() throws RecognitionException {
    FieldtempoContext _localctx = new FieldtempoContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_fieldtempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      match(T__5);
      setState(100);
      tempo();
      setState(101);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldvoiceContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> STRING() { return getTokens(abcHeaderParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(abcHeaderParser.STRING, i);
    }
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldvoice(this);
    }
  }

  public final FieldvoiceContext fieldvoice() throws RecognitionException {
    FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(103);
      match(T__6);
      setState(105); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(104);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(107); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
      setState(109);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldkeyContext extends ParserRuleContext {
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldkeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldkey; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterFieldkey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitFieldkey(this);
    }
  }

  public final FieldkeyContext fieldkey() throws RecognitionException {
    FieldkeyContext _localctx = new FieldkeyContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_fieldkey);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(111);
      match(T__7);
      setState(112);
      key();
      setState(113);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NotelengthstrictContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelengthstrict; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterNotelengthstrict(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitNotelengthstrict(this);
    }
  }

  public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
    NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_notelengthstrict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(115);
        match(DIGIT);
        }
        }
        setState(118); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(120);
      match(T__8);
      setState(122); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(121);
        match(DIGIT);
        }
        }
        setState(124); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyContext extends ParserRuleContext {
    public KeynoteContext keynote() {
      return getRuleContext(KeynoteContext.class,0);
    }
    public ModeminorContext modeminor() {
      return getRuleContext(ModeminorContext.class,0);
    }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(126);
      keynote();
      setState(128);
      _la = _input.LA(1);
      if (_la==T__11) {
        {
        setState(127);
        modeminor();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeynoteContext extends ParserRuleContext {
    public BasenoteContext basenote() {
      return getRuleContext(BasenoteContext.class,0);
    }
    public KeyaccidentalContext keyaccidental() {
      return getRuleContext(KeyaccidentalContext.class,0);
    }
    public KeynoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_keynote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterKeynote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitKeynote(this);
    }
  }

  public final KeynoteContext keynote() throws RecognitionException {
    KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_keynote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(130);
      basenote();
      setState(132);
      _la = _input.LA(1);
      if (_la==T__9 || _la==T__10) {
        {
        setState(131);
        keyaccidental();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyaccidentalContext extends ParserRuleContext {
    public KeyaccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_keyaccidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterKeyaccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitKeyaccidental(this);
    }
  }

  public final KeyaccidentalContext keyaccidental() throws RecognitionException {
    KeyaccidentalContext _localctx = new KeyaccidentalContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_keyaccidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(134);
      _la = _input.LA(1);
      if ( !(_la==T__9 || _la==T__10) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ModeminorContext extends ParserRuleContext {
    public ModeminorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_modeminor; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterModeminor(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitModeminor(this);
    }
  }

  public final ModeminorContext modeminor() throws RecognitionException {
    ModeminorContext _localctx = new ModeminorContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_modeminor);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(136);
      match(T__11);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BasenoteContext extends ParserRuleContext {
    public BasenoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basenote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterBasenote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitBasenote(this);
    }
  }

  public final BasenoteContext basenote() throws RecognitionException {
    BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_basenote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(138);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterContext extends ParserRuleContext {
    public MeterfractionContext meterfraction() {
      return getRuleContext(MeterfractionContext.class,0);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_meter);
    try {
      setState(143);
      switch (_input.LA(1)) {
      case T__12:
        enterOuterAlt(_localctx, 1);
        {
        setState(140);
        match(T__12);
        }
        break;
      case T__25:
        enterOuterAlt(_localctx, 2);
        {
        setState(141);
        match(T__25);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(142);
        meterfraction();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterfractionContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public MeterfractionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meterfraction; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterMeterfraction(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitMeterfraction(this);
    }
  }

  public final MeterfractionContext meterfraction() throws RecognitionException {
    MeterfractionContext _localctx = new MeterfractionContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_meterfraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(146); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(145);
        match(DIGIT);
        }
        }
        setState(148); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(150);
      match(T__8);
      setState(152); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(151);
        match(DIGIT);
        }
        }
        setState(154); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TempoContext extends ParserRuleContext {
    public MeterfractionContext meterfraction() {
      return getRuleContext(MeterfractionContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(156);
      meterfraction();
      setState(157);
      match(T__26);
      setState(159); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(158);
        match(DIGIT);
        }
        }
        setState(161); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(abcHeaderParser.STRING, 0); }
    public TerminalNode NEWLINE() { return getToken(abcHeaderParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(163);
      match(T__27);
      setState(164);
      match(STRING);
      setState(165);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(abcHeaderParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcHeaderListener ) ((abcHeaderListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_endofline);
    try {
      setState(169);
      switch (_input.LA(1)) {
      case T__27:
        enterOuterAlt(_localctx, 1);
        {
        setState(167);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(168);
        match(NEWLINE);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00ae\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2"+
      "\f\2\16\2\62\13\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\3"+
      "\3\3\3\6\3@\n\3\r\3\16\3A\3\3\3\3\3\4\3\4\6\4H\n\4\r\4\16\4I\3\4\3"+
      "\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3\6\6\6X\n\6\r\6\16\6Y\3\6"+
      "\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\6\nl"+
      "\n\n\r\n\16\nm\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\fw\n\f\r\f\16\fx"+
      "\3\f\3\f\6\f}\n\f\r\f\16\f~\3\r\3\r\5\r\u0083\n\r\3\16\3\16\5\16\u0087"+
      "\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u0092\n\22"+
      "\3\23\6\23\u0095\n\23\r\23\16\23\u0096\3\23\3\23\6\23\u009b\n\23\r"+
      "\23\16\23\u009c\3\24\3\24\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3\3"+
      "\25\3\25\3\25\3\25\3\26\3\26\5\26\u00ac\n\26\3\26\2\2\27\2\4\6\b\n"+
      "\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\37 \3\2\f\r\4\2\r\r\17"+
      "\33\u00ad\2,\3\2\2\2\4=\3\2\2\2\6E\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\f"+
      "]\3\2\2\2\16a\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24q\3\2\2\2\26v\3\2"+
      "\2\2\30\u0080\3\2\2\2\32\u0084\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3"+
      "\2\2\2 \u008c\3\2\2\2\"\u0091\3\2\2\2$\u0094\3\2\2\2&\u009e\3\2\2"+
      "\2(\u00a5\3\2\2\2*\u00ab\3\2\2\2,\60\5\4\3\2-/\5(\25\2.-\3\2\2\2/"+
      "\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2"+
      "\63\67\5\6\4\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
      "\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\24\13\2;<\7\2\2\3<\3\3\2"+
      "\2\2=?\7\3\2\2>@\7\37\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
      "BC\3\2\2\2CD\5*\26\2D\5\3\2\2\2EG\7\4\2\2FH\t\2\2\2GF\3\2\2\2HI\3"+
      "\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5*\26\2L\7\3\2\2\2MT\5\n\6"+
      "\2NT\5\f\7\2OT\5\16\b\2PT\5\20\t\2QT\5\22\n\2RT\5(\25\2SM\3\2\2\2"+
      "SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2UW\7"+
      "\5\2\2VX\7 \2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2"+
      "[\\\5*\26\2\\\13\3\2\2\2]^\7\6\2\2^_\5\26\f\2_`\5*\26\2`\r\3\2\2\2"+
      "ab\7\7\2\2bc\5\"\22\2cd\5*\26\2d\17\3\2\2\2ef\7\b\2\2fg\5&\24\2gh"+
      "\5*\26\2h\21\3\2\2\2ik\7\t\2\2jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2"+
      "\2\2mn\3\2\2\2no\3\2\2\2op\5*\26\2p\23\3\2\2\2qr\7\n\2\2rs\5\30\r"+
      "\2st\5*\26\2t\25\3\2\2\2uw\7\37\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
      "xy\3\2\2\2yz\3\2\2\2z|\7\13\2\2{}\7\37\2\2|{\3\2\2\2}~\3\2\2\2~|\3"+
      "\2\2\2~\177\3\2\2\2\177\27\3\2\2\2\u0080\u0082\5\32\16\2\u0081\u0083"+
      "\5\36\20\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\31\3\2\2"+
      "\2\u0084\u0086\5 \21\2\u0085\u0087\5\34\17\2\u0086\u0085\3\2\2\2\u0086"+
      "\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u0089\t\3\2\2\u0089\35\3\2\2"+
      "\2\u008a\u008b\7\16\2\2\u008b\37\3\2\2\2\u008c\u008d\t\4\2\2\u008d"+
      "!\3\2\2\2\u008e\u0092\7\17\2\2\u008f\u0092\7\34\2\2\u0090\u0092\5"+
      "$\23\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
      "\u0092#\3\2\2\2\u0093\u0095\7\37\2\2\u0094\u0093\3\2\2\2\u0095\u0096"+
      "\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2"+
      "\2\u0098\u009a\7\13\2\2\u0099\u009b\7\37\2\2\u009a\u0099\3\2\2\2\u009b"+
      "\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d%\3\2"+
      "\2\2\u009e\u009f\5$\23\2\u009f\u00a1\7\35\2\2\u00a0\u00a2\7\37\2\2"+
      "\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
      "\u00a4\3\2\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7\7"+
      " \2\2\u00a7\u00a8\7!\2\2\u00a8)\3\2\2\2\u00a9\u00ac\5(\25\2\u00aa"+
      "\u00ac\7!\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac+\3\2\2"+
      "\2\22\60\67AISYmx~\u0082\u0086\u0091\u0096\u009c\u00a3\u00ab";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}