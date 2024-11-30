/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;



import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    //tests for variabless
    @Test
    public void testConstructorToString() {
    	//checking if the variable is being returned
       
        Variables v1 = new Variables("a");
        assertEquals("a", v1.toString());

       
        Variables v2 = new Variables("b");
        assertEquals("b", v2.toString());
    }
    
    @Test
    public void testEqualAndHash() {
        Variables v1 = new Variables("a");
        Variables v2 = new Variables("a");
        Variables v3 = new Variables("b");

        //checking if 2 same variables are same
        assertTrue(v1.equals(v2));  
        assertEquals(v1.hashCode(), v2.hashCode());  
       //checking if 2 variables are different and are handled
        assertFalse(v1.equals(v3));  
        assertNotEquals(v1.hashCode(), v3.hashCode());  

       
        assertTrue(v1.equals(v1));  

       
        assertFalse(v1.equals(null));  
    }
//tests for numberss
    @Test
    public void testCAndS() {
        //returning a positive number
        Number num1 = new Number(3.0);
        assertEquals("3.0", num1.toString());

        
        //returning a negative number
        Number num2 = new Number(-2.16);
        assertEquals("-2.16", num2.toString());

        
    }

  
    @Test
    public void testEqualAndHash2() {
       
        Number num1 = new Number(3.0);
        Number num2 = new Number(3.0);
        //checking if the numbers are same
        assertTrue(num1.equals(num2));  
        assertEquals(num1.hashCode(), num2.hashCode());  

        

       
        assertTrue(num1.equals(num1));  

       
    }
    //tests for the addition
    @Test
    public void testSameExpressions() {
        Expression l = new Number(1);
        Expression r = new Number(2);
        
        Addition a1 = new Addition(l, r);
        Addition a2 = new Addition(l, r);

       //here we are checking both of them are equal
        assertTrue(a1.equals(a2));
    }
    
    @Test
    public void testDifferentExpressions() {
        Expression l = new Number(1);
        Expression r = new Number(2);
        
        Expression l2 = new Number(3);
        Expression r2 = new Number(2);
//checking if both are same 
        Addition addition1 = new Addition(l, r);
        Addition addition2 = new Addition(l2, r2);

       
        assertFalse(addition1.equals(addition2));
    }
    
    //tests for multiplication
    @Test
    public void testDifferentOperands() {
       
        Expression lft1 = new Number(2);  
        Expression rght1 = new Number(6); 
        
        Expression lft2 = new Number(4);  
        Expression rght2 = new Number(2); 
        // checking the multiplication of different 
        
        Multiplication m1 = new Multiplication(lft1, rght1);
        Multiplication m2 = new Multiplication(lft2, rght2);

        
        assertFalse(m1.equals(m2));
        
    }

    
    @Test
    public void testSameOperands() {
        
        Expression lft = new Number(2);   
        Expression rght = new Number(2); 
        
        Multiplication m1 = new Multiplication(lft, rght);
        Multiplication m2 = new Multiplication(lft, rght);

        
        assertTrue(m1.equals(m2));
    }
    
    
}
