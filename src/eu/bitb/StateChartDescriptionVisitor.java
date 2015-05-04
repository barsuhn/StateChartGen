// Generated from /Users/bernd/Projekte/Antlr/V4/StateChartGen/Antlr/StateChartDescription.g4 by ANTLR 4.5
package eu.bitb;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateChartDescriptionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateChartDescriptionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull StateChartDescriptionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull StateChartDescriptionParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(@NotNull StateChartDescriptionParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#event_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_def(@NotNull StateChartDescriptionParser.Event_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull StateChartDescriptionParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#state_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_def(@NotNull StateChartDescriptionParser.State_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans(@NotNull StateChartDescriptionParser.TransContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#source_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_expr(@NotNull StateChartDescriptionParser.Source_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#dest_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDest_id(@NotNull StateChartDescriptionParser.Dest_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#event_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expr(@NotNull StateChartDescriptionParser.Event_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_expr(@NotNull StateChartDescriptionParser.Guard_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#action_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_expr(@NotNull StateChartDescriptionParser.Action_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateChartDescriptionParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expr(@NotNull StateChartDescriptionParser.Boolean_exprContext ctx);
}