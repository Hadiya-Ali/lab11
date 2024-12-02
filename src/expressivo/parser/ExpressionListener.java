// Generated from Expression.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ExpressionParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(ExpressionParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(ExpressionParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#expression}.
   * @param ctx the parse tree
   */
  void enterExpression(ExpressionParser.ExpressionContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#expression}.
   * @param ctx the parse tree
   */
  void exitExpression(ExpressionParser.ExpressionContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#addition}.
   * @param ctx the parse tree
   */
  void enterAddition(ExpressionParser.AdditionContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#addition}.
   * @param ctx the parse tree
   */
  void exitAddition(ExpressionParser.AdditionContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#multiplication}.
   * @param ctx the parse tree
   */
  void enterMultiplication(ExpressionParser.MultiplicationContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#multiplication}.
   * @param ctx the parse tree
   */
  void exitMultiplication(ExpressionParser.MultiplicationContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#factor}.
   * @param ctx the parse tree
   */
  void enterFactor(ExpressionParser.FactorContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#factor}.
   * @param ctx the parse tree
   */
  void exitFactor(ExpressionParser.FactorContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#variable}.
   * @param ctx the parse tree
   */
  void enterVariable(ExpressionParser.VariableContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#variable}.
   * @param ctx the parse tree
   */
  void exitVariable(ExpressionParser.VariableContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#exponent}.
   * @param ctx the parse tree
   */
  void enterExponent(ExpressionParser.ExponentContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#exponent}.
   * @param ctx the parse tree
   */
  void exitExponent(ExpressionParser.ExponentContext ctx);
}