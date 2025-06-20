// Generated from Calcul.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		RETURN=39, TYPE=40, TRUE=41, FALSE=42, IDENTIFIANT=43, NEWLINE=44, WS=45, 
		ENTIER=46, DOUBLE=47, BOOL=48, LINE_COMMENT=49, MULTILINE_COMMENT=50, 
		UNMATCH=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "RETURN", "TYPE", "TRUE", 
			"FALSE", "IDENTIFIANT", "NEWLINE", "WS", "ENTIER", "DOUBLE", "BOOL", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'input'", "'('", 
			"')'", "'output'", "'break'", "'continue'", "';'", "'{'", "'}'", "'=='", 
			"'!='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'not'", "'and'", "'or'", 
			"'if'", "'then'", "'else'", "'while'", "'for'", "'-'", "'*'", "'/'", 
			"'%'", "'+'", "'--'", "'++'", "','", "'return'", null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "RETURN", "TYPE", "TRUE", "FALSE", "IDENTIFIANT", "NEWLINE", 
			"WS", "ENTIER", "DOUBLE", "BOOL", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"UNMATCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalculLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calcul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u00fc"+
		"\n)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\7,\u010b\n,\f,\16,\u010e\13"+
		",\3-\5-\u0111\n-\3-\3-\3.\6.\u0116\n.\r.\16.\u0117\3.\3.\3/\6/\u011d\n"+
		"/\r/\16/\u011e\3\60\3\60\3\60\7\60\u0124\n\60\f\60\16\60\u0127\13\60\5"+
		"\60\u0129\n\60\3\61\3\61\5\61\u012d\n\61\3\62\3\62\3\62\3\62\7\62\u0133"+
		"\n\62\f\62\16\62\u0136\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u013e"+
		"\n\63\f\63\16\63\u0141\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\u013f\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0155"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7n\3\2\2"+
		"\2\tq\3\2\2\2\13t\3\2\2\2\rw\3\2\2\2\17z\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u008b\3\2\2\2\31\u0091\3\2\2\2\33\u009a\3"+
		"\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2"+
		"%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ab\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3"+
		"\2\2\2/\u00b3\3\2\2\2\61\u00b7\3\2\2\2\63\u00bb\3\2\2\2\65\u00be\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c6\3\2\2\2;\u00cb\3\2\2\2=\u00d1\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00d9\3\2\2\2E\u00db\3\2\2\2G\u00dd\3\2\2\2I"+
		"\u00df\3\2\2\2K\u00e2\3\2\2\2M\u00e5\3\2\2\2O\u00e7\3\2\2\2Q\u00fb\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0102\3\2\2\2W\u0108\3\2\2\2Y\u0110\3\2\2\2[\u0115"+
		"\3\2\2\2]\u011c\3\2\2\2_\u0120\3\2\2\2a\u012c\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0139\3\2\2\2g\u0147\3\2\2\2ij\7?\2\2j\4\3\2\2\2kl\7-\2\2lm\7?\2\2m\6"+
		"\3\2\2\2no\7/\2\2op\7?\2\2p\b\3\2\2\2qr\7,\2\2rs\7?\2\2s\n\3\2\2\2tu\7"+
		"\61\2\2uv\7?\2\2v\f\3\2\2\2wx\7\'\2\2xy\7?\2\2y\16\3\2\2\2z{\7k\2\2{|"+
		"\7p\2\2|}\7r\2\2}~\7w\2\2~\177\7v\2\2\177\20\3\2\2\2\u0080\u0081\7*\2"+
		"\2\u0081\22\3\2\2\2\u0082\u0083\7+\2\2\u0083\24\3\2\2\2\u0084\u0085\7"+
		"q\2\2\u0085\u0086\7w\2\2\u0086\u0087\7v\2\2\u0087\u0088\7r\2\2\u0088\u0089"+
		"\7w\2\2\u0089\u008a\7v\2\2\u008a\26\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7m\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7w\2\2"+
		"\u0098\u0099\7g\2\2\u0099\32\3\2\2\2\u009a\u009b\7=\2\2\u009b\34\3\2\2"+
		"\2\u009c\u009d\7}\2\2\u009d\36\3\2\2\2\u009e\u009f\7\177\2\2\u009f \3"+
		"\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7?\2\2\u00a2\"\3\2\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4\u00a5\7?\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8"+
		"\7@\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7"+
		"@\2\2\u00ac\u00ad\7?\2\2\u00ad*\3\2\2\2\u00ae\u00af\7>\2\2\u00af,\3\2"+
		"\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7?\2\2\u00b2.\3\2\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7v\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\7c\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7f\2\2\u00ba\62\3\2\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7p\2\2\u00c58\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca:\3\2\2\2\u00cb\u00cc"+
		"\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6@\3\2\2\2\u00d7\u00d8"+
		"\7,\2\2\u00d8B\3\2\2\2\u00d9\u00da\7\61\2\2\u00daD\3\2\2\2\u00db\u00dc"+
		"\7\'\2\2\u00dcF\3\2\2\2\u00dd\u00de\7-\2\2\u00deH\3\2\2\2\u00df\u00e0"+
		"\7/\2\2\u00e0\u00e1\7/\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e4"+
		"\7-\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6N\3\2\2\2\u00e7\u00e8\7"+
		"t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7p\2\2\u00edP\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00fc\7v\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7w\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7n\2\2\u00f6\u00fc\7g\2\2"+
		"\u00f7\u00f8\7d\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fc"+
		"\7n\2\2\u00fb\u00ee\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc"+
		"R\3\2\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7w\2\2\u0100"+
		"\u0101\7g\2\2\u0101T\3\2\2\2\u0102\u0103\7H\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7u\2\2\u0106\u0107\7g\2\2\u0107V\3\2\2\2\u0108"+
		"\u010c\t\2\2\2\u0109\u010b\t\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dX\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0111\7\17\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0113\7\f\2\2\u0113Z\3\2\2\2\u0114\u0116\t"+
		"\4\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b.\2\2\u011a\\\3\2\2\2"+
		"\u011b\u011d\4\62;\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f^\3\2\2\2\u0120\u0128\5]/\2\u0121\u0125"+
		"\7\60\2\2\u0122\u0124\4\62;\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0129\3\2\2\2\u0129`\3\2\2\2\u012a"+
		"\u012d\5S*\2\u012b\u012d\5U+\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2"+
		"\u012db\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130\u0134"+
		"\3\2\2\2\u0131\u0133\n\5\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\b\62\2\2\u0138d\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b"+
		"\7,\2\2\u013b\u013f\3\2\2\2\u013c\u013e\13\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7,\2\2\u0143\u0144\7\61\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\b\63\2\2\u0146f\3\2\2\2\u0147\u0148\13\2\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u014a\b\64\2\2\u014ah\3\2\2\2\r\2\u00fb\u010c"+
		"\u0110\u0117\u011e\u0125\u0128\u012c\u0134\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}