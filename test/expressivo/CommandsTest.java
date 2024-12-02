/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the static methods of Commands.
 */
public class CommandsTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; 
    }
    
    @Test
    public void testDifferentiateVariable() {
        String expr = "x";         
        String variable = "x";    
        
        
        String expected = "1";    
        
        String result = Commands.differentiate(expr, variable);  
        
        assertEquals(expected, result);  
    }

    
    
    // TODO tests for Commands.differentiate() and Commands.simplify()
    
}
