// Generated from /Users/bernd/Projekte/Antlr/V4/StateChartGen/Antlr/StateChartDescription.g4 by ANTLR 4.5
package eu.bitb;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateChartDescriptionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, FLOAT=14, INT=15, BOOL=16, COMMENT=17, 
		LINE_COMMENT=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "ID", "FLOAT", "INT", "BOOL", "COMMENT", "LINE_COMMENT", 
		"WS", "EXP", "DIGIT", "NZDIGIT", "TRUE", "FALSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'out'", "'event'", "';'", "'{'", "'}'", "'state'", "'+'", 
		"'['", "']'", "'/'", "'-->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "FLOAT", "INT", "BOOL", "COMMENT", "LINE_COMMENT", "WS"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StateChartDescriptionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateChartDescription.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3\17\5\17a\n\17"+
		"\3\17\6\17d\n\17\r\17\16\17e\3\17\3\17\7\17j\n\17\f\17\16\17m\13\17\3"+
		"\17\5\17p\n\17\3\17\5\17s\n\17\3\17\3\17\6\17w\n\17\r\17\16\17x\3\17\5"+
		"\17|\n\17\3\17\5\17\177\n\17\3\17\6\17\u0082\n\17\r\17\16\17\u0083\3\17"+
		"\3\17\5\17\u0088\n\17\3\20\3\20\3\20\7\20\u008d\n\20\f\20\16\20\u0090"+
		"\13\20\5\20\u0092\n\20\3\21\3\21\5\21\u0096\n\21\3\22\3\22\3\22\3\22\7"+
		"\22\u009c\n\22\f\22\16\22\u009f\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u00aa\n\23\f\23\16\23\u00ad\13\23\3\23\3\23\3\23\3"+
		"\23\3\24\6\24\u00b4\n\24\r\24\16\24\u00b5\3\24\3\24\3\25\3\25\5\25\u00bc"+
		"\n\25\3\25\6\25\u00bf\n\25\r\25\16\25\u00c0\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\u009d\2\32\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\2+\2-\2/\2\61\2\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f"+
		"\5\2\13\f\17\17\"\"\4\2GGgg\4\2--//\3\2\62;\3\2\63;\u00df\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\7:\3\2\2\2\t@\3\2\2\2\13B\3\2"+
		"\2\2\rD\3\2\2\2\17F\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27R\3"+
		"\2\2\2\31T\3\2\2\2\33X\3\2\2\2\35\u0087\3\2\2\2\37\u0091\3\2\2\2!\u0095"+
		"\3\2\2\2#\u0097\3\2\2\2%\u00a5\3\2\2\2\'\u00b3\3\2\2\2)\u00b9\3\2\2\2"+
		"+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00cb\3\2\2\2\63\64\7"+
		"k\2\2\64\65\7p\2\2\65\4\3\2\2\2\66\67\7q\2\2\678\7w\2\289\7v\2\29\6\3"+
		"\2\2\2:;\7g\2\2;<\7x\2\2<=\7g\2\2=>\7p\2\2>?\7v\2\2?\b\3\2\2\2@A\7=\2"+
		"\2A\n\3\2\2\2BC\7}\2\2C\f\3\2\2\2DE\7\177\2\2E\16\3\2\2\2FG\7u\2\2GH\7"+
		"v\2\2HI\7c\2\2IJ\7v\2\2JK\7g\2\2K\20\3\2\2\2LM\7-\2\2M\22\3\2\2\2NO\7"+
		"]\2\2O\24\3\2\2\2PQ\7_\2\2Q\26\3\2\2\2RS\7\61\2\2S\30\3\2\2\2TU\7/\2\2"+
		"UV\7/\2\2VW\7@\2\2W\32\3\2\2\2X\\\t\2\2\2Y[\t\3\2\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\34\3\2\2\2^\\\3\2\2\2_a\7/\2\2`_\3\2\2\2`a\3"+
		"\2\2\2ac\3\2\2\2bd\5+\26\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gk\7\60\2\2hj\5+\26\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo"+
		"\3\2\2\2mk\3\2\2\2np\5)\25\2on\3\2\2\2op\3\2\2\2p\u0088\3\2\2\2qs\7/\2"+
		"\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7\60\2\2uw\5+\26\2vu\3\2\2\2wx\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5)\25\2{z\3\2\2\2{|\3\2\2\2|\u0088"+
		"\3\2\2\2}\177\7/\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082"+
		"\5+\26\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5)\25\2\u0086\u0088\3\2"+
		"\2\2\u0087`\3\2\2\2\u0087r\3\2\2\2\u0087~\3\2\2\2\u0088\36\3\2\2\2\u0089"+
		"\u0092\7\62\2\2\u008a\u008e\5-\27\2\u008b\u008d\5+\26\2\u008c\u008b\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2"+
		"\2\2\u0092 \3\2\2\2\u0093\u0096\5/\30\2\u0094\u0096\5\61\31\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096\"\3\2\2\2\u0097\u0098\7\61\2\2\u0098"+
		"\u0099\7,\2\2\u0099\u009d\3\2\2\2\u009a\u009c\13\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\22\2\2\u00a4$\3\2\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\4\2\2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\f\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\b\23\2\2\u00b1&\3\2\2\2\u00b2\u00b4\t\5\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\24\2\2\u00b8(\3\2\2\2\u00b9"+
		"\u00bb\t\6\2\2\u00ba\u00bc\t\7\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5+\26\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1*\3\2\2\2"+
		"\u00c2\u00c3\t\b\2\2\u00c3,\3\2\2\2\u00c4\u00c5\t\t\2\2\u00c5.\3\2\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\62\3\2\2\2\26\2\\"+
		"`ekorx{~\u0083\u0087\u008e\u0091\u0095\u009d\u00ab\u00b5\u00bb\u00c0\3"+
		"\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}