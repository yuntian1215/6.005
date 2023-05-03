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
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, DIGIT=30, 
    STRING=31, NEWLINE=32, SPACES=33;
  public static final int
    RULE_root = 0, RULE_fieldnumber = 1, RULE_fieldtitle = 2, RULE_otherfields = 3, 
    RULE_fieldcomposer = 4, RULE_fielddefaultlength = 5, RULE_fieldmeter = 6, 
    RULE_fieldtempo = 7, RULE_fieldvoice = 8, RULE_fieldkey = 9, RULE_comment = 10, 
    RULE_endofline = 11;
  public static final String[] ruleNames = {
    "root", "fieldnumber", "fieldtitle", "otherfields", "fieldcomposer", 
    "fielddefaultlength", "fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", 
    "comment", "endofline"
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
      setState(24);
      fieldnumber();
      setState(28);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__28) {
        {
        {
        setState(25);
        comment();
        }
        }
        setState(30);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(31);
      fieldtitle();
      setState(35);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__28))) != 0)) {
        {
        {
        setState(32);
        otherfields();
        }
        }
        setState(37);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(38);
      fieldkey();
      setState(39);
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
      setState(41);
      match(T__0);
      setState(43); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(42);
        match(DIGIT);
        }
        }
        setState(45); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(47);
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
      setState(49);
      match(T__1);
      setState(51); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(50);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(53); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
      setState(55);
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
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
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
      enterOuterAlt(_localctx, 1);
      {
      setState(63);
      switch (_input.LA(1)) {
      case T__2:
        {
        setState(57);
        fieldcomposer();
        }
        break;
      case T__3:
        {
        setState(58);
        fielddefaultlength();
        }
        break;
      case T__5:
        {
        setState(59);
        fieldmeter();
        }
        break;
      case T__8:
        {
        setState(60);
        fieldtempo();
        }
        break;
      case T__10:
        {
        setState(61);
        fieldvoice();
        }
        break;
      case T__28:
        {
        setState(62);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
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

  public static class FieldcomposerContext extends ParserRuleContext {
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
      setState(67);
      match(T__2);
      setState(69); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(68);
        match(STRING);
        }
        }
        setState(71); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==STRING );
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
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(73);
      match(T__3);
      setState(75); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(74);
        match(DIGIT);
        }
        }
        setState(77); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(79);
      match(T__4);
      setState(81); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(80);
        match(DIGIT);
        }
        }
        setState(83); 
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

  public static class FieldmeterContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__5);
      setState(99);
      switch (_input.LA(1)) {
      case T__6:
        {
        setState(86);
        match(T__6);
        }
        break;
      case T__7:
        {
        setState(87);
        match(T__7);
        }
        break;
      case DIGIT:
        {
        {
        setState(89); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(88);
          match(DIGIT);
          }
          }
          setState(91); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(93);
        match(T__4);
        setState(95); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(94);
          match(DIGIT);
          }
          }
          setState(97); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class FieldtempoContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(abcHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcHeaderParser.DIGIT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(101);
      match(T__8);
      {
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(102);
        match(DIGIT);
        }
        }
        setState(105); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(107);
      match(T__4);
      setState(109); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(108);
        match(DIGIT);
        }
        }
        setState(111); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
      setState(113);
      match(T__9);
      setState(115); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(114);
        match(DIGIT);
        }
        }
        setState(117); 
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

  public static class FieldvoiceContext extends ParserRuleContext {
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
      setState(119);
      match(T__10);
      setState(121); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(120);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(123); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(125);
      match(T__11);
      setState(126);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(128);
      _la = _input.LA(1);
      if (_la==T__24 || _la==T__25) {
        {
        setState(127);
        _la = _input.LA(1);
        if ( !(_la==T__24 || _la==T__25) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(131);
      _la = _input.LA(1);
      if (_la==T__26 || _la==T__27) {
        {
        setState(130);
        _la = _input.LA(1);
        if ( !(_la==T__26 || _la==T__27) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
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
    enterRule(_localctx, 20, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(133);
      match(T__28);
      setState(134);
      match(STRING);
      setState(135);
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
    enterRule(_localctx, 22, RULE_endofline);
    try {
      setState(139);
      switch (_input.LA(1)) {
      case T__28:
        enterOuterAlt(_localctx, 1);
        {
        setState(137);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(138);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0090\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2"+
      "\7\2$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\6\3.\n\3\r\3\16\3/\3"+
      "\3\3\3\3\4\3\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
      "\3\5\5\5B\n\5\3\5\3\5\3\6\3\6\6\6H\n\6\r\6\16\6I\3\7\3\7\6\7N\n\7"+
      "\r\7\16\7O\3\7\3\7\6\7T\n\7\r\7\16\7U\3\b\3\b\3\b\3\b\6\b\\\n\b\r"+
      "\b\16\b]\3\b\3\b\6\bb\n\b\r\b\16\bc\5\bf\n\b\3\t\3\t\6\tj\n\t\r\t"+
      "\16\tk\3\t\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\6\tv\n\t\r\t\16\tw\3\n\3"+
      "\n\6\n|\n\n\r\n\16\n}\3\13\3\13\3\13\5\13\u0083\n\13\3\13\5\13\u0086"+
      "\n\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u008e\n\r\3\r\2\2\16\2\4\6\b\n\f"+
      "\16\20\22\24\26\30\2\6\3\2 !\4\2\t\t\17\33\3\2\33\34\3\2\35\36\u009a"+
      "\2\32\3\2\2\2\4+\3\2\2\2\6\63\3\2\2\2\bA\3\2\2\2\nE\3\2\2\2\fK\3\2"+
      "\2\2\16W\3\2\2\2\20g\3\2\2\2\22y\3\2\2\2\24\177\3\2\2\2\26\u0087\3"+
      "\2\2\2\30\u008d\3\2\2\2\32\36\5\4\3\2\33\35\5\26\f\2\34\33\3\2\2\2"+
      "\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!"+
      "%\5\6\4\2\"$\5\b\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3"+
      "\2\2\2\'%\3\2\2\2()\5\24\13\2)*\7\2\2\3*\3\3\2\2\2+-\7\3\2\2,.\7 "+
      "\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62"+
      "\5\30\r\2\62\5\3\2\2\2\63\65\7\4\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66"+
      "\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\30\r\2:\7\3\2"+
      "\2\2;B\5\n\6\2<B\5\f\7\2=B\5\16\b\2>B\5\20\t\2?B\5\22\n\2@B\5\26\f"+
      "\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BC\3"+
      "\2\2\2CD\5\30\r\2D\t\3\2\2\2EG\7\5\2\2FH\7!\2\2GF\3\2\2\2HI\3\2\2"+
      "\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KM\7\6\2\2LN\7 \2\2ML\3\2\2\2NO"+
      "\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\7\2\2RT\7 \2\2SR\3\2\2"+
      "\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2We\7\b\2\2Xf\7\t\2\2Yf"+
      "\7\n\2\2Z\\\7 \2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2"+
      "\2\2_a\7\7\2\2`b\7 \2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2df"+
      "\3\2\2\2eX\3\2\2\2eY\3\2\2\2e[\3\2\2\2f\17\3\2\2\2gi\7\13\2\2hj\7"+
      " \2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\7\2\2"+
      "np\7 \2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\f"+
      "\2\2tv\7 \2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2"+
      "y{\7\r\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3"+
      "\2\2\2\177\u0080\7\16\2\2\u0080\u0082\t\3\2\2\u0081\u0083\t\4\2\2"+
      "\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
      "\u0086\t\5\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3"+
      "\2\2\2\u0087\u0088\7\37\2\2\u0088\u0089\7!\2\2\u0089\u008a\7\"\2\2"+
      "\u008a\27\3\2\2\2\u008b\u008e\5\26\f\2\u008c\u008e\7\"\2\2\u008d\u008b"+
      "\3\2\2\2\u008d\u008c\3\2\2\2\u008e\31\3\2\2\2\24\36%/\67AIOU]cekq"+
      "w}\u0082\u0085\u008d";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}