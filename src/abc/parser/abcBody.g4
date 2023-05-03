/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar abcBody;
import Configuration;

root : (abcline)+ EOF;
abcline : (element)+ endofline | fieldvoice | COMMENT;
element : noteelement | tupletelement | barline | nthrepeat | WHITESPACE; 

noteelement : note | multinote;

note : noteorrest notelength?;
noteorrest : pitch | rest;
pitch : accidental? basenote octave?;
octave: OCTAVE;
notelength: NOTELENGTH;

accidental: ACCIDENTAL;
basenote: BASENOTE;

rest : 'z';

tupletelement : tupletspec noteelement+;
tupletspec : TUPLETSPEC;


multinote : '[' note+ ']';

barline : '|'|'||'|'[|'|'|]'|':|'|'|:';
nthrepeat : NTHREPEAT;

fieldvoice : BODYVOICE;

TUPLETSPEC: '(' [0-9];
NTHREPEAT: '[1'|'[2';
NOTELENGTH: ([0-9]+)? ('/' ([0-9]+)?)?;
BODYVOICE: ('V: '|'V:') ([A-Za-z.0-9])+ ('\n' | '\r'('\n')?);
COMMENT: '%' ([A-Za-z.])* ('\n' | '\r'('\n')?);
endofline : NEWLINE;

ACCIDENTAL:  '^'|'^^'|'_'|'__'|'=';
BASENOTE: ('C'|'D'|'E'|'F'|'G'|'A'|'B'|'c'|'d'|'e'|'f'|'g'|'a'|'b');
OCTAVE: '\''+ | ','+;
DIGIT : [0-9];
NEWLINE : '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';
