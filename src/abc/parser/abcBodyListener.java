// Generated from abcBody.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link abcBodyParser}.
 */
public interface abcBodyListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link abcBodyParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(abcBodyParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(abcBodyParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#abcline}.
   * @param ctx the parse tree
   */
  void enterAbcline(abcBodyParser.AbclineContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#abcline}.
   * @param ctx the parse tree
   */
  void exitAbcline(abcBodyParser.AbclineContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(abcBodyParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(abcBodyParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(abcBodyParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(abcBodyParser.NoteelementContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(abcBodyParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(abcBodyParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#noteorrest}.
   * @param ctx the parse tree
   */
  void enterNoteorrest(abcBodyParser.NoteorrestContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#noteorrest}.
   * @param ctx the parse tree
   */
  void exitNoteorrest(abcBodyParser.NoteorrestContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(abcBodyParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(abcBodyParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(abcBodyParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(abcBodyParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(abcBodyParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(abcBodyParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(abcBodyParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(abcBodyParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#basenote}.
   * @param ctx the parse tree
   */
  void enterBasenote(abcBodyParser.BasenoteContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#basenote}.
   * @param ctx the parse tree
   */
  void exitBasenote(abcBodyParser.BasenoteContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(abcBodyParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(abcBodyParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(abcBodyParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(abcBodyParser.TupletelementContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(abcBodyParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(abcBodyParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(abcBodyParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(abcBodyParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(abcBodyParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(abcBodyParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void enterNthrepeat(abcBodyParser.NthrepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void exitNthrepeat(abcBodyParser.NthrepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void enterFieldvoice(abcBodyParser.FieldvoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void exitFieldvoice(abcBodyParser.FieldvoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link abcBodyParser#endofline}.
   * @param ctx the parse tree
   */
  void enterEndofline(abcBodyParser.EndoflineContext ctx);
  /**
   * Exit a parse tree produced by {@link abcBodyParser#endofline}.
   * @param ctx the parse tree
   */
  void exitEndofline(abcBodyParser.EndoflineContext ctx);
}