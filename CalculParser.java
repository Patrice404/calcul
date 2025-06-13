// Generated from Calcul.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_instruction = 4, RULE_finInstruction = 5, RULE_bloc = 6, RULE_condition = 7, 
		RULE_ifCondition = 8, RULE_boucle = 9, RULE_boucleWhile = 10, RULE_boucleFor = 11, 
		RULE_expression = 12, RULE_params = 13, RULE_args = 14, RULE_fonction = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "instruction", "finInstruction", 
			"bloc", "condition", "ifCondition", "boucle", "boucleWhile", "boucleFor", 
			"expression", "params", "args", "fonction"
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

	@Override
	public String getGrammarFileName() { return "Calcul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Utils utils = new Utils();

	public CalculParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			calcul();
			setState(33);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FonctionContext fonction;
		public BlocContext bloc;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculParser.NEWLINE, i);
		}
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 _localctx.code += "JUMP Start\n"; 
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					match(NEWLINE);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(50);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(NEWLINE);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Start\n"; 
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					((CalculContext)_localctx).bloc = bloc();
					 _localctx.code += ((CalculContext)_localctx).bloc.code; 
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << ENTIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(73);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			            _localctx.code += "HALT\n"; 
			        
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public ConditionContext condition;
		public TerminalNode TYPE() { return getToken(CalculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(84);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(85);
				finInstruction();

				        utils.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        if(utils.isDouble((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null))){
				            ((DeclContext)_localctx).code =  "PUSHF 0.0\n";
				        }else{
				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				        }
				       
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(89);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(90);
				match(T__0);
				setState(91);
				((DeclContext)_localctx).expression = expression(0);
				setState(92);
				finInstruction();


				        utils.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        VariableInfo vi = utils.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));

				        if(utils.isDouble(vi.type)){
				            ((DeclContext)_localctx).code =  "PUSHF 0.0\n";
				        }else{
				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				        }
				        _localctx.code += ((DeclContext)_localctx).expression.code;

				        if(((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int") || (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("bool")) && ((DeclContext)_localctx).expression.type.equals("double")){
				            _localctx.code += "FTOI\n";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
				        }
				        else if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("double") && (((DeclContext)_localctx).expression.type.equals("int") || ((DeclContext)_localctx).expression.type.equals("bool"))){
				            _localctx.code += "ITOF\n";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
				        }

				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        } // Enregistrement de la partie décimale

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE"); // Enregistrement de la partie entière
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(96);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(97);
				match(T__0);
				setState(98);
				((DeclContext)_localctx).condition = condition(0);
				setState(99);
				finInstruction();


				        utils.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        VariableInfo vi = utils.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));

				        if(utils.isDouble(vi.type)){
				            ((DeclContext)_localctx).code =  "PUSHF 0.0\n";
				        }else{
				            ((DeclContext)_localctx).code =  "PUSHI 0\n";
				        }
				        _localctx.code += ((DeclContext)_localctx).condition.code;

				        if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("double")){
				            _localctx.code += "ITOF\n";
				        }

				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        } // Enregistrement de la partie décimale

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE"); // Enregistrement de la partie entière
				    
				}
				break;
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext e;
		public ConditionContext c;
		public Token op;
		public TerminalNode IDENTIFIANT() { return getToken(CalculParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(105);
				match(T__0);
				setState(106);
				((AssignationContext)_localctx).e = expression(0);
				  
				        VariableInfo vi = utils.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).e.code;

				        if(vi.type.equals("double") && (((AssignationContext)_localctx).e.type.equals("int") || ((AssignationContext)_localctx).e.type.equals("bool"))){
				            _localctx.code += "ITOF\n";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
				        }
				        else if((vi.type.equals("int") || vi.type.equals("bool")) && ((AssignationContext)_localctx).e.type.equals("double")){
				            _localctx.code += "FTOI\n";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
				        }
				                

				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(110);
				match(T__0);
				setState(111);
				((AssignationContext)_localctx).c = condition(0);

				        VariableInfo vi = utils.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));

				        ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).c.code;
				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(115);
				((AssignationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
					((AssignationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				((AssignationContext)_localctx).e = expression(0);

				        
				        VariableInfo vi = utils.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				        ((AssignationContext)_localctx).code =  utils.getInstructionFromAddress(vi, "PUSH");

				        String type = vi.type;
				        
				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");
				        }
				        _localctx.code += ((AssignationContext)_localctx).e.code;

				        if(vi.type.equals("double") && (((AssignationContext)_localctx).e.type.equals("int") || ((AssignationContext)_localctx).e.type.equals("bool"))){
				            _localctx.code += "ITOF  \n";
				            type = "double";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers double");
				        }
				        else if((vi.type.equals("int") || vi.type.equals("bool")) && ((AssignationContext)_localctx).e.type.equals("double")){
				            _localctx.code += "FTOI\n";
				            type = "int";
				            System.err.println("Warning : les types ne matchent pas -> conversion implicite vers int");
				        }

				        
				        String operation = "";
				        switch((((AssignationContext)_localctx).op!=null?((AssignationContext)_localctx).op.getText():null)){
				            case "+=":
				                operation = "ADD\n";
				                break;

				            case "-=":
				                operation = "SUB\n";
				                break;

				            case "*=":
				                operation = "MUL\n";
				                break;


				            case "/=":
				                operation = "DIV\n";
				                break;


				            case "%=":
				                operation = "MOD\n";
				                break;

				            default:
				                break;

				        }

				        if(type.equals("double")) operation = "F" + operation;

				        _localctx.code += operation;


				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");
				    
				}
				break;
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public BlocContext bloc;
		public Token IDENTIFIANT;
		public BoucleContext boucle;
		public IfConditionContext ifCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculParser.IDENTIFIANT, 0); }
		public TerminalNode RETURN() { return getToken(CalculParser.RETURN, 0); }
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((InstructionContext)_localctx).expression = expression(0);
				setState(122);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((InstructionContext)_localctx).assignation = assignation();
				setState(126);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((InstructionContext)_localctx).bloc = bloc();
				 ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__6);
				setState(133);
				match(T__7);
				setState(134);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(135);
				match(T__8);
				setState(136);
				finInstruction();

				        VariableInfo vi = utils.getVar((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null));

				        if(utils.isDouble(vi.type)){
				            ((InstructionContext)_localctx).code =  "READF\n";
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }else{
				            ((InstructionContext)_localctx).code =  "READ\n";
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");
				        
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__9);
				setState(140);
				match(T__7);
				setState(141);
				((InstructionContext)_localctx).expression = expression(0);
				setState(142);
				match(T__8);
				setState(143);
				finInstruction();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;   
				        if(utils.isDouble(((InstructionContext)_localctx).expression.type)){
				            _localctx.code += "WRITEF\n"
				                  +"POP\n"
				                  +"POP\n";
				        }else{
				            _localctx.code += "WRITE\n"
				                  +"POP\n";
				        }
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(RETURN);
				setState(147);
				((InstructionContext)_localctx).expression = expression(0);
				setState(148);
				finInstruction();

				        VariableInfo vi = utils.getReturn();
				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;

				        if(utils.isDouble(vi.type)){
							_localctx.code += "STOREL " + (vi.address + 1) +"\n";
						}

				        _localctx.code += "STOREL " + (vi.address) +"\n";

				        _localctx.code += "RETURN \n";
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				((InstructionContext)_localctx).boucle = boucle();
				((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(T__10);
				setState(155);
				finInstruction();
				  // Ajout du break
				        ((InstructionContext)_localctx).code =  utils.generateBreak();
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				match(T__11);
				setState(159);
				finInstruction();

				        ((InstructionContext)_localctx).code =  utils.generateContinue();
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				((InstructionContext)_localctx).ifCondition = ifCondition();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).ifCondition.code;
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(165);
				finInstruction();

				        ((InstructionContext)_localctx).code =  "";
				    
				}
				break;
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(170);
					_la = _input.LA(1);
					if ( !(_la==T__12 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173); 
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<TerminalNode> NEWLINE() { return getTokens(CalculParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculParser.NEWLINE, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(175);
				match(NEWLINE);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__13);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(NEWLINE);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(188);
				((BlocContext)_localctx).decl = decl();
				 _localctx.code += ((BlocContext)_localctx).decl.code; 
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(NEWLINE);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					((BlocContext)_localctx).instruction = instruction();
					 _localctx.code += ((BlocContext)_localctx).instruction.code; 
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(T__14);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(NEWLINE);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext a;
		public ConditionContext condition;
		public ExpressionContext e;
		public Token op;
		public ExpressionContext f;
		public ConditionContext b;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TRUE() { return getToken(CalculParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CalculParser.FALSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(224);
				match(T__7);
				setState(225);
				((ConditionContext)_localctx).condition = condition(0);
				setState(226);
				match(T__8);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code;
				}
				break;
			case 2:
				{
				setState(229);
				((ConditionContext)_localctx).e = expression(0);
				setState(230);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				((ConditionContext)_localctx).f = expression(0);

				        ((ConditionContext)_localctx).code = utils.evalexpr(((ConditionContext)_localctx).e.code, (((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null), ((ConditionContext)_localctx).f.code, ((ConditionContext)_localctx).e.type, ((ConditionContext)_localctx).f.type);
				    
				}
				break;
			case 3:
				{
				setState(234);
				match(T__22);
				setState(235);
				((ConditionContext)_localctx).a = ((ConditionContext)_localctx).condition = condition(6);

				        ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code 
				                + "PUSHI 0\n"
				                + "EQUAL\n";
				    
				}
				break;
			case 4:
				{
				setState(238);
				((ConditionContext)_localctx).e = expression(0);

				        ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e.code;
				        
				        if(utils.isDouble(((ConditionContext)_localctx).e.type)){

				            _localctx.code += "PUSHF 0.0\n" + "FNEQ\n";

				        }
				        else{
				            _localctx.code += "PUSHI 0\n" + "NEQ\n";
				        }
				    
				}
				break;
			case 5:
				{
				setState(241);
				match(TRUE);
				 ((ConditionContext)_localctx).code =  "PUSHI 1\n"; 
				}
				break;
			case 6:
				{
				setState(243);
				match(FALSE);
				 ((ConditionContext)_localctx).code =  "PUSHI 0\n"; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(248);
						match(T__23);
						setState(249);
						((ConditionContext)_localctx).b = ((ConditionContext)_localctx).condition = condition(6);

						                  ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code
						                          + "MUL\n";
						              
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253);
						match(T__24);
						setState(254);
						((ConditionContext)_localctx).b = ((ConditionContext)_localctx).condition = condition(5);

						                  ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code
						                          + "ADD\n"
						                          + "PUSHI 0\n"
						                          + "NEQ\n";
						              
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifCondition);

		        ((IfConditionContext)_localctx).code =  new String();
		        String elseLabel = utils.newLabel();
		        String endLabel = utils.newLabel();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__25);
			setState(263);
			match(T__7);
			setState(264);
			((IfConditionContext)_localctx).condition = condition(0);
			setState(265);
			match(T__8);
			setState(266);
			match(T__26);
			setState(267);
			((IfConditionContext)_localctx).instruction = instruction();


			        ((IfConditionContext)_localctx).code =  ((IfConditionContext)_localctx).condition.code
			                + "JUMPF "+elseLabel + "\n"
			                + ((IfConditionContext)_localctx).instruction.code
			                + "JUMP " + endLabel + "\n"
			                + "LABEL " + elseLabel + "\n"
			        
			        ;
			    
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269);
				match(T__27);
				setState(270);
				((IfConditionContext)_localctx).instruction = instruction();

				        // Prise en compte du else if
				        _localctx.code += ((IfConditionContext)_localctx).instruction.code;
				            
				    
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			 _localctx.code += "LABEL " + endLabel + "\n"; 
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

	public static class BoucleContext extends ParserRuleContext {
		public String code;
		public BoucleWhileContext boucleWhile;
		public BoucleForContext boucleFor;
		public BoucleWhileContext boucleWhile() {
			return getRuleContext(BoucleWhileContext.class,0);
		}
		public BoucleForContext boucleFor() {
			return getRuleContext(BoucleForContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boucle);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((BoucleContext)_localctx).boucleWhile = boucleWhile();

				        ((BoucleContext)_localctx).code =  ((BoucleContext)_localctx).boucleWhile.code;
				    
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				((BoucleContext)_localctx).boucleFor = boucleFor();

				        ((BoucleContext)_localctx).code =  ((BoucleContext)_localctx).boucleFor.code;
				    
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

	public static class BoucleWhileContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BoucleWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucleWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterBoucleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitBoucleWhile(this);
		}
	}

	public final BoucleWhileContext boucleWhile() throws RecognitionException {
		BoucleWhileContext _localctx = new BoucleWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boucleWhile);

		        String startLabel = utils.newLabel();
		        String endLabel = utils.newLabel();
		        utils.pushBreakLabel(endLabel); // Empile le label de fin
		        utils.pushContinueLabel(startLabel); // Empile le label de début

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__28);
			setState(284);
			match(T__7);
			setState(285);
			((BoucleWhileContext)_localctx).condition = condition(0);
			setState(286);
			match(T__8);
			setState(287);
			((BoucleWhileContext)_localctx).instruction = instruction();

			        
			        ((BoucleWhileContext)_localctx).code =  "LABEL "+startLabel + "\n"
			                + ((BoucleWhileContext)_localctx).condition.code
			                + "JUMPF "+endLabel + "\n"
			                + ((BoucleWhileContext)_localctx).instruction.code
			                + "JUMP " + startLabel + "\n"
			                + "LABEL " + endLabel + "\n"
			        
			        ;
			    
			}
			_ctx.stop = _input.LT(-1);

			    utils.popBreakLabel();
			    utils.popContinueLabel();

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

	public static class BoucleForContext extends ParserRuleContext {
		public String code;
		public AssignationContext a;
		public ConditionContext b;
		public AssignationContext c;
		public InstructionContext instruction;
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoucleForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucleFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterBoucleFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitBoucleFor(this);
		}
	}

	public final BoucleForContext boucleFor() throws RecognitionException {
		BoucleForContext _localctx = new BoucleForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boucleFor);

		        String startLabel = utils.newLabel();
		        String continueLabel = utils.newLabel();
		        String endLabel = utils.newLabel();
		        utils.pushBreakLabel(endLabel); // Empile le label de fin
		        utils.pushContinueLabel(continueLabel); // Empile le label de continue

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__29);
			setState(291);
			match(T__7);
			setState(292);
			((BoucleForContext)_localctx).a = assignation();
			setState(293);
			match(T__12);
			setState(294);
			((BoucleForContext)_localctx).b = condition(0);
			setState(295);
			match(T__12);
			setState(296);
			((BoucleForContext)_localctx).c = assignation();
			setState(297);
			match(T__8);
			setState(298);
			((BoucleForContext)_localctx).instruction = instruction();

			        
			        ((BoucleForContext)_localctx).code =  ((BoucleForContext)_localctx).a.code 
			                + "LABEL " + startLabel + "\n"
			                + ((BoucleForContext)_localctx).b.code 
			                + "JUMPF " + endLabel + "\n" 
			                + ((BoucleForContext)_localctx).instruction.code 
			                + "LABEL " + continueLabel + "\n"
			                + ((BoucleForContext)_localctx).c.code
			                + "JUMP " + startLabel + "\n"
			                + "LABEL "+ endLabel + "\n";

			}
			_ctx.stop = _input.LT(-1);

			    utils.popBreakLabel();
			    utils.popContinueLabel();

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

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public String type;
		public ExpressionContext a;
		public ExpressionContext expression;
		public Token TYPE;
		public ExpressionContext e;
		public Token IDENTIFIANT;
		public Token op;
		public ArgsContext args;
		public Token DOUBLE;
		public Token ENTIER;
		public ExpressionContext b;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(CalculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculParser.IDENTIFIANT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(CalculParser.DOUBLE, 0); }
		public TerminalNode ENTIER() { return getToken(CalculParser.ENTIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(302);
				match(T__7);
				setState(303);
				((ExpressionContext)_localctx).a = ((ExpressionContext)_localctx).expression = expression(0);
				setState(304);
				match(T__8);

				        ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code; 
				        ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).a.type;
				    
				}
				break;
			case 2:
				{
				setState(307);
				match(T__7);
				setState(308);
				((ExpressionContext)_localctx).TYPE = match(TYPE);
				setState(309);
				match(T__8);
				setState(310);
				((ExpressionContext)_localctx).expression = expression(10);

				        // CAST EN INT OU EN DOUBLE
				        ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).expression.code;
				        ((ExpressionContext)_localctx).type =  (((ExpressionContext)_localctx).TYPE!=null?((ExpressionContext)_localctx).TYPE.getText():null);
				        if(utils.isDouble((((ExpressionContext)_localctx).TYPE!=null?((ExpressionContext)_localctx).TYPE.getText():null)) && (((ExpressionContext)_localctx).expression.type.equals("int") || ((ExpressionContext)_localctx).expression.type.equals("bool"))){
				            _localctx.code += "ITOF\n";
				        }
				        else if(utils.isDouble(((ExpressionContext)_localctx).expression.type) && ((((ExpressionContext)_localctx).TYPE!=null?((ExpressionContext)_localctx).TYPE.getText():null).equals("int") || (((ExpressionContext)_localctx).TYPE!=null?((ExpressionContext)_localctx).TYPE.getText():null).equals("bool"))){
				            

				            if((((ExpressionContext)_localctx).TYPE!=null?((ExpressionContext)_localctx).TYPE.getText():null).equals("bool")){

				                _localctx.code += "PUSHF 0.0\n"
				                + "FNEQ\n";

				            }
				            else{
				                _localctx.code += "FTOI\n";
				            }
				        }
				    
				}
				break;
			case 3:
				{
				setState(313);
				match(T__30);
				setState(314);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(9);

				        ((ExpressionContext)_localctx).code =  utils.evalexpr("PUSHI 0\n", "-", ((ExpressionContext)_localctx).e.code, "int", ((ExpressionContext)_localctx).e.type);  
				        ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).e.type;
				    
				}
				break;
			case 4:
				{
				setState(317);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				        VariableInfo vi = utils.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExpressionContext)_localctx).code =  utils.getInstructionFromAddress(vi, "PUSH");
				        
				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");
				        }


				        ((ExpressionContext)_localctx).type =  vi.type;
				    
				}
				break;
			case 5:
				{
				setState(319);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				        
				        VariableInfo vi = utils.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        ((ExpressionContext)_localctx).code =  utils.getInstructionFromAddress(vi, "PUSH");

				        String type = vi.type;
				        ((ExpressionContext)_localctx).type =  vi.type;

				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");

				            _localctx.code += "PUSHF 1.0\n";
				        }
				        else {
				            _localctx.code += "PUSHI 1\n";
				        }

				        String operation = "";
				        switch((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)){
				            case "++":
				                operation = "ADD\n";
				                break;

				            case "--":
				                operation = "SUB\n";
				                break;
				        }

				        if(type.equals("double")) operation = "F" + operation;

				        _localctx.code += operation;


				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");


				        // Pré incrémentation
				        _localctx.code += utils.getInstructionFromAddress(vi, "PUSH");


				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");
				        }

				    
				}
				break;
			case 6:
				{
				setState(322);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(323);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}


				        VariableInfo vi = utils.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				        String type = vi.type;
				        ((ExpressionContext)_localctx).type =  vi.type;



				        // Post incrémentation
				        ((ExpressionContext)_localctx).code =  utils.getInstructionFromAddress(vi, "PUSH");
				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "PUSH");

				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "PUSH");

				            _localctx.code += "PUSHF 1.0\n";
				        }
				        else {
				            _localctx.code += "PUSHI 1\n";
				        }

				        String operation = "";
				        switch((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)){
				            case "++":
				                operation = "ADD\n";
				                break;

				            case "--":
				                operation = "SUB\n";
				                break;
				        }

				        if(type.equals("double")) operation = "F" + operation;

				        _localctx.code += operation;


				        if(utils.isDouble(vi.type)){
				            VariableInfo vi2 = new VariableInfo(vi.address+1, vi.scope, vi.type);
				            _localctx.code += utils.getInstructionFromAddress(vi2, "STORE");
				        }

				        _localctx.code += utils.getInstructionFromAddress(vi, "STORE");

				    
				}
				break;
			case 7:
				{
				setState(325);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(326);
				match(T__7);
				setState(327);
				((ExpressionContext)_localctx).args = args();
				setState(328);
				match(T__8);

				            ((ExpressionContext)_localctx).type =  utils.getFunction((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            //Reserver une case pour la valeur de retour

				            if(utils.isDouble(_localctx.type)){
				                ((ExpressionContext)_localctx).code =  "PUSHF 0.0\n";
				            }
				            else{
				                ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            }
				            
				            _localctx.code += ((ExpressionContext)_localctx).args.code;
				            _localctx.code += "CALL " + (((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
				            

				            //Suppression des args de la pile
				            for(int i=0; i<((ExpressionContext)_localctx).args.size; i++){ 
				                _localctx.code += "POP \n";
				            }
				            
				        
				}
				break;
			case 8:
				{
				setState(331);
				((ExpressionContext)_localctx).DOUBLE = match(DOUBLE);

				        ((ExpressionContext)_localctx).code =  "PUSHF " + (((ExpressionContext)_localctx).DOUBLE!=null?((ExpressionContext)_localctx).DOUBLE.getText():null) + "\n";
				        ((ExpressionContext)_localctx).type =  "double";
				    
				}
				break;
			case 9:
				{
				setState(333);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				        ((ExpressionContext)_localctx).type =  "int";
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(338);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						((ExpressionContext)_localctx).b = ((ExpressionContext)_localctx).expression = expression(9);

						                  ((ExpressionContext)_localctx).code =  utils.evalexpr(((ExpressionContext)_localctx).a.code, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).b.code, ((ExpressionContext)_localctx).a.type, ((ExpressionContext)_localctx).b.type);
						                  ((ExpressionContext)_localctx).type =  utils.determineType(((ExpressionContext)_localctx).a.type, ((ExpressionContext)_localctx).b.type);
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(343);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__34) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(344);
						((ExpressionContext)_localctx).b = ((ExpressionContext)_localctx).expression = expression(8);

						                  ((ExpressionContext)_localctx).code =  utils.evalexpr(((ExpressionContext)_localctx).a.code, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).b.code, ((ExpressionContext)_localctx).a.type, ((ExpressionContext)_localctx).b.type);
						                  ((ExpressionContext)_localctx).type =  utils.determineType(((ExpressionContext)_localctx).a.type, ((ExpressionContext)_localctx).b.type);
						              
						}
						break;
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(353);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            utils.addParam((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),(((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
			        
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(355);
				match(T__37);
				setState(356);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(357);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				                utils.addParam((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),(((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
				            
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << DOUBLE))) != 0)) {
				{
				setState(364);
				((ArgsContext)_localctx).expression = expression(0);
				 
				            _localctx.code += ((ArgsContext)_localctx).expression.code; 
				            _localctx.size+= VariableInfo.getSize(((ArgsContext)_localctx).expression.type);
				        
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(366);
					match(T__37);
					setState(367);
					((ArgsContext)_localctx).expression = expression(0);
					 
					            _localctx.code += ((ArgsContext)_localctx).expression.code; 
					            _localctx.size += VariableInfo.getSize(((ArgsContext)_localctx).expression.type);
					        
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalculParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculListener ) ((CalculListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fonction);

		        ((FonctionContext)_localctx).code =  new String();
		        utils.enterFunction();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(378);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            utils.addFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			            ((FonctionContext)_localctx).code =  "LABEL " + (((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
			        
			setState(380);
			match(T__7);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(381);
				params();
				}
			}

			setState(384);
			match(T__8);
			setState(385);
			((FonctionContext)_localctx).bloc = bloc();

			            _localctx.code += ((FonctionContext)_localctx).bloc.code;
			            _localctx.code += "RETURN\n";  //  Return "de sécurité"
			        
			}
			_ctx.stop = _input.LT(-1);
			 utils.exitFunction(); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0187\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13\3"+
		"\3\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3"+
		"R\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00ab\n\6\3\7\6\7\u00ae\n\7\r\7\16\7\u00af\3\b\7\b\u00b3"+
		"\n\b\f\b\16\b\u00b6\13\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3\b"+
		"\3\b\3\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\b\7\b\u00c8\n\b\f\b\16\b"+
		"\u00cb\13\b\3\b\3\b\3\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\3\b\7\b\u00d6"+
		"\n\b\f\b\16\b\u00d9\13\b\3\b\3\b\7\b\u00dd\n\b\f\b\16\b\u00e0\13\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00f8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u0104\n\t\f\t\16\t\u0107\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0114\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011c\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0152\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u015e\n\16\f\16\16\16\u0161\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u016a\n\17\f\17\16\17\u016d\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0175\n\20\f\20\16\20\u0178\13\20"+
		"\5\20\u017a\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0181\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\2\4\20\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\b"+
		"\3\2\4\b\4\2\17\17..\3\2\22\30\3\2&\'\3\2\"$\4\2!!%%\2\u01a9\2\"\3\2\2"+
		"\2\4*\3\2\2\2\6h\3\2\2\2\by\3\2\2\2\n\u00aa\3\2\2\2\f\u00ad\3\2\2\2\16"+
		"\u00b4\3\2\2\2\20\u00f7\3\2\2\2\22\u0108\3\2\2\2\24\u011b\3\2\2\2\26\u011d"+
		"\3\2\2\2\30\u0124\3\2\2\2\32\u0151\3\2\2\2\34\u0162\3\2\2\2\36\u0179\3"+
		"\2\2\2 \u017b\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%&\5\6\4\2&\'\b\3"+
		"\1\2\')\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3"+
		"\2\2\2-\61\b\3\1\2.\60\7.\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\629\3\2\2\2\63\61\3\2\2\2\64\65\5 \21\2\65\66\b\3\1\2\668\3\2"+
		"\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2"+
		"<>\7.\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2"+
		"BH\b\3\1\2CD\5\16\b\2DE\b\3\1\2EG\3\2\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IP\3\2\2\2JH\3\2\2\2KL\5\n\6\2LM\b\3\1\2MO\3\2\2\2NK\3\2\2"+
		"\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\b\3\1\2T\5\3\2"+
		"\2\2UV\7*\2\2VW\7-\2\2WX\5\f\7\2XY\b\4\1\2Yi\3\2\2\2Z[\7*\2\2[\\\7-\2"+
		"\2\\]\7\3\2\2]^\5\32\16\2^_\5\f\7\2_`\b\4\1\2`i\3\2\2\2ab\7*\2\2bc\7-"+
		"\2\2cd\7\3\2\2de\5\20\t\2ef\5\f\7\2fg\b\4\1\2gi\3\2\2\2hU\3\2\2\2hZ\3"+
		"\2\2\2ha\3\2\2\2i\7\3\2\2\2jk\7-\2\2kl\7\3\2\2lm\5\32\16\2mn\b\5\1\2n"+
		"z\3\2\2\2op\7-\2\2pq\7\3\2\2qr\5\20\t\2rs\b\5\1\2sz\3\2\2\2tu\7-\2\2u"+
		"v\t\2\2\2vw\5\32\16\2wx\b\5\1\2xz\3\2\2\2yj\3\2\2\2yo\3\2\2\2yt\3\2\2"+
		"\2z\t\3\2\2\2{|\5\32\16\2|}\5\f\7\2}~\b\6\1\2~\u00ab\3\2\2\2\177\u0080"+
		"\5\b\5\2\u0080\u0081\5\f\7\2\u0081\u0082\b\6\1\2\u0082\u00ab\3\2\2\2\u0083"+
		"\u0084\5\16\b\2\u0084\u0085\b\6\1\2\u0085\u00ab\3\2\2\2\u0086\u0087\7"+
		"\t\2\2\u0087\u0088\7\n\2\2\u0088\u0089\7-\2\2\u0089\u008a\7\13\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\b\6\1\2\u008c\u00ab\3\2\2\2\u008d\u008e\7\f"+
		"\2\2\u008e\u008f\7\n\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\13\2\2\u0091"+
		"\u0092\5\f\7\2\u0092\u0093\b\6\1\2\u0093\u00ab\3\2\2\2\u0094\u0095\7)"+
		"\2\2\u0095\u0096\5\32\16\2\u0096\u0097\5\f\7\2\u0097\u0098\b\6\1\2\u0098"+
		"\u00ab\3\2\2\2\u0099\u009a\5\24\13\2\u009a\u009b\b\6\1\2\u009b\u00ab\3"+
		"\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\5\f\7\2\u009e\u009f\b\6\1\2\u009f"+
		"\u00ab\3\2\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\b"+
		"\6\1\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\b\6\1\2\u00a6"+
		"\u00ab\3\2\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\b\6\1\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa{\3\2\2\2\u00aa\177\3\2\2\2\u00aa\u0083\3\2\2\2\u00aa\u0086"+
		"\3\2\2\2\u00aa\u008d\3\2\2\2\u00aa\u0094\3\2\2\2\u00aa\u0099\3\2\2\2\u00aa"+
		"\u009c\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00ab\13\3\2\2\2\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2\u00b1"+
		"\u00b3\7.\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00bb\7\20\2\2\u00b8\u00ba\7.\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c3\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\b\b\1\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7."+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\n"+
		"\6\2\u00cd\u00ce\b\b\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7.\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\7\21\2\2\u00db\u00dd\7.\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\17\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\t\1\2\u00e2\u00e3"+
		"\7\n\2\2\u00e3\u00e4\5\20\t\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\b\t\1\2"+
		"\u00e6\u00f8\3\2\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea"+
		"\5\32\16\2\u00ea\u00eb\b\t\1\2\u00eb\u00f8\3\2\2\2\u00ec\u00ed\7\31\2"+
		"\2\u00ed\u00ee\5\20\t\b\u00ee\u00ef\b\t\1\2\u00ef\u00f8\3\2\2\2\u00f0"+
		"\u00f1\5\32\16\2\u00f1\u00f2\b\t\1\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\7"+
		"+\2\2\u00f4\u00f8\b\t\1\2\u00f5\u00f6\7,\2\2\u00f6\u00f8\b\t\1\2\u00f7"+
		"\u00e1\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00f0\3\2"+
		"\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0105\3\2\2\2\u00f9"+
		"\u00fa\f\7\2\2\u00fa\u00fb\7\32\2\2\u00fb\u00fc\5\20\t\b\u00fc\u00fd\b"+
		"\t\1\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\f\6\2\2\u00ff\u0100\7\33\2\2\u0100"+
		"\u0101\5\20\t\7\u0101\u0102\b\t\1\2\u0102\u0104\3\2\2\2\u0103\u00f9\3"+
		"\2\2\2\u0103\u00fe\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\21\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\34\2"+
		"\2\u0109\u010a\7\n\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7\13\2\2\u010c"+
		"\u010d\7\35\2\2\u010d\u010e\5\n\6\2\u010e\u0113\b\n\1\2\u010f\u0110\7"+
		"\36\2\2\u0110\u0111\5\n\6\2\u0111\u0112\b\n\1\2\u0112\u0114\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114\23\3\2\2\2\u0115\u0116\5\26\f"+
		"\2\u0116\u0117\b\13\1\2\u0117\u011c\3\2\2\2\u0118\u0119\5\30\r\2\u0119"+
		"\u011a\b\13\1\2\u011a\u011c\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0118\3"+
		"\2\2\2\u011c\25\3\2\2\2\u011d\u011e\7\37\2\2\u011e\u011f\7\n\2\2\u011f"+
		"\u0120\5\20\t\2\u0120\u0121\7\13\2\2\u0121\u0122\5\n\6\2\u0122\u0123\b"+
		"\f\1\2\u0123\27\3\2\2\2\u0124\u0125\7 \2\2\u0125\u0126\7\n\2\2\u0126\u0127"+
		"\5\b\5\2\u0127\u0128\7\17\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7\17\2"+
		"\2\u012a\u012b\5\b\5\2\u012b\u012c\7\13\2\2\u012c\u012d\5\n\6\2\u012d"+
		"\u012e\b\r\1\2\u012e\31\3\2\2\2\u012f\u0130\b\16\1\2\u0130\u0131\7\n\2"+
		"\2\u0131\u0132\5\32\16\2\u0132\u0133\7\13\2\2\u0133\u0134\b\16\1\2\u0134"+
		"\u0152\3\2\2\2\u0135\u0136\7\n\2\2\u0136\u0137\7*\2\2\u0137\u0138\7\13"+
		"\2\2\u0138\u0139\5\32\16\f\u0139\u013a\b\16\1\2\u013a\u0152\3\2\2\2\u013b"+
		"\u013c\7!\2\2\u013c\u013d\5\32\16\13\u013d\u013e\b\16\1\2\u013e\u0152"+
		"\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0152\b\16\1\2\u0141\u0142\t\5\2\2\u0142"+
		"\u0143\7-\2\2\u0143\u0152\b\16\1\2\u0144\u0145\7-\2\2\u0145\u0146\t\5"+
		"\2\2\u0146\u0152\b\16\1\2\u0147\u0148\7-\2\2\u0148\u0149\7\n\2\2\u0149"+
		"\u014a\5\36\20\2\u014a\u014b\7\13\2\2\u014b\u014c\b\16\1\2\u014c\u0152"+
		"\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u0152\b\16\1\2\u014f\u0150\7\60\2"+
		"\2\u0150\u0152\b\16\1\2\u0151\u012f\3\2\2\2\u0151\u0135\3\2\2\2\u0151"+
		"\u013b\3\2\2\2\u0151\u013f\3\2\2\2\u0151\u0141\3\2\2\2\u0151\u0144\3\2"+
		"\2\2\u0151\u0147\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u015f\3\2\2\2\u0153\u0154\f\n\2\2\u0154\u0155\t\6\2\2\u0155\u0156\5\32"+
		"\16\13\u0156\u0157\b\16\1\2\u0157\u015e\3\2\2\2\u0158\u0159\f\t\2\2\u0159"+
		"\u015a\t\7\2\2\u015a\u015b\5\32\16\n\u015b\u015c\b\16\1\2\u015c\u015e"+
		"\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0158\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\33\3\2\2\2\u0161\u015f\3\2\2"+
		"\2\u0162\u0163\7*\2\2\u0163\u0164\7-\2\2\u0164\u016b\b\17\1\2\u0165\u0166"+
		"\7(\2\2\u0166\u0167\7*\2\2\u0167\u0168\7-\2\2\u0168\u016a\b\17\1\2\u0169"+
		"\u0165\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\35\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\5\32\16\2\u016f"+
		"\u0176\b\20\1\2\u0170\u0171\7(\2\2\u0171\u0172\5\32\16\2\u0172\u0173\b"+
		"\20\1\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u016e\3\2\2\2\u0179\u017a\3\2\2\2\u017a\37\3\2\2\2\u017b\u017c"+
		"\7*\2\2\u017c\u017d\7-\2\2\u017d\u017e\b\21\1\2\u017e\u0180\7\n\2\2\u017f"+
		"\u0181\5\34\17\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3"+
		"\2\2\2\u0182\u0183\7\13\2\2\u0183\u0184\5\16\b\2\u0184\u0185\b\21\1\2"+
		"\u0185!\3\2\2\2\37*\619?HPhy\u00aa\u00af\u00b4\u00bb\u00c3\u00c9\u00d1"+
		"\u00d7\u00de\u00f7\u0103\u0105\u0113\u011b\u0151\u015d\u015f\u016b\u0176"+
		"\u0179\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}