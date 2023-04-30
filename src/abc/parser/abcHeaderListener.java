// Generated from abcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link abcHeaderParser}.
 */
public interface abcHeaderListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(abcHeaderParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(abcHeaderParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldnumber}.
   * @param ctx the parse tree
   */
  void enterFieldnumber(abcHeaderParser.FieldnumberContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldnumber}.
   * @param ctx the parse tree
   */
  void exitFieldnumber(abcHeaderParser.FieldnumberContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldtitle}.
   * @param ctx the parse tree
   */
  void enterFieldtitle(abcHeaderParser.FieldtitleContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldtitle}.
   * @param ctx the parse tree
   */
  void exitFieldtitle(abcHeaderParser.FieldtitleContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void enterOtherfields(abcHeaderParser.OtherfieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void exitOtherfields(abcHeaderParser.OtherfieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldcomposer}.
   * @param ctx the parse tree
   */
  void enterFieldcomposer(abcHeaderParser.FieldcomposerContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldcomposer}.
   * @param ctx the parse tree
   */
  void exitFieldcomposer(abcHeaderParser.FieldcomposerContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fielddefaultlength}.
   * @param ctx the parse tree
   */
  void enterFielddefaultlength(abcHeaderParser.FielddefaultlengthContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fielddefaultlength}.
   * @param ctx the parse tree
   */
  void exitFielddefaultlength(abcHeaderParser.FielddefaultlengthContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldmeter}.
   * @param ctx the parse tree
   */
  void enterFieldmeter(abcHeaderParser.FieldmeterContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldmeter}.
   * @param ctx the parse tree
   */
  void exitFieldmeter(abcHeaderParser.FieldmeterContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldtempo}.
   * @param ctx the parse tree
   */
  void enterFieldtempo(abcHeaderParser.FieldtempoContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldtempo}.
   * @param ctx the parse tree
   */
  void exitFieldtempo(abcHeaderParser.FieldtempoContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void enterFieldvoice(abcHeaderParser.FieldvoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void exitFieldvoice(abcHeaderParser.FieldvoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#fieldkey}.
   * @param ctx the parse tree
   */
  void enterFieldkey(abcHeaderParser.FieldkeyContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#fieldkey}.
   * @param ctx the parse tree
   */
  void exitFieldkey(abcHeaderParser.FieldkeyContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void enterNotelengthstrict(abcHeaderParser.NotelengthstrictContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void exitNotelengthstrict(abcHeaderParser.NotelengthstrictContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(abcHeaderParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(abcHeaderParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#keynote}.
   * @param ctx the parse tree
   */
  void enterKeynote(abcHeaderParser.KeynoteContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#keynote}.
   * @param ctx the parse tree
   */
  void exitKeynote(abcHeaderParser.KeynoteContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#keyaccidental}.
   * @param ctx the parse tree
   */
  void enterKeyaccidental(abcHeaderParser.KeyaccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#keyaccidental}.
   * @param ctx the parse tree
   */
  void exitKeyaccidental(abcHeaderParser.KeyaccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#modeminor}.
   * @param ctx the parse tree
   */
  void enterModeminor(abcHeaderParser.ModeminorContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#modeminor}.
   * @param ctx the parse tree
   */
  void exitModeminor(abcHeaderParser.ModeminorContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#basenote}.
   * @param ctx the parse tree
   */
  void enterBasenote(abcHeaderParser.BasenoteContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#basenote}.
   * @param ctx the parse tree
   */
  void exitBasenote(abcHeaderParser.BasenoteContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(abcHeaderParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(abcHeaderParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#meterfraction}.
   * @param ctx the parse tree
   */
  void enterMeterfraction(abcHeaderParser.MeterfractionContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#meterfraction}.
   * @param ctx the parse tree
   */
  void exitMeterfraction(abcHeaderParser.MeterfractionContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(abcHeaderParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(abcHeaderParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(abcHeaderParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(abcHeaderParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link abcHeaderParser#endofline}.
   * @param ctx the parse tree
   */
  void enterEndofline(abcHeaderParser.EndoflineContext ctx);
  /**
   * Exit a parse tree produced by {@link abcHeaderParser#endofline}.
   * @param ctx the parse tree
   */
  void exitEndofline(abcHeaderParser.EndoflineContext ctx);
}