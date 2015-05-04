// Generated from /Users/bernd/Projekte/Antlr/V4/StateChartGen/Antlr/StateChartDescription.g4 by ANTLR 4.5
package eu.bitb;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateChartDescriptionParser}.
 */
public interface StateChartDescriptionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull StateChartDescriptionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull StateChartDescriptionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull StateChartDescriptionParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull StateChartDescriptionParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull StateChartDescriptionParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull StateChartDescriptionParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#event_def}.
	 * @param ctx the parse tree
	 */
	void enterEvent_def(@NotNull StateChartDescriptionParser.Event_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#event_def}.
	 * @param ctx the parse tree
	 */
	void exitEvent_def(@NotNull StateChartDescriptionParser.Event_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull StateChartDescriptionParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull StateChartDescriptionParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#state_def}.
	 * @param ctx the parse tree
	 */
	void enterState_def(@NotNull StateChartDescriptionParser.State_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#state_def}.
	 * @param ctx the parse tree
	 */
	void exitState_def(@NotNull StateChartDescriptionParser.State_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#trans}.
	 * @param ctx the parse tree
	 */
	void enterTrans(@NotNull StateChartDescriptionParser.TransContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#trans}.
	 * @param ctx the parse tree
	 */
	void exitTrans(@NotNull StateChartDescriptionParser.TransContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#source_expr}.
	 * @param ctx the parse tree
	 */
	void enterSource_expr(@NotNull StateChartDescriptionParser.Source_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#source_expr}.
	 * @param ctx the parse tree
	 */
	void exitSource_expr(@NotNull StateChartDescriptionParser.Source_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#dest_id}.
	 * @param ctx the parse tree
	 */
	void enterDest_id(@NotNull StateChartDescriptionParser.Dest_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#dest_id}.
	 * @param ctx the parse tree
	 */
	void exitDest_id(@NotNull StateChartDescriptionParser.Dest_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#event_expr}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expr(@NotNull StateChartDescriptionParser.Event_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#event_expr}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expr(@NotNull StateChartDescriptionParser.Event_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterGuard_expr(@NotNull StateChartDescriptionParser.Guard_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitGuard_expr(@NotNull StateChartDescriptionParser.Guard_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#action_expr}.
	 * @param ctx the parse tree
	 */
	void enterAction_expr(@NotNull StateChartDescriptionParser.Action_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#action_expr}.
	 * @param ctx the parse tree
	 */
	void exitAction_expr(@NotNull StateChartDescriptionParser.Action_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateChartDescriptionParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expr(@NotNull StateChartDescriptionParser.Boolean_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateChartDescriptionParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expr(@NotNull StateChartDescriptionParser.Boolean_exprContext ctx);
}