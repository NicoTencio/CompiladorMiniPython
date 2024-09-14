grammar archivos;

@lexer::header {
  import com.example.myapplication.DenterHelper;
}

tokens { INDENT, DEDENT }

@lexer::members {
  private final DenterHelper denter = DenterHelper.builder()
    .nl(NEWLINE)
    .indent(archivosParser.INDENT)
    .dedent(archivosParser.DEDENT)
    .pullToken(archivosLexer.super::nextToken);

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}



program : mainStatement (mainStatement)*;
mainStatement : defStatement | assignStatement;
statement : ifStatement
            | returnStatement
            | printStatement
            | whileStatement
            | assignStatement
            | functionCallStatement
            | forStatement
            | expressionStatement;
defStatement : DEF ID PIZQ argList PDER DOSPUN (INDENT)* sequence;
argList : ID moreArgs |;
moreArgs: (COMA ID)*;
ifStatement : IF expression DOSPUN  sequence ELSE DOSPUN sequence;
whileStatement : WHILE expression DOSPUN sequence;
forStatement : FOR expression IN expressionList DOSPUN sequence;
returnStatement : RETURN expression NEWLINE ;
printStatement : PRINT expression NEWLINE ;
assignStatement : ID IGUAL expression NEWLINE;
functionCallStatement : primitiveExpression PIZQ expressionList PDER NEWLINE;
expressionStatement : expressionList NEWLINE;
sequence : INDENT moreStatements DEDENT;
moreStatements : statement  | (statement)* ;
expression : additionExpression comparison;
comparison : ((MENORQUE|MAYORQUE|MENORIGUAL|MAYORIGUAL|IGUALIGUAL|IGUAL) additionExpression)*;
additionExpression : multiplicationExpression additionFactor;
additionFactor : ((SUM|SUB) multiplicationExpression)*;
multiplicationExpression : elementExpression multiplicationFactor;
multiplicationFactor : ((MUL|DIV) elementExpression)*;
elementExpression : primitiveExpression elementAccess;
elementAccess : (LEFTCOR expression RIGHTCOR)* |;
expressionList : expression moreExpressions |;
moreExpressions : (COMA expression)* ;
primitiveExpression : ((SUB|) INT)
                    | ((SUB|) FLOAT)
                    | CHAR
                    | STRING
                    | ID (PIZQ (expressionList)? PDER)?
                    | PIZQ expression PDER
                    | listExpression
                    | LEN PIZQ expression PDER;
listExpression : LEFTCOR (expressionList)? RIGHTCOR  ;

PyCOMA : ';';
DOSPUN : ':';
COMA : ',';
RIGHTCOR : ']';
LEFTCOR : '[';
RIGHTKEY : '}';
LEFTKEY : '{';
IGUAL : '=';
PIZQ : '(';
PDER : ')';
MENORQUE : '<';
MAYORQUE : '>';
MENORIGUAL : '<=';
MAYORIGUAL : '>=';
IGUALIGUAL : '==';
SUMAR: '+=';
RESTAR: '-=';
SUM : '+';
SUB : '-';
MUL : '*';
DIV : '/';
GUIONBAJO : '_';


//Palabras reservadas

DEF : 'def';
IF : 'if';
WHILE : 'while';
RETURN : 'return';
PRINT : 'print';
LEN : 'len';
ELSE : 'else';
FOR : 'for';
IN : 'in';


SPACE : [' '+\r\n\t] -> skip;
COMILLASSIMPLES : '\'';
COMILLAS : '"';

ID : LETTER (LETTER|DIGIT|GUIONBAJO)*;
INT : [0-9]+;
FLOAT : [0-9]+'.'[0-9]* ;
CHAR : COMILLASSIMPLES (LETTER|DIGIT) COMILLASSIMPLES;
STRING: '"' (ESC | ~["\\])* '"';

NEWLINE : ('\r'? '\n' (' ' | '\t')*);
COMMENT: '"""' .*? '"""' -> skip;
COMENTARIO: '#' ~('\r' | '\n')* -> skip;
TOKENEXTRA: '\n\t' -> skip;
fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;
fragment ESC: '\\' .;






