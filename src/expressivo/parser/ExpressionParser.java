// Generated from Expression.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTEGER=7, SPACES=8;
  public static final int
    RULE_root = 0, RULE_expression = 1, RULE_addition = 2, RULE_multiplication = 3, 
    RULE_factor = 4, RULE_variable = 5, RULE_exponent = 6;
  public static final String[] ruleNames = {
    "root", "expression", "addition", "multiplication", "factor", "variable", 
    "exponent"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'+'", "'-'", "'*'", "'/'", "'x'", "'^'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, "INTEGER", "SPACES"
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

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() { return "Expression.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }

  public ExpressionParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(14);
      expression();
      setState(15);
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

  public static class ExpressionContext extends ParserRuleContext {
    public AdditionContext addition() {
      return getRuleContext(AdditionContext.class,0);
    }
    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_expression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpression(this);
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_expression);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(17);
      addition();
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

  public static class AdditionContext extends ParserRuleContext {
    public List<MultiplicationContext> multiplication() {
      return getRuleContexts(MultiplicationContext.class);
    }
    public MultiplicationContext multiplication(int i) {
      return getRuleContext(MultiplicationContext.class,i);
    }
    public AdditionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_addition; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAddition(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAddition(this);
    }
  }

  public final AdditionContext addition() throws RecognitionException {
    AdditionContext _localctx = new AdditionContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_addition);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(19);
      multiplication();
      setState(24);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(20);
        _la = _input.LA(1);
        if ( !(_la==T__0 || _la==T__1) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        setState(21);
        multiplication();
        }
        }
        setState(26);
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

  public static class MultiplicationContext extends ParserRuleContext {
    public List<FactorContext> factor() {
      return getRuleContexts(FactorContext.class);
    }
    public FactorContext factor(int i) {
      return getRuleContext(FactorContext.class,i);
    }
    public MultiplicationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multiplication; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMultiplication(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMultiplication(this);
    }
  }

  public final MultiplicationContext multiplication() throws RecognitionException {
    MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_multiplication);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(27);
      factor();
      setState(32);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__2 || _la==T__3) {
        {
        {
        setState(28);
        _la = _input.LA(1);
        if ( !(_la==T__2 || _la==T__3) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        setState(29);
        factor();
        }
        }
        setState(34);
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

  public static class FactorContext extends ParserRuleContext {
    public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
    public VariableContext variable() {
      return getRuleContext(VariableContext.class,0);
    }
    public ExponentContext exponent() {
      return getRuleContext(ExponentContext.class,0);
    }
    public FactorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_factor; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFactor(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFactor(this);
    }
  }

  public final FactorContext factor() throws RecognitionException {
    FactorContext _localctx = new FactorContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_factor);
    int _la;
    try {
      setState(45);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(35);
        match(INTEGER);
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(36);
        variable();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(37);
        match(INTEGER);
        setState(38);
        variable();
        setState(40);
        _la = _input.LA(1);
        if (_la==T__5) {
          {
          setState(39);
          exponent();
          }
        }

        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(42);
        variable();
        setState(43);
        exponent();
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

  public static class VariableContext extends ParserRuleContext {
    public VariableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_variable; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterVariable(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitVariable(this);
    }
  }

  public final VariableContext variable() throws RecognitionException {
    VariableContext _localctx = new VariableContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_variable);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(T__4);
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

  public static class ExponentContext extends ParserRuleContext {
    public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
    public ExponentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_exponent; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExponent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExponent(this);
    }
  }

  public final ExponentContext exponent() throws RecognitionException {
    ExponentContext _localctx = new ExponentContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_exponent);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(49);
      match(T__5);
      setState(50);
      match(INTEGER);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\67\4\2\t\2\4"+
      "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3"+
      "\3\4\3\4\3\4\7\4\31\n\4\f\4\16\4\34\13\4\3\5\3\5\3\5\7\5!\n\5\f\5"+
      "\16\5$\13\5\3\6\3\6\3\6\3\6\3\6\5\6+\n\6\3\6\3\6\3\6\5\6\60\n\6\3"+
      "\7\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\3\4\3\2\5\6\65"+
      "\2\20\3\2\2\2\4\23\3\2\2\2\6\25\3\2\2\2\b\35\3\2\2\2\n/\3\2\2\2\f"+
      "\61\3\2\2\2\16\63\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3\2\2\2"+
      "\23\24\5\6\4\2\24\5\3\2\2\2\25\32\5\b\5\2\26\27\t\2\2\2\27\31\5\b"+
      "\5\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\7"+
      "\3\2\2\2\34\32\3\2\2\2\35\"\5\n\6\2\36\37\t\3\2\2\37!\5\n\6\2 \36"+
      "\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\t\3\2\2\2$\"\3\2\2\2%\60"+
      "\7\t\2\2&\60\5\f\7\2\'(\7\t\2\2(*\5\f\7\2)+\5\16\b\2*)\3\2\2\2*+\3"+
      "\2\2\2+\60\3\2\2\2,-\5\f\7\2-.\5\16\b\2.\60\3\2\2\2/%\3\2\2\2/&\3"+
      "\2\2\2/\'\3\2\2\2/,\3\2\2\2\60\13\3\2\2\2\61\62\7\7\2\2\62\r\3\2\2"+
      "\2\63\64\7\b\2\2\64\65\7\t\2\2\65\17\3\2\2\2\6\32\"*/";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}