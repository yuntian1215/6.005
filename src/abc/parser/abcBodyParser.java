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
    RULE_barline = 15, RULE_nthrepeat = 16, RULE_midtunefield = 17, RULE_fieldvoice = 18, 
    RULE_comment = 19, RULE_endofline = 20;
  public static final String[] ruleNames = {
    "root", "abcline", "element", "noteelement", "note", "noteorrest", "pitch", 
    "octave", "notelength", "accidental", "basenote", "rest", "tupletelement", 
    "tupletspec", "multinote", "barline", "nthrepeat", "midtunefield", "fieldvoice", 
    "comment", "endofline"
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
      setState(43); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(42);
        abcline();
        }
        }
        setState(45); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << NEWLINE))) != 0) );
      setState(47);
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
    public TerminalNode NEWLINE() { return getToken(abcBodyParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public MidtunefieldContext midtunefield() {
      return getRuleContext(MidtunefieldContext.class,0);
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
      setState(58);
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
      case T__23:
      case T__24:
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
      case T__32:
      case T__33:
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(52);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
          {
          {
          setState(49);
          element();
          }
          }
          setState(54);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(55);
        match(NEWLINE);
        }
        break;
      case T__34:
        enterOuterAlt(_localctx, 2);
        {
        setState(56);
        midtunefield();
        }
        break;
      case T__35:
        enterOuterAlt(_localctx, 3);
        {
        setState(57);
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
      setState(64);
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
        setState(60);
        noteelement();
        }
        break;
      case T__23:
        enterOuterAlt(_localctx, 2);
        {
        setState(61);
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
        setState(62);
        barline();
        }
        break;
      case T__32:
      case T__33:
        enterOuterAlt(_localctx, 4);
        {
        setState(63);
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
      setState(68);
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
        setState(66);
        note();
        }
        break;
      case T__24:
        enterOuterAlt(_localctx, 2);
        {
        setState(67);
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
      setState(70);
      noteorrest();
      setState(72);
      switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
      case 1:
        {
        setState(71);
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
      setState(76);
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
        setState(74);
        pitch();
        }
        break;
      case T__22:
        enterOuterAlt(_localctx, 2);
        {
        setState(75);
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
      setState(79);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
        {
        setState(78);
        accidental();
        }
      }

      setState(81);
      basenote();
      setState(83);
      _la = _input.LA(1);
      if (_la==T__0 || _la==T__1) {
        {
        setState(82);
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
      setState(95);
      switch (_input.LA(1)) {
      case T__0:
        enterOuterAlt(_localctx, 1);
        {
        setState(86); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(85);
          match(T__0);
          }
          }
          setState(88); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__0 );
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(91); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(90);
          match(T__1);
          }
          }
          setState(93); 
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
      setState(102);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(98); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(97);
          match(DIGIT);
          }
          }
          setState(100); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(112);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(104);
        match(T__2);
        setState(110);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(106); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(105);
            match(DIGIT);
            }
            }
            setState(108); 
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
      setState(114);
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
      setState(116);
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
      setState(118);
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
      setState(120);
      tupletspec();
      setState(122); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(121);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(124); 
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
      setState(126);
      match(T__23);
      setState(127);
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
      setState(129);
      match(T__24);
      setState(131); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(130);
        note();
        }
        }
        setState(133); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) );
      setState(135);
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
      setState(137);
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
      setState(139);
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

  public static class MidtunefieldContext extends ParserRuleContext {
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_midtunefield; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).enterMidtunefield(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof abcBodyListener ) ((abcBodyListener)listener).exitMidtunefield(this);
    }
  }

  public final MidtunefieldContext midtunefield() throws RecognitionException {
    MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_midtunefield);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(141);
      fieldvoice();
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
    enterRule(_localctx, 36, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(143);
      match(T__34);
      setState(145); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(144);
        _la = _input.LA(1);
        if ( !(_la==DIGIT || _la==STRING) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(147); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT || _la==STRING );
      setState(149);
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
    enterRule(_localctx, 38, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(151);
      match(T__35);
      setState(152);
      match(STRING);
      setState(153);
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
    enterRule(_localctx, 40, RULE_endofline);
    try {
      setState(157);
      switch (_input.LA(1)) {
      case T__35:
        enterOuterAlt(_localctx, 1);
        {
        setState(155);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(156);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00a2\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2"+
      "\16\2/\3\2\3\2\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\5\3=\n\3"+
      "\3\4\3\4\3\4\3\4\5\4C\n\4\3\5\3\5\5\5G\n\5\3\6\3\6\5\6K\n\6\3\7\3"+
      "\7\5\7O\n\7\3\b\5\bR\n\b\3\b\3\b\5\bV\n\b\3\t\6\tY\n\t\r\t\16\tZ\3"+
      "\t\6\t^\n\t\r\t\16\t_\5\tb\n\t\3\n\6\ne\n\n\r\n\16\nf\5\ni\n\n\3\n"+
      "\3\n\6\nm\n\n\r\n\16\nn\5\nq\n\n\5\ns\n\n\3\13\3\13\3\f\3\f\3\r\3"+
      "\r\3\16\3\16\6\16}\n\16\r\16\16\16~\3\17\3\17\3\17\3\20\3\20\6\20"+
      "\u0086\n\20\r\20\16\20\u0087\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
      "\23\3\24\3\24\6\24\u0094\n\24\r\24\16\24\u0095\3\24\3\24\3\25\3\25"+
      "\3\25\3\25\3\26\3\26\5\26\u00a0\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20"+
      "\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\6\n\3\2\13\30\3\2\35\"\3\2#$"+
      "\3\2\'(\u00a4\2-\3\2\2\2\4<\3\2\2\2\6B\3\2\2\2\bF\3\2\2\2\nH\3\2\2"+
      "\2\fN\3\2\2\2\16Q\3\2\2\2\20a\3\2\2\2\22h\3\2\2\2\24t\3\2\2\2\26v"+
      "\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34\u0080\3\2\2\2\36\u0083\3\2\2\2"+
      " \u008b\3\2\2\2\"\u008d\3\2\2\2$\u008f\3\2\2\2&\u0091\3\2\2\2(\u0099"+
      "\3\2\2\2*\u009f\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60"+
      "\3\2\2\2\60\61\3\2\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63\65\5\6\4\2\64"+
      "\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66"+
      "\3\2\2\29=\7)\2\2:=\5$\23\2;=\5(\25\2<\66\3\2\2\2<:\3\2\2\2<;\3\2"+
      "\2\2=\5\3\2\2\2>C\5\b\5\2?C\5\32\16\2@C\5 \21\2AC\5\"\22\2B>\3\2\2"+
      "\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DG\5\n\6\2EG\5\36\20\2"+
      "FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HJ\5\f\7\2IK\5\22\n\2JI\3\2\2\2JK\3"+
      "\2\2\2K\13\3\2\2\2LO\5\16\b\2MO\5\30\r\2NL\3\2\2\2NM\3\2\2\2O\r\3"+
      "\2\2\2PR\5\24\13\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\5\26\f\2TV\5\20"+
      "\t\2UT\3\2\2\2UV\3\2\2\2V\17\3\2\2\2WY\7\3\2\2XW\3\2\2\2YZ\3\2\2\2"+
      "ZX\3\2\2\2Z[\3\2\2\2[b\3\2\2\2\\^\7\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3"+
      "\2\2\2_`\3\2\2\2`b\3\2\2\2aX\3\2\2\2a]\3\2\2\2b\21\3\2\2\2ce\7\'\2"+
      "\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hd\3\2\2\2hi\3"+
      "\2\2\2ir\3\2\2\2jp\7\5\2\2km\7\'\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
      "no\3\2\2\2oq\3\2\2\2pl\3\2\2\2pq\3\2\2\2qs\3\2\2\2rj\3\2\2\2rs\3\2"+
      "\2\2s\23\3\2\2\2tu\t\2\2\2u\25\3\2\2\2vw\t\3\2\2w\27\3\2\2\2xy\7\31"+
      "\2\2y\31\3\2\2\2z|\5\34\17\2{}\5\b\5\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2"+
      "\2~\177\3\2\2\2\177\33\3\2\2\2\u0080\u0081\7\32\2\2\u0081\u0082\7"+
      "\'\2\2\u0082\35\3\2\2\2\u0083\u0085\7\33\2\2\u0084\u0086\5\n\6\2\u0085"+
      "\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
      "\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\34\2\2\u008a\37\3\2\2\2"+
      "\u008b\u008c\t\4\2\2\u008c!\3\2\2\2\u008d\u008e\t\5\2\2\u008e#\3\2"+
      "\2\2\u008f\u0090\5&\24\2\u0090%\3\2\2\2\u0091\u0093\7%\2\2\u0092\u0094"+
      "\t\6\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2"+
      "\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5*\26\2\u0098"+
      "\'\3\2\2\2\u0099\u009a\7&\2\2\u009a\u009b\7(\2\2\u009b\u009c\7)\2"+
      "\2\u009c)\3\2\2\2\u009d\u00a0\5(\25\2\u009e\u00a0\7)\2\2\u009f\u009d"+
      "\3\2\2\2\u009f\u009e\3\2\2\2\u00a0+\3\2\2\2\27/\66<BFJNQUZ_afhnpr"+
      "~\u0087\u0095\u009f";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}