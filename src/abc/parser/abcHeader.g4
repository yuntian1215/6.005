/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar abcHeader;
import Configuration;

root : fieldnumber comment* fieldtitle otherfields* fieldkey EOF;

fieldnumber : 'X:' DIGIT+ endofline;
fieldtitle : 'T:' (STRING | DIGIT)+ endofline;
otherfields : (fieldcomposer | fielddefaultlength | fieldmeter | fieldtempo | fieldvoice | comment) endofline;

fieldcomposer : 'C:' STRING+ ;
fielddefaultlength : 'L:' DIGIT+ '/' DIGIT+ ;
fieldmeter : 'M:' ('C' | 'C|' | (DIGIT+ '/' DIGIT+)) ;
fieldtempo : 'Q:' (DIGIT+ '/' DIGIT+) '=' DIGIT+ ;
fieldvoice : 'V:' (STRING | DIGIT)+ ;

fieldkey : 'K:' ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') ('#'|'b')? ('M' | 'm')? ;



comment : '%' STRING NEWLINE;
endofline : comment | NEWLINE;

DIGIT : [0-9];
STRING: [a-zA-Z'\'''\.'',']+;
NEWLINE : '\n' | '\r' '\n'?;

SPACES : [ ]+ -> skip;