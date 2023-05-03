/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar abcBody;
import Configuration;

root : abcline+ EOF;
abcline : element* endofline | fieldvoice | comment;
element : noteelement | tupletelement | barline | nthrepeat; 

noteelement : note | multinote;

note : noteorrest notelength?;
noteorrest : pitch | rest;
pitch : accidental? basenote octave?;
octave : '\''+ | ','+;
notelength : (DIGIT+)? ('/' (DIGIT+)?)?;

accidental : '^' | '^^' | '_' | '__' | '=';

basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

rest : 'z';

tupletelement : tupletspec noteelement+;
tupletspec : '(' DIGIT; 


multinote : '[' note+ ']';

barline : '|' | '||' | '[|' | '|]' | ':|' | '|:';
nthrepeat : '[1' | '[2';

fieldvoice : 'V:' (STRING | DIGIT)+ endofline;

comment : '%' STRING NEWLINE;
endofline : comment | NEWLINE;

DIGIT : [0-9];
STRING: [a-zA-Z'\'''\.'',']+;
NEWLINE : '\n' | '\r' '\n'?;
SPACES : [ ]+ -> skip;