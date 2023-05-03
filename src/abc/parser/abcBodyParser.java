// Generated from abcBody.g4 by ANTLR 4.5.1

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
public class abcBodyParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, 
    T__30=31, T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, DIGIT=37, 
    STRING=38, NEWLINE=39, SPACES=40;
  public static final int
    RULE_root = 0, RULE_abcline = 1, RULE_element = 2, RULE_noteelement = 3, 
    RULE_note = 4, RULE_noteorrest = 5, RULE_pitch = 6, RULE_octave = 7, 
    RULE_notelength = 8, RULE_accidental = 9, RULE_basenote = 10, RULE_rest = 11, 
    RULE_tupletelement = 12, RULE_tupletspec = 13, RULE_multinote = 14, 
    RULE_barline = 15, RULE_nthrepeat = 16, RULE_fieldvoice = 17, RULE_comment = 18, 
    RULE_endofline = 19;
  public static final String[] ruleNames = {
    "root", "abcline", "element", "noteelement", "note", "noteorrest", "pitch", 
    "octave", "notelength", "accidental", "basenote", "rest", "tupletelement", 
    "tupletspec", "multinote", "barline", "nthrepeat", "fieldvoice", "comment", 
    "endofline"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'^'", "'^^'", "'_'", "'__'", "'='", "'C'", 
    "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'c'", "'d'", "'e'", "'f'", 
    "'g'", "'a'", "'b'", "'z'", "'('", "'['", "']'", "'|'", "'||'", "'[|'", 
    "'|]'", "':|'", "'|:'", "'[1'", "'[2'", "'V:'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, "DIGIT", "STRING", "NEWLINE", "SPACES"
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
  public String getGrammarFileName() { return "abcBody.g4"; }

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

  public abcBodyParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(abcBodyParser.EOF, 0); }
    public List<AbclineContext> abcline() {
      return getRuleContexts(AbclineContext.class);
    }
    public AbclineContext abcline(int i) {
      return getRuleContext(AbclineContext.class,i);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(41); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(40);
        abcline();
        }
        }
        setState(43); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << NEWLINE))) != 0) );
      setState(45);
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

  public static class AbclineContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public AbclineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abcline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterAbcline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitAbcline(this);
    }
  }

  public final AbclineContext abcline() throws RecognitionException {
    AbclineContext _localctx = new AbclineContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_abcline);
    int _la;
    try {
      setState(56);
      switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(50);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
          {
          {
          setState(47);
          element();
          }
          }
          setState(52);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(53);
        endofline();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(54);
        fieldvoice();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(55);
        comment();
        }
        break;
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

  public static class ElementContext extends ParserRuleContext {
    public NoteelementContext noteelement() {
      return getRuleContext(NoteelementContext.class,0);
    }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public BarlineContext barline() {
      return getRuleContext(BarlineContext.class,0);
    }
    public NthrepeatContext nthrepeat() {
      return getRuleContext(NthrepeatContext.class,0);
    }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_element);
    try {
      setState(62);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__24:
        enterOuterAlt(_localctx, 1);
        {
        setState(58);
        noteelement();
        }
        break;
      case T__23:
        enterOuterAlt(_localctx, 2);
        {
        setState(59);
        tupletelement();
        }
        break;
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
        enterOuterAlt(_localctx, 3);
        {
        setState(60);
        barline();
        }
        break;
      case T__32:
      case T__33:
        enterOuterAlt(_localctx, 4);
        {
        setState(61);
        nthrepeat();
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

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NoteelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_noteelement);
    try {
      setState(66);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
        enterOuterAlt(_localctx, 1);
        {
        setState(64);
        note();
        }
        break;
      case T__24:
        enterOuterAlt(_localctx, 2);
        {
        setState(65);
        multinote();
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

  public static class NoteContext extends ParserRuleContext {
    public NoteorrestContext noteorrest() {
      return getRuleContext(NoteorrestContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
      noteorrest();
      setState(70);
      switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
      case 1:
        {
        setState(69);
        notelength();
        }
        break;
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

  public static class NoteorrestContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteorrestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteorrest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterNoteorrest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitNoteorrest(this);
    }
  }

  public final NoteorrestContext noteorrest() throws RecognitionException {
    NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_noteorrest);
    try {
      setState(74);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case T__12:
      case T__13:
      case T__14:
      case T__15:
      case T__16:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
        enterOuterAlt(_localctx, 1);
        {
        setState(72);
        pitch();
        }
        break;
      case T__22:
        enterOuterAlt(_localctx, 2);
        {
        setState(73);
        rest();
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

  public static class PitchContext extends ParserRuleContext {
    public BasenoteContext basenote() {
      return getRuleContext(BasenoteContext.class,0);
    }
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
    public OctaveContext octave() {
      return getRuleContext(OctaveContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(77);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
        {
        setState(76);
        accidental();
        }
      }

      setState(79);
      basenote();
      setState(81);
      _la = _input.LA(1);
      if (_la==T__0 || _la==T__1) {
        {
        setState(80);
        octave();
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

  public static class OctaveContext extends ParserRuleContext {
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_octave);
    int _la;
    try {
      setState(93);
      switch (_input.LA(1)) {
      case T__0:
        enterOuterAlt(_localctx, 1);
        {
        setState(84); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(83);
          match(T__0);
          }
          }
          setState(86); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__0 );
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(89); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(88);
          match(T__1);
          }
          }
          setState(91); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__1 );
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(abcBodyParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcBodyParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(100);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(96); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(95);
          match(DIGIT);
          }
          }
          setState(98); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(110);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(102);
        match(T__2);
        setState(108);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(104); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(103);
            match(DIGIT);
            }
            }
            setState(106); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
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

  public static class AccidentalContext extends ParserRuleContext {
    public AccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

  public static class BasenoteContext extends ParserRuleContext {
    public BasenoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basenote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterBasenote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitBasenote(this);
    }
  }

  public final BasenoteContext basenote() throws RecognitionException {
    BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_basenote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(114);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

  public static class RestContext extends ParserRuleContext {
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(T__22);
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

  public static class TupletelementContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(118);
      tupletspec();
      setState(120); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(119);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(122); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,17,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(abcBodyParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(124);
      match(T__23);
      setState(125);
      match(DIGIT);
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

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(127);
      match(T__24);
      setState(129); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(128);
        note();
        }
        }
        setState(131); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) );
      setState(133);
      match(T__25);
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

  public static class BarlineContext extends ParserRuleContext {
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_barline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(135);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

  public static class NthrepeatContext extends ParserRuleContext {
    public NthrepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_nthrepeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterNthrepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitNthrepeat(this);
    }
  }

  public final NthrepeatContext nthrepeat() throws RecognitionException {
    NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_nthrepeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(137);
      _la = _input.LA(1);
      if ( !(_la==T__32 || _la==T__33) ) {
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

  public static class FieldvoiceContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> STRING() { return getTokens(abcBodyParser.STRING); }
    public TerminalNode STRING(int i) {
      return getToken(abcBodyParser.STRING, i);
    }
    public List<TerminalNode> DIGIT() { return getTokens(abcBodyParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(abcBodyParser.DIGIT, i);
    }
    public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterFieldvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitFieldvoice(this);
    }
  }

  public final FieldvoiceContext fieldvoice() throws RecognitionException {
    FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(139);
      match(T__34);
      setState(141); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(140);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(143); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
      setState(145);
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

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(abcBodyParser.STRING, 0); }
    public TerminalNode NEWLINE() { return getToken(abcBodyParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(147);
      match(T__35);
      setState(148);
      match(STRING);
      setState(149);
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
    public TerminalNode NEWLINE() { return getToken(abcBodyParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_endofline);
    try {
      setState(153);
      switch (_input.LA(1)) {
      case T__35:
        enterOuterAlt(_localctx, 1);
        {
        setState(151);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(152);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u009e\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2"+
      "\3\2\3\3\7\3\63\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4"+
      "\3\4\3\4\5\4A\n\4\3\5\3\5\5\5E\n\5\3\6\3\6\5\6I\n\6\3\7\3\7\5\7M\n"+
      "\7\3\b\5\bP\n\b\3\b\3\b\5\bT\n\b\3\t\6\tW\n\t\r\t\16\tX\3\t\6\t\\"+
      "\n\t\r\t\16\t]\5\t`\n\t\3\n\6\nc\n\n\r\n\16\nd\5\ng\n\n\3\n\3\n\6"+
      "\nk\n\n\r\n\16\nl\5\no\n\n\5\nq\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
      "\3\16\6\16{\n\16\r\16\16\16|\3\17\3\17\3\17\3\20\3\20\6\20\u0084\n"+
      "\20\r\20\16\20\u0085\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23"+
      "\u0090\n\23\r\23\16\23\u0091\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
      "\25\5\25\u009c\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
      "\36 \"$&(\2\7\3\2\6\n\3\2\13\30\3\2\35\"\3\2#$\3\2\'(\u00a1\2+\3\2"+
      "\2\2\4:\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fL\3\2\2\2\16O\3"+
      "\2\2\2\20_\3\2\2\2\22f\3\2\2\2\24r\3\2\2\2\26t\3\2\2\2\30v\3\2\2\2"+
      "\32x\3\2\2\2\34~\3\2\2\2\36\u0081\3\2\2\2 \u0089\3\2\2\2\"\u008b\3"+
      "\2\2\2$\u008d\3\2\2\2&\u0095\3\2\2\2(\u009b\3\2\2\2*,\5\4\3\2+*\3"+
      "\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3"+
      "\2\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64"+
      "\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67;\5(\25\28;\5$\23\29;\5"+
      "&\24\2:\64\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<A\5\b\5\2=A\5\32"+
      "\16\2>A\5 \21\2?A\5\"\22\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2"+
      "A\7\3\2\2\2BE\5\n\6\2CE\5\36\20\2DB\3\2\2\2DC\3\2\2\2E\t\3\2\2\2F"+
      "H\5\f\7\2GI\5\22\n\2HG\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JM\5\16\b\2KM"+
      "\5\30\r\2LJ\3\2\2\2LK\3\2\2\2M\r\3\2\2\2NP\5\24\13\2ON\3\2\2\2OP\3"+
      "\2\2\2PQ\3\2\2\2QS\5\26\f\2RT\5\20\t\2SR\3\2\2\2ST\3\2\2\2T\17\3\2"+
      "\2\2UW\7\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y`\3\2\2\2Z"+
      "\\\7\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_V\3"+
      "\2\2\2_[\3\2\2\2`\21\3\2\2\2ac\7\'\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
      "\2de\3\2\2\2eg\3\2\2\2fb\3\2\2\2fg\3\2\2\2gp\3\2\2\2hn\7\5\2\2ik\7"+
      "\'\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nj\3\2\2\2"+
      "no\3\2\2\2oq\3\2\2\2ph\3\2\2\2pq\3\2\2\2q\23\3\2\2\2rs\t\2\2\2s\25"+
      "\3\2\2\2tu\t\3\2\2u\27\3\2\2\2vw\7\31\2\2w\31\3\2\2\2xz\5\34\17\2"+
      "y{\5\b\5\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\33\3\2\2\2~\177"+
      "\7\32\2\2\177\u0080\7\'\2\2\u0080\35\3\2\2\2\u0081\u0083\7\33\2\2"+
      "\u0082\u0084\5\n\6\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
      "\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
      "\7\34\2\2\u0088\37\3\2\2\2\u0089\u008a\t\4\2\2\u008a!\3\2\2\2\u008b"+
      "\u008c\t\5\2\2\u008c#\3\2\2\2\u008d\u008f\7%\2\2\u008e\u0090\t\6\2"+
      "\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
      "\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5(\25\2\u0094%\3\2"+
      "\2\2\u0095\u0096\7&\2\2\u0096\u0097\7(\2\2\u0097\u0098\7)\2\2\u0098"+
      "\'\3\2\2\2\u0099\u009c\5&\24\2\u009a\u009c\7)\2\2\u009b\u0099\3\2"+
      "\2\2\u009b\u009a\3\2\2\2\u009c)\3\2\2\2\27-\64:@DHLOSX]_dflnp|\u0085"+
      "\u0091\u009b";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}