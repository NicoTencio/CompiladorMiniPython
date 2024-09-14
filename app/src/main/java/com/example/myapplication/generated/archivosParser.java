// Generated from C:/Users/Nicole/AndroidStudioProjects/MyApplication3/app\archivos.g4 by ANTLR 4.12.0
package com.example.myapplication.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class archivosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, DOSPUN=2, COMA=3, RIGHTCOR=4, LEFTCOR=5, RIGHTKEY=6, LEFTKEY=7, 
		IGUAL=8, PIZQ=9, PDER=10, MENORQUE=11, MAYORQUE=12, MENORIGUAL=13, MAYORIGUAL=14, 
		IGUALIGUAL=15, SUMAR=16, RESTAR=17, SUM=18, SUB=19, MUL=20, DIV=21, GUIONBAJO=22, 
		DEF=23, IF=24, WHILE=25, RETURN=26, PRINT=27, LEN=28, ELSE=29, FOR=30, 
		IN=31, SPACE=32, COMILLASSIMPLES=33, COMILLAS=34, ID=35, INT=36, FLOAT=37, 
		CHAR=38, STRING=39, NEWLINE=40, COMMENT=41, COMENTARIO=42, TOKENEXTRA=43, 
		INDENT=44, DEDENT=45;
	public static final int
		RULE_program = 0, RULE_mainStatement = 1, RULE_statement = 2, RULE_defStatement = 3, 
		RULE_argList = 4, RULE_moreArgs = 5, RULE_ifStatement = 6, RULE_whileStatement = 7, 
		RULE_forStatement = 8, RULE_returnStatement = 9, RULE_printStatement = 10, 
		RULE_assignStatement = 11, RULE_functionCallStatement = 12, RULE_expressionStatement = 13, 
		RULE_sequence = 14, RULE_moreStatements = 15, RULE_expression = 16, RULE_comparison = 17, 
		RULE_additionExpression = 18, RULE_additionFactor = 19, RULE_multiplicationExpression = 20, 
		RULE_multiplicationFactor = 21, RULE_elementExpression = 22, RULE_elementAccess = 23, 
		RULE_expressionList = 24, RULE_moreExpressions = 25, RULE_primitiveExpression = 26, 
		RULE_listExpression = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainStatement", "statement", "defStatement", "argList", "moreArgs", 
			"ifStatement", "whileStatement", "forStatement", "returnStatement", "printStatement", 
			"assignStatement", "functionCallStatement", "expressionStatement", "sequence", 
			"moreStatements", "expression", "comparison", "additionExpression", "additionFactor", 
			"multiplicationExpression", "multiplicationFactor", "elementExpression", 
			"elementAccess", "expressionList", "moreExpressions", "primitiveExpression", 
			"listExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "','", "']'", "'['", "'}'", "'{'", "'='", "'('", 
			"')'", "'<'", "'>'", "'<='", "'>='", "'=='", "'+='", "'-='", "'+'", "'-'", 
			"'*'", "'/'", "'_'", "'def'", "'if'", "'while'", "'return'", "'print'", 
			"'len'", "'else'", "'for'", "'in'", null, "'''", "'\"'", null, null, 
			null, null, null, null, null, null, "'\\n\\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "DOSPUN", "COMA", "RIGHTCOR", "LEFTCOR", "RIGHTKEY", 
			"LEFTKEY", "IGUAL", "PIZQ", "PDER", "MENORQUE", "MAYORQUE", "MENORIGUAL", 
			"MAYORIGUAL", "IGUALIGUAL", "SUMAR", "RESTAR", "SUM", "SUB", "MUL", "DIV", 
			"GUIONBAJO", "DEF", "IF", "WHILE", "RETURN", "PRINT", "LEN", "ELSE", 
			"FOR", "IN", "SPACE", "COMILLASSIMPLES", "COMILLAS", "ID", "INT", "FLOAT", 
			"CHAR", "STRING", "NEWLINE", "COMMENT", "COMENTARIO", "TOKENEXTRA", "INDENT", 
			"DEDENT"
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
	public String getGrammarFileName() { return "archivos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public archivosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			mainStatement();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==ID) {
				{
				{
				setState(57);
				mainStatement();
				}
				}
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainStatementContext extends ParserRuleContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainStatement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				defStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				assignStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				assignStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				functionCallStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(archivosParser.DEF, 0); }
		public TerminalNode ID() { return getToken(archivosParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(archivosParser.PIZQ, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode PDER() { return getToken(archivosParser.PDER, 0); }
		public TerminalNode DOSPUN() { return getToken(archivosParser.DOSPUN, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(archivosParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(archivosParser.INDENT, i);
		}
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DEF);
			setState(78);
			match(ID);
			setState(79);
			match(PIZQ);
			setState(80);
			argList();
			setState(81);
			match(PDER);
			setState(82);
			match(DOSPUN);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					match(INDENT);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(89);
			sequence();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(archivosParser.ID, 0); }
		public MoreArgsContext moreArgs() {
			return getRuleContext(MoreArgsContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(92);
				moreArgs();
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoreArgsContext extends ParserRuleContext {
		public List<TerminalNode> COMA() { return getTokens(archivosParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(archivosParser.COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(archivosParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(archivosParser.ID, i);
		}
		public MoreArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreArgs; }
	}

	public final MoreArgsContext moreArgs() throws RecognitionException {
		MoreArgsContext _localctx = new MoreArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moreArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(96);
				match(COMA);
				setState(97);
				match(ID);
				}
				}
				setState(102);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(archivosParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> DOSPUN() { return getTokens(archivosParser.DOSPUN); }
		public TerminalNode DOSPUN(int i) {
			return getToken(archivosParser.DOSPUN, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(archivosParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			expression();
			setState(105);
			match(DOSPUN);
			setState(106);
			sequence();
			setState(107);
			match(ELSE);
			setState(108);
			match(DOSPUN);
			setState(109);
			sequence();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(archivosParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOSPUN() { return getToken(archivosParser.DOSPUN, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(WHILE);
			setState(112);
			expression();
			setState(113);
			match(DOSPUN);
			setState(114);
			sequence();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(archivosParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(archivosParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DOSPUN() { return getToken(archivosParser.DOSPUN, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FOR);
			setState(117);
			expression();
			setState(118);
			match(IN);
			setState(119);
			expressionList();
			setState(120);
			match(DOSPUN);
			setState(121);
			sequence();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(archivosParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(archivosParser.NEWLINE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(RETURN);
			setState(124);
			expression();
			setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(archivosParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(archivosParser.NEWLINE, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRINT);
			setState(128);
			expression();
			setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(archivosParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(archivosParser.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(archivosParser.NEWLINE, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(IGUAL);
			setState(133);
			expression();
			setState(134);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(archivosParser.PIZQ, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PDER() { return getToken(archivosParser.PDER, 0); }
		public TerminalNode NEWLINE() { return getToken(archivosParser.NEWLINE, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			primitiveExpression();
			setState(137);
			match(PIZQ);
			setState(138);
			expressionList();
			setState(139);
			match(PDER);
			setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(archivosParser.NEWLINE, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expressionList();
			setState(143);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(archivosParser.INDENT, 0); }
		public MoreStatementsContext moreStatements() {
			return getRuleContext(MoreStatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(archivosParser.DEDENT, 0); }
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(INDENT);
			setState(146);
			moreStatements();
			setState(147);
			match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoreStatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MoreStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStatements; }
	}

	public final MoreStatementsContext moreStatements() throws RecognitionException {
		MoreStatementsContext _localctx = new MoreStatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_moreStatements);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2166257877536L) != 0)) {
					{
					{
					setState(150);
					statement();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			additionExpression();
			setState(159);
			comparison();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<AdditionExpressionContext> additionExpression() {
			return getRuleContexts(AdditionExpressionContext.class);
		}
		public AdditionExpressionContext additionExpression(int i) {
			return getRuleContext(AdditionExpressionContext.class,i);
		}
		public List<TerminalNode> MENORQUE() { return getTokens(archivosParser.MENORQUE); }
		public TerminalNode MENORQUE(int i) {
			return getToken(archivosParser.MENORQUE, i);
		}
		public List<TerminalNode> MAYORQUE() { return getTokens(archivosParser.MAYORQUE); }
		public TerminalNode MAYORQUE(int i) {
			return getToken(archivosParser.MAYORQUE, i);
		}
		public List<TerminalNode> MENORIGUAL() { return getTokens(archivosParser.MENORIGUAL); }
		public TerminalNode MENORIGUAL(int i) {
			return getToken(archivosParser.MENORIGUAL, i);
		}
		public List<TerminalNode> MAYORIGUAL() { return getTokens(archivosParser.MAYORIGUAL); }
		public TerminalNode MAYORIGUAL(int i) {
			return getToken(archivosParser.MAYORIGUAL, i);
		}
		public List<TerminalNode> IGUALIGUAL() { return getTokens(archivosParser.IGUALIGUAL); }
		public TerminalNode IGUALIGUAL(int i) {
			return getToken(archivosParser.IGUALIGUAL, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(archivosParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(archivosParser.IGUAL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63744L) != 0)) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63744L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				additionExpression();
				}
				}
				setState(167);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionFactorContext additionFactor() {
			return getRuleContext(AdditionFactorContext.class,0);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			multiplicationExpression();
			setState(169);
			additionFactor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionFactorContext extends ParserRuleContext {
		public List<MultiplicationExpressionContext> multiplicationExpression() {
			return getRuleContexts(MultiplicationExpressionContext.class);
		}
		public MultiplicationExpressionContext multiplicationExpression(int i) {
			return getRuleContext(MultiplicationExpressionContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(archivosParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(archivosParser.SUM, i);
		}
		public List<TerminalNode> SUB() { return getTokens(archivosParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(archivosParser.SUB, i);
		}
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				multiplicationExpression();
				}
				}
				setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public MultiplicationFactorContext multiplicationFactor() {
			return getRuleContext(MultiplicationFactorContext.class,0);
		}
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			elementExpression();
			setState(179);
			multiplicationFactor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationFactorContext extends ParserRuleContext {
		public List<ElementExpressionContext> elementExpression() {
			return getRuleContexts(ElementExpressionContext.class);
		}
		public ElementExpressionContext elementExpression(int i) {
			return getRuleContext(ElementExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(archivosParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(archivosParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(archivosParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(archivosParser.DIV, i);
		}
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicationFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				elementExpression();
				}
				}
				setState(187);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ElementAccessContext elementAccess() {
			return getRuleContext(ElementAccessContext.class,0);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			primitiveExpression();
			setState(189);
			elementAccess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementAccessContext extends ParserRuleContext {
		public List<TerminalNode> LEFTCOR() { return getTokens(archivosParser.LEFTCOR); }
		public TerminalNode LEFTCOR(int i) {
			return getToken(archivosParser.LEFTCOR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTCOR() { return getTokens(archivosParser.RIGHTCOR); }
		public TerminalNode RIGHTCOR(int i) {
			return getToken(archivosParser.RIGHTCOR, i);
		}
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elementAccess);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTCOR) {
					{
					{
					setState(191);
					match(LEFTCOR);
					setState(192);
					expression();
					setState(193);
					match(RIGHTCOR);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTCOR:
			case PIZQ:
			case SUB:
			case LEN:
			case ID:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				expression();
				setState(204);
				moreExpressions();
				}
				break;
			case DOSPUN:
			case RIGHTCOR:
			case PDER:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoreExpressionsContext extends ParserRuleContext {
		public List<TerminalNode> COMA() { return getTokens(archivosParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(archivosParser.COMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_moreExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(209);
				match(COMA);
				setState(210);
				expression();
				}
				}
				setState(215);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(archivosParser.INT, 0); }
		public TerminalNode SUB() { return getToken(archivosParser.SUB, 0); }
		public TerminalNode FLOAT() { return getToken(archivosParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(archivosParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(archivosParser.STRING, 0); }
		public TerminalNode ID() { return getToken(archivosParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(archivosParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(archivosParser.PDER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public TerminalNode LEN() { return getToken(archivosParser.LEN, 0); }
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveExpression);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(216);
					match(SUB);
					}
					break;
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				match(INT);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(221);
					match(SUB);
					}
					break;
				case FLOAT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				match(FLOAT);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(ID);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(229);
					match(PIZQ);
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(230);
						expressionList();
						}
						break;
					}
					setState(233);
					match(PDER);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(PIZQ);
				setState(237);
				expression();
				setState(238);
				match(PDER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				listExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				match(LEN);
				setState(242);
				match(PIZQ);
				setState(243);
				expression();
				setState(244);
				match(PDER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ParserRuleContext {
		public TerminalNode LEFTCOR() { return getToken(archivosParser.LEFTCOR, 0); }
		public TerminalNode RIGHTCOR() { return getToken(archivosParser.RIGHTCOR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LEFTCOR);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(249);
				expressionList();
				}
				break;
			}
			setState(252);
			match(RIGHTCOR);
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
		"\u0004\u0001-\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003"+
		"X\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005\n\u0005"+
		"\f\u0005f\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0098\b\u000f\n\u000f\f\u000f\u009b\t\u000f\u0003\u000f\u009d"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00a4\b\u0011\n\u0011\f\u0011\u00a7\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00ae\b\u0013\n\u0013"+
		"\f\u0013\u00b1\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00b8\b\u0015\n\u0015\f\u0015\u00bb\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u00c4\b\u0017\n\u0017\f\u0017\u00c7\t\u0017\u0001\u0017"+
		"\u0003\u0017\u00ca\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00d0\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00d4\b"+
		"\u0019\n\u0019\f\u0019\u00d7\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00db\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00e0\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00e8\b\u001a\u0001\u001a\u0003\u001a\u00eb\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f7\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u00fb\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0003\u0002"+
		"\u0000\b\b\u000b\u000f\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015"+
		"\u0103\u00008\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004"+
		"K\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b^\u0001\u0000"+
		"\u0000\u0000\nd\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000e"+
		"o\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012{\u0001"+
		"\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0083\u0001"+
		"\u0000\u0000\u0000\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u008e\u0001"+
		"\u0000\u0000\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e\u009c\u0001"+
		"\u0000\u0000\u0000 \u009e\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000"+
		"\u0000\u0000$\u00a8\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000\u0000"+
		"(\u00b2\u0001\u0000\u0000\u0000*\u00b9\u0001\u0000\u0000\u0000,\u00bc"+
		"\u0001\u0000\u0000\u0000.\u00c9\u0001\u0000\u0000\u00000\u00cf\u0001\u0000"+
		"\u0000\u00002\u00d5\u0001\u0000\u0000\u00004\u00f6\u0001\u0000\u0000\u0000"+
		"6\u00f8\u0001\u0000\u0000\u00008<\u0003\u0002\u0001\u00009;\u0003\u0002"+
		"\u0001\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0001\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?B\u0003\u0006\u0003\u0000@B\u0003\u0016"+
		"\u000b\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CL\u0003\f\u0006\u0000DL\u0003\u0012\t\u0000E"+
		"L\u0003\u0014\n\u0000FL\u0003\u000e\u0007\u0000GL\u0003\u0016\u000b\u0000"+
		"HL\u0003\u0018\f\u0000IL\u0003\u0010\b\u0000JL\u0003\u001a\r\u0000KC\u0001"+
		"\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000"+
		"KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0017\u0000\u0000NO\u0005#\u0000\u0000OP\u0005"+
		"\t\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0005\n\u0000\u0000RV\u0005\u0002"+
		"\u0000\u0000SU\u0005,\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\u001c\u000e\u0000"+
		"Z\u0007\u0001\u0000\u0000\u0000[\\\u0005#\u0000\u0000\\_\u0003\n\u0005"+
		"\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000ac\u0005"+
		"#\u0000\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0018\u0000\u0000hi\u0003 \u0010"+
		"\u0000ij\u0005\u0002\u0000\u0000jk\u0003\u001c\u000e\u0000kl\u0005\u001d"+
		"\u0000\u0000lm\u0005\u0002\u0000\u0000mn\u0003\u001c\u000e\u0000n\r\u0001"+
		"\u0000\u0000\u0000op\u0005\u0019\u0000\u0000pq\u0003 \u0010\u0000qr\u0005"+
		"\u0002\u0000\u0000rs\u0003\u001c\u000e\u0000s\u000f\u0001\u0000\u0000"+
		"\u0000tu\u0005\u001e\u0000\u0000uv\u0003 \u0010\u0000vw\u0005\u001f\u0000"+
		"\u0000wx\u00030\u0018\u0000xy\u0005\u0002\u0000\u0000yz\u0003\u001c\u000e"+
		"\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0005\u001a\u0000\u0000|}\u0003"+
		" \u0010\u0000}~\u0005(\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u001b\u0000\u0000\u0080\u0081\u0003 \u0010\u0000\u0081\u0082"+
		"\u0005(\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"#\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0086\u0003 \u0010"+
		"\u0000\u0086\u0087\u0005(\u0000\u0000\u0087\u0017\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u00034\u001a\u0000\u0089\u008a\u0005\t\u0000\u0000\u008a"+
		"\u008b\u00030\u0018\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c\u008d"+
		"\u0005(\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		"0\u0018\u0000\u008f\u0090\u0005(\u0000\u0000\u0090\u001b\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005,\u0000\u0000\u0092\u0093\u0003\u001e\u000f\u0000"+
		"\u0093\u0094\u0005-\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095"+
		"\u009d\u0003\u0004\u0002\u0000\u0096\u0098\u0003\u0004\u0002\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u0095\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d"+
		"\u001f\u0001\u0000\u0000\u0000\u009e\u009f\u0003$\u0012\u0000\u009f\u00a0"+
		"\u0003\"\u0011\u0000\u00a0!\u0001\u0000\u0000\u0000\u00a1\u00a2\u0007"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0003$\u0012\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6#\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003(\u0014\u0000"+
		"\u00a9\u00aa\u0003&\u0013\u0000\u00aa%\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0007\u0001\u0000\u0000\u00ac\u00ae\u0003(\u0014\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\'\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003,\u0016"+
		"\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4)\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0007\u0002\u0000\u0000\u00b6\u00b8\u0003,\u0016\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba+\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003"+
		"4\u001a\u0000\u00bd\u00be\u0003.\u0017\u0000\u00be-\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1\u0003 \u0010\u0000"+
		"\u00c1\u00c2\u0005\u0004\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ca\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca/\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0003 \u0010\u0000\u00cc\u00cd\u00032\u0019\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d01\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d4\u0003 \u0010"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d63\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d8\u00db\u0005\u0013\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00f7\u0005$\u0000\u0000\u00dd"+
		"\u00e0\u0005\u0013\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00f7\u0005%\u0000\u0000\u00e2\u00f7"+
		"\u0005&\u0000\u0000\u00e3\u00f7\u0005\'\u0000\u0000\u00e4\u00ea\u0005"+
		"#\u0000\u0000\u00e5\u00e7\u0005\t\u0000\u0000\u00e6\u00e8\u00030\u0018"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005\n\u0000\u0000"+
		"\u00ea\u00e5\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00f7\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\t\u0000\u0000\u00ed"+
		"\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f7\u00036\u001b\u0000\u00f1\u00f2\u0005"+
		"\u001c\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3\u00f4\u0003 "+
		"\u0010\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00da\u0001\u0000\u0000\u0000\u00f6\u00df\u0001\u0000\u0000"+
		"\u0000\u00f6\u00e2\u0001\u0000\u0000\u0000\u00f6\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f6\u00e4\u0001\u0000\u0000\u0000\u00f6\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f75\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0005\u0000\u0000"+
		"\u00f9\u00fb\u00030\u0018\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0004\u0000\u0000\u00fd7\u0001\u0000\u0000\u0000\u0015<A"+
		"KV^d\u0099\u009c\u00a5\u00af\u00b9\u00c5\u00c9\u00cf\u00d5\u00da\u00df"+
		"\u00e7\u00ea\u00f6\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}