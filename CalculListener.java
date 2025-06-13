// Generated from Calcul.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculParser}.
 */
public interface CalculListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculParser.FinInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalculParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalculParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(CalculParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(CalculParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(CalculParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(CalculParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#boucleWhile}.
	 * @param ctx the parse tree
	 */
	void enterBoucleWhile(CalculParser.BoucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#boucleWhile}.
	 * @param ctx the parse tree
	 */
	void exitBoucleWhile(CalculParser.BoucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#boucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBoucleFor(CalculParser.BoucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#boucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBoucleFor(CalculParser.BoucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CalculParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CalculParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CalculParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CalculParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(CalculParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(CalculParser.FonctionContext ctx);
}