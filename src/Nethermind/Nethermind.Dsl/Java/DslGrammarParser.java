// Generated from DslGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DslGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARITHMETIC_SYMBOL=1, SOURCE=2, WATCH=3, WHERE=4, PUBLISH=5, AND=6, OR=7, 
		CONTAINS=8, WEBSOCKETS=9, LOG_PUBLISHER=10, WORD=11, DIGIT=12, ADDRESS=13, 
		WS=14;
	public static final int
		RULE_init = 0, RULE_expression = 1, RULE_sourceExpression = 2, RULE_watchExpression = 3, 
		RULE_whereExpression = 4, RULE_publishExpression = 5, RULE_andCondition = 6, 
		RULE_orCondition = 7, RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "expression", "sourceExpression", "watchExpression", "whereExpression", 
			"publishExpression", "andCondition", "orCondition", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'SOURCE'", "'WATCH'", "'WHERE'", "'PUBLISH'", "'AND'", "'OR'", 
			"'CONTAINS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARITHMETIC_SYMBOL", "SOURCE", "WATCH", "WHERE", "PUBLISH", "AND", 
			"OR", "CONTAINS", "WEBSOCKETS", "LOG_PUBLISHER", "WORD", "DIGIT", "ADDRESS", 
			"WS"
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
	public String getGrammarFileName() { return "DslGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DslGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE) | (1L << WATCH) | (1L << WHERE) | (1L << PUBLISH) | (1L << AND) | (1L << OR))) != 0)) {
				{
				{
				setState(18);
				expression();
				}
				}
				setState(23);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SourceExpressionContext sourceExpression() {
			return getRuleContext(SourceExpressionContext.class,0);
		}
		public WatchExpressionContext watchExpression() {
			return getRuleContext(WatchExpressionContext.class,0);
		}
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public PublishExpressionContext publishExpression() {
			return getRuleContext(PublishExpressionContext.class,0);
		}
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOURCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				sourceExpression();
				}
				break;
			case WATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				watchExpression();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				whereExpression();
				}
				break;
			case PUBLISH:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				publishExpression();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				andCondition();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				orCondition();
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

	public static class SourceExpressionContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(DslGrammarParser.SOURCE, 0); }
		public TerminalNode WORD() { return getToken(DslGrammarParser.WORD, 0); }
		public SourceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterSourceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitSourceExpression(this);
		}
	}

	public final SourceExpressionContext sourceExpression() throws RecognitionException {
		SourceExpressionContext _localctx = new SourceExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(SOURCE);
			setState(33);
			match(WORD);
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

	public static class WatchExpressionContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(DslGrammarParser.WATCH, 0); }
		public TerminalNode WORD() { return getToken(DslGrammarParser.WORD, 0); }
		public WatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterWatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitWatchExpression(this);
		}
	}

	public final WatchExpressionContext watchExpression() throws RecognitionException {
		WatchExpressionContext _localctx = new WatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_watchExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(WATCH);
			setState(36);
			match(WORD);
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

	public static class WhereExpressionContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DslGrammarParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitWhereExpression(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(WHERE);
			setState(39);
			condition();
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

	public static class PublishExpressionContext extends ParserRuleContext {
		public TerminalNode PUBLISH() { return getToken(DslGrammarParser.PUBLISH, 0); }
		public TerminalNode WORD() { return getToken(DslGrammarParser.WORD, 0); }
		public TerminalNode WEBSOCKETS() { return getToken(DslGrammarParser.WEBSOCKETS, 0); }
		public TerminalNode LOG_PUBLISHER() { return getToken(DslGrammarParser.LOG_PUBLISHER, 0); }
		public PublishExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publishExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterPublishExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitPublishExpression(this);
		}
	}

	public final PublishExpressionContext publishExpression() throws RecognitionException {
		PublishExpressionContext _localctx = new PublishExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_publishExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PUBLISH);
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==WEBSOCKETS || _la==LOG_PUBLISHER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			match(WORD);
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

	public static class AndConditionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DslGrammarParser.AND, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitAndCondition(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_andCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(AND);
			setState(46);
			condition();
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

	public static class OrConditionContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(DslGrammarParser.OR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitOrCondition(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(OR);
			setState(49);
			condition();
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
		public List<TerminalNode> WORD() { return getTokens(DslGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(DslGrammarParser.WORD, i);
		}
		public TerminalNode ARITHMETIC_SYMBOL() { return getToken(DslGrammarParser.ARITHMETIC_SYMBOL, 0); }
		public TerminalNode CONTAINS() { return getToken(DslGrammarParser.CONTAINS, 0); }
		public TerminalNode DIGIT() { return getToken(DslGrammarParser.DIGIT, 0); }
		public TerminalNode ADDRESS() { return getToken(DslGrammarParser.ADDRESS, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslGrammarListener ) ((DslGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(WORD);
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==ARITHMETIC_SYMBOL || _la==CONTAINS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << DIGIT) | (1L << ADDRESS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\13\f\4\2\3\3\n\n\3\2\r"+
		"\17\2\66\2\27\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f+"+
		"\3\2\2\2\16/\3\2\2\2\20\62\3\2\2\2\22\65\3\2\2\2\24\26\5\4\3\2\25\24\3"+
		"\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3"+
		"\2\2\2\32!\5\6\4\2\33!\5\b\5\2\34!\5\n\6\2\35!\5\f\7\2\36!\5\16\b\2\37"+
		"!\5\20\t\2 \32\3\2\2\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2"+
		" \37\3\2\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\r\2\2$\7\3\2\2\2%&\7\5\2\2&\'\7"+
		"\r\2\2\'\t\3\2\2\2()\7\6\2\2)*\5\22\n\2*\13\3\2\2\2+,\7\7\2\2,-\t\2\2"+
		"\2-.\7\r\2\2.\r\3\2\2\2/\60\7\b\2\2\60\61\5\22\n\2\61\17\3\2\2\2\62\63"+
		"\7\t\2\2\63\64\5\22\n\2\64\21\3\2\2\2\65\66\7\r\2\2\66\67\t\3\2\2\678"+
		"\t\4\2\28\23\3\2\2\2\4\27 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}