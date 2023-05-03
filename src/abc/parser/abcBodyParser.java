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
    TUPLETSPEC=10, NTHREPEAT=11, NOTELENGTH=12, BODYVOICE=13, COMMENT=14, 
    ACCIDENTAL=15, BASENOTE=16, OCTAVE=17, DIGIT=18, NEWLINE=19, WHITESPACE=20;
  public static final int
    RULE_root = 0, RULE_abcline = 1, RULE_element = 2, RULE_noteelement = 3, 
    RULE_note = 4, RULE_noteorrest = 5, RULE_pitch = 6, RULE_octave = 7, 
    RULE_notelength = 8, RULE_accidental = 9, RULE_basenote = 10, RULE_rest = 11, 
    RULE_tupletelement = 12, RULE_tupletspec = 13, RULE_multinote = 14, 
    RULE_barline = 15, RULE_nthrepeat = 16, RULE_fieldvoice = 17, RULE_endofline = 18;
  public static final String[] ruleNames = {
    "root", "abcline", "element", "noteelement", "note", "noteorrest", "pitch", 
    "octave", "notelength", "accidental", "basenote", "rest", "tupletelement", 
    "tupletspec", "multinote", "barline", "nthrepeat", "fieldvoice", "endofline"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'z'", "'['", "']'", "'|'", "'||'", "'[|'", "'|]'", "':|'", "'|:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, "TUPLETSPEC", 
    "NTHREPEAT", "NOTELENGTH", "BODYVOICE", "COMMENT", "ACCIDENTAL", "BASENOTE", 
    "OCTAVE", "DIGIT", "NEWLINE", "WHITESPACE"
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
      setState(39); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(38);
        abcline();
        }
        }
        setState(41); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << TUPLETSPEC) | (1L << NTHREPEAT) | (1L << BODYVOICE) | (1L << COMMENT) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
      setState(43);
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
    public TerminalNode COMMENT() { return getToken(abcBodyParser.COMMENT, 0); }
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
      setState(54);
      switch (_input.LA(1)) {
      case T__0:
      case T__1:
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case TUPLETSPEC:
      case NTHREPEAT:
      case ACCIDENTAL:
      case BASENOTE:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(46); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(45);
          element();
          }
          }
          setState(48); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << TUPLETSPEC) | (1L << NTHREPEAT) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
        setState(50);
        endofline();
        }
        break;
      case BODYVOICE:
        enterOuterAlt(_localctx, 2);
        {
        setState(52);
        fieldvoice();
        }
        break;
      case COMMENT:
        enterOuterAlt(_localctx, 3);
        {
        setState(53);
        match(COMMENT);
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
    public TerminalNode WHITESPACE() { return getToken(abcBodyParser.WHITESPACE, 0); }
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
      setState(61);
      switch (_input.LA(1)) {
      case T__0:
      case T__1:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(56);
        noteelement();
        }
        break;
      case TUPLETSPEC:
        enterOuterAlt(_localctx, 2);
        {
        setState(57);
        tupletelement();
        }
        break;
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
        enterOuterAlt(_localctx, 3);
        {
        setState(58);
        barline();
        }
        break;
      case NTHREPEAT:
        enterOuterAlt(_localctx, 4);
        {
        setState(59);
        nthrepeat();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(60);
        match(WHITESPACE);
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
      setState(65);
      switch (_input.LA(1)) {
      case T__0:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(63);
        note();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(64);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      noteorrest();
      setState(69);
      _la = _input.LA(1);
      if (_la==NOTELENGTH) {
        {
        setState(68);
        notelength();
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
      setState(73);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(71);
        pitch();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 2);
        {
        setState(72);
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
      setState(76);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(75);
        accidental();
        }
      }

      setState(78);
      basenote();
      setState(80);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(79);
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
    public TerminalNode OCTAVE() { return getToken(abcBodyParser.OCTAVE, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82);
      match(OCTAVE);
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
    public TerminalNode NOTELENGTH() { return getToken(abcBodyParser.NOTELENGTH, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(84);
      match(NOTELENGTH);
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
    public TerminalNode ACCIDENTAL() { return getToken(abcBodyParser.ACCIDENTAL, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(86);
      match(ACCIDENTAL);
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
    public TerminalNode BASENOTE() { return getToken(abcBodyParser.BASENOTE, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(88);
      match(BASENOTE);
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
      setState(90);
      match(T__0);
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
      setState(92);
      tupletspec();
      setState(94); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(93);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(96); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
    public TerminalNode TUPLETSPEC() { return getToken(abcBodyParser.TUPLETSPEC, 0); }
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
      setState(98);
      match(TUPLETSPEC);
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
      setState(100);
      match(T__1);
      setState(102); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(101);
        note();
        }
        }
        setState(104); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(106);
      match(T__2);
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
      setState(108);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
    public TerminalNode NTHREPEAT() { return getToken(abcBodyParser.NTHREPEAT, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(110);
      match(NTHREPEAT);
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
    public TerminalNode BODYVOICE() { return getToken(abcBodyParser.BODYVOICE, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      match(BODYVOICE);
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
    enterRule(_localctx, 36, RULE_endofline);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(114);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26w\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
      "\t\22\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\6\3\61"+
      "\n\3\r\3\16\3\62\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\5\4"+
      "@\n\4\3\5\3\5\5\5D\n\5\3\6\3\6\5\6H\n\6\3\7\3\7\5\7L\n\7\3\b\5\bO"+
      "\n\b\3\b\3\b\5\bS\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
      "\16\3\16\6\16a\n\16\r\16\16\16b\3\17\3\17\3\20\3\20\6\20i\n\20\r\20"+
      "\16\20j\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2"+
      "\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\6\13r\2)\3"+
      "\2\2\2\48\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fK\3\2\2\2\16N"+
      "\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30\\\3\2"+
      "\2\2\32^\3\2\2\2\34d\3\2\2\2\36f\3\2\2\2 n\3\2\2\2\"p\3\2\2\2$r\3"+
      "\2\2\2&t\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2"+
      ",-\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\61\5\6\4\2\60/\3\2\2\2\61\62\3\2"+
      "\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\5&\24\2\659\3"+
      "\2\2\2\669\5$\23\2\679\7\20\2\28\60\3\2\2\28\66\3\2\2\28\67\3\2\2"+
      "\29\5\3\2\2\2:@\5\b\5\2;@\5\32\16\2<@\5 \21\2=@\5\"\22\2>@\7\26\2"+
      "\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AD"+
      "\5\n\6\2BD\5\36\20\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EG\5\f\7\2FH\5"+
      "\22\n\2GF\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IL\5\16\b\2JL\5\30\r\2KI\3"+
      "\2\2\2KJ\3\2\2\2L\r\3\2\2\2MO\5\24\13\2NM\3\2\2\2NO\3\2\2\2OP\3\2"+
      "\2\2PR\5\26\f\2QS\5\20\t\2RQ\3\2\2\2RS\3\2\2\2S\17\3\2\2\2TU\7\23"+
      "\2\2U\21\3\2\2\2VW\7\16\2\2W\23\3\2\2\2XY\7\21\2\2Y\25\3\2\2\2Z[\7"+
      "\22\2\2[\27\3\2\2\2\\]\7\3\2\2]\31\3\2\2\2^`\5\34\17\2_a\5\b\5\2`"+
      "_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\33\3\2\2\2de\7\f\2\2e\35"+
      "\3\2\2\2fh\7\4\2\2gi\5\n\6\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
      "\2kl\3\2\2\2lm\7\5\2\2m\37\3\2\2\2no\t\2\2\2o!\3\2\2\2pq\7\r\2\2q"+
      "#\3\2\2\2rs\7\17\2\2s%\3\2\2\2tu\7\25\2\2u\'\3\2\2\2\r+\628?CGKNR"+
      "bj";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}