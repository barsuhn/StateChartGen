grammar StateChartDescription;

// --------------------------------------------
// Parser
// --------------------------------------------

prog : declarations chart;

declarations : decl* ;

decl : event | action | guard ;

event : 'event' ID (event_def | ';') ;

event_def : '{' '}' ;

action : 'action' ID (action_def | ';') ;

action_def : '{' '}' ;

guard : 'guard' ID (guard_def | ';') ;

guard_def : '{' '}' ;

chart : 'chart' ID '{' chart_def '}' ;

chart_def : (state | trans)+ ;

state : 'state' ID (state_def | ';') ;

state_def : '{' chart_def '}' ;

trans : source_expr ('+' event_expr)? ('[' guard_expr ']')? ('/' action_expr)? '-->' dest_id ';';

source_expr : ID ;

dest_id : ID ;

event_expr : ID ;

guard_expr : boolean_expr | ID ;

action_expr : ID ;

boolean_expr : BOOL ;

// --------------------------------------------
// Lexer
// --------------------------------------------

// Identifiers
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;

// Numbers
FLOAT :   '-'? DIGIT+ '.' DIGIT* EXP?
      |   '-'?        '.' DIGIT+ EXP?
      |   '-'? DIGIT+            EXP
      ;

INT : '0' | NZDIGIT DIGIT* ;

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

fragment TRUE : 'true' ;
fragment FALSE : 'false' ;
