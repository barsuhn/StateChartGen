grammar StateChartDescription;

// Description language for UML statecharts
//
// TODO:
//  - exit pseudostates
//  - parallel states (compartments?)
//  - history nodes

// --------------------------------------------
// Parser
// --------------------------------------------

prog : decl* chart_decl;

decl : var_decl | event_decl | action_decl | guard_decl;

event_decl : 'event' ID (event_def | ';') ;

event_def : '{' var_decl* '}' ;

action_decl : 'action' ID param_list? ';' ;

guard_decl : 'guard' ID param_list? ';' ;

chart_decl : 'chart' ID '{' chart_def '}' ;

chart_def : (var_decl | state_action | internal_transition | state_decl | pstate_decl | transition)+ ;

state_action : 'entry' action_expr
             | 'do' action_expr
             | 'exit' action_expr ;

internal_transition : ID action_expr ;

history_decl : 'deep'? 'history' ';';

state_decl : 'state' ID (state_def | ';') ;

state_def : '{' chart_def '}' ;

pstate_decl : 'pstate' ID ID? ';';

transition : source_expr event_expr? guard_expr? action_expr_inline? '-->' dest_expr ';';

source_expr : ID ;

dest_expr : ID ;

event_expr : '+' ID;

guard_expr : '[' expr ']' ;

action_expr : '/' (action_stmt ';' | action_block);

action_expr_inline : '/' (action_stmt | action_block);

action_block : '{' (action_stmt ';')* '}' ;

action_stmt : func_call | assign_expr;

param_list : '(' (param_decl (',' param_decl)* )? ')';

param_decl : type ID;

var_decl : type ID ('=' expr)? ';'
         | 'const' type ID '=' expr ';' ;

type : array_type | simple_type ;

array_type : simple_type '[]' ;

simple_type : INTEGRAL_TYPE | FLOAT_TYPE | BOOLEAN_TYPE | STRING_TYPE ;

assignment : assign_expr ';' ;

assign_expr : lvalue ('=' | ASSIGN_OP) expr
            | lvalue ('=' | ASSIGN_OP) assign_expr ;

expr : func_call
     | item_ref
     | ('++' | '--') expr
     | expr ('++' | '--')
     | '-' expr
     | '!' expr
     | expr MUL_OP expr
     | expr ADD_OP expr
     | expr BOOL_OP expr
     | identifier
     | FLOAT
     | INT
     | BOOL
     | STRING
     | CHAR
     ;

func_call : identifier arg_list;

arg_list : '(' (expr (',' expr)*)? ')' ;

lvalue : item_ref | identifier ;

item_ref : identifier '[' expr ']' ;

identifier : ID ('.' ID)* ;

// --------------------------------------------
// Lexer
// --------------------------------------------

// Types
INTEGRAL_TYPE : 'u'? 'int' ('8'|'16'|'32'|'64') ;
FLOAT_TYPE : 'float' | 'double' ;
BOOLEAN_TYPE : 'bool' ;
STRING_TYPE : 'string' ;

// Identifiers
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;

// Unary operators
UNARY_OP : '!' ;

// Addition operators
ADD_OP : '+' | '-' ;

// Multiplication operators
MUL_OP : '*' | '-' ;

// Boolean operators
BOOL_OP : '>=' | '>' | '<=' | '<' | '==' | '!=' | '&&' | '||' ;

ASSIGN_OP : '+=' | '-=' | '*=' | '/=';

// Numbers
FLOAT :   '-'? DIGIT+ '.' DIGIT* EXP?
      |   '-'?        '.' DIGIT+ EXP?
      |   '-'? DIGIT+            EXP
      ;

HEX_INT : '0x' HEX_DIGIT+ ;

INT : '0' | NZDIGIT DIGIT* ;

// Characters and strings
CHAR : '\'' (ESCAPED_CHAR | .) '\'' ;

STRING : '"' (ESCAPED_CHAR | .)*? '"' ;

ESCAPED_CHAR : '\\"' | '\\\\' | '\\r' | '\\n' | '\\t' | '\\x' HEX_DIGIT+ ;

// Booleans
BOOL : TRUE | FALSE ;

// Comments
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;

// Whitespace
WS : [ \t\n\r]+ -> channel(HIDDEN) ;

// Fragments

fragment EXP : [Ee] [+\-]? DIGIT+ ;

fragment DIGIT : [0-9] ;
fragment NZDIGIT : [1-9] ;

fragment HEX_DIGIT : [0-9a-fA-F] ;

fragment TRUE : 'true' ;
fragment FALSE : 'false' ;
