/*
* generated by Xtext
*/
grammar DebugInternalElementMatcherTestLanguage ;

// Rule Model
ruleModel :
	ruleSimple |
	ruleRuleCalls |
	ruleOptionalCalls |
	ruleRecursion |
	ruleLoop |
	ruleExpression |
	ruleRuleCalls12 |
	ruleNestedStart
;

// Rule Simple
ruleSimple :
	'#1' RULE_ID (
		'kw1' RULE_ID
	)? ruleFQN
;

// Rule FQN
ruleFQN :
	RULE_ID (
		'.' RULE_ID
	)
;

// Rule RuleCalls
ruleRuleCalls :
	'#2' ruleRuleCallsSub RULE_ID ruleRuleCallsAss1? ruleRuleCallsAss2?
;

// Rule RuleCallsSub
ruleRuleCallsSub :
	'sub'
;

// Rule RuleCallsAss1
ruleRuleCallsAss1 :
	'ass1' RULE_ID
;

// Rule RuleCallsAss2
ruleRuleCallsAss2 :
	'ass2' RULE_ID
;

// Rule OptionalCalls
ruleOptionalCalls :
	'#3' ruleOptionalCallsSub1? RULE_ID
;

// Rule OptionalCallsSub1
ruleOptionalCallsSub1 :
	ruleOptionalCallsSub2? 'sub' ruleOptionalCallsSub3?
;

// Rule OptionalCallsSub2
ruleOptionalCallsSub2 :
	'sub2' RULE_ID
;

// Rule OptionalCallsSub3
ruleOptionalCallsSub3 :
	'sub3' RULE_ID
;

// Rule Recursion
ruleRecursion :
	'#4' ruleRecursionSub
;

// Rule RecursionSub
ruleRecursionSub :
	'{' (
		ruleRecursionSub |
		RULE_ID
	)* '}' ';'?
;

// Rule Loop
ruleLoop :
	'#5' RULE_ID+ (
		'gr' RULE_ID
	)* (
		RULE_INT |
		RULE_STRING
	)*
;

// Rule Expression
ruleExpression :
	'#6' ruleAdd
;

// Rule Add
ruleAdd :
	ruleMult (
		'+' ruleMult
	)*
;

// Rule Mult
ruleMult :
	rulePrim (
		'*' rulePrim
	)*
;

// Rule Prim
rulePrim :
	RULE_INT |
	RULE_ID '(' ruleAdd (
		',' ruleAdd
	)* ')' |
	'=>' rulePrim |
	'(' ruleAdd ')'
;

// Rule RuleCalls12
ruleRuleCalls12 :
	'#7' ruleConstructor ruleField 'kw3'
;

// Rule Constructor
ruleConstructor :
	'kw1'?
;

// Rule Field
ruleField :
	RULE_ID ruleParameter
;

// Rule Parameter
ruleParameter :
	'kw2'?
;

// Rule NestedStart
ruleNestedStart :
	ruleNestedStartSub RULE_ID
;

// Rule NestedStartSub
ruleNestedStartSub :
	'#8'
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' (
			'b' |
			't' |
			'n' |
			'f' |
			'r' |
			'u' |
			'"' |
			'\'' |
			'\\'
		) |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' {skip();}
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? {skip();}
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ {skip();}
;

RULE_ANY_OTHER :
	.
;