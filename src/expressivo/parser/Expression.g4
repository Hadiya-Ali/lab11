/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */



grammar Expression;

root : expression EOF;

expression 
    : addition;  // expression can be addition
         
addition
    : multiplication (('+' | '-') multiplication)*;  // addition or subtraction between multiplication expressions

multiplication
    : factor (('*' | '/') factor)*;  // multiplication or division between factors

factor
    : INTEGER                  // Integer
    | variable                 // Variable 'x'
    | INTEGER variable exponent?  // Integer with variable and optional exponent
    | variable exponent        // Variable with optional exponent
    ;

variable 
    : 'x';  // Only 'x' as the variable for now

exponent 
    : '^' INTEGER;  // Exponentiation, for example: x^2 or 3x^2

INTEGER 
    : [0-9]+;  // A sequence of digits, representing integer numbers

SPACES 
    : [ \t\r\n]+ -> skip;  // Ignore spaces, tabs, and newlines
