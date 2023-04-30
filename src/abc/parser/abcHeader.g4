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
otherfields : fieldcomposer | fielddefaultlength | fieldmeter | fieldtempo | fieldvoice | comment;

fieldcomposer : 'C:' STRING+ endofline;
fielddefaultlength : 'L:' notelengthstrict endofline;
fieldmeter : 'M:' meter endofline;
fieldtempo : 'Q:' tempo endofline;
fieldvoice : 'V:' (STRING | DIGIT)+ endofline;

fieldkey : 'K:' key endofline;

notelengthstrict : DIGIT+ '/' DIGIT+;

key : keynote modeminor?;
keynote : basenote keyaccidental?;
keyaccidental : '#' | 'b';
modeminor : 'm';

basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

meter : 'C' | 'C|' | meterfraction;
meterfraction : DIGIT+ '/' DIGIT+;

tempo : meterfraction '=' DIGIT+;

comment : '%' STRING NEWLINE;
endofline : comment | NEWLINE;

DIGIT : [0-9];
STRING: [a-zA-Z'\'''\.'',']+;
NEWLINE : '\n' | '\r' '\n'?;

SPACES : [ ]+ -> skip;