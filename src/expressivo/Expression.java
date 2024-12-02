/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;
import java.io.IOException;
/**
 * An immutable data type representing a polynomial expression of:
 *   + and *
 *   nonnegative integers and floating-point numbers
 *   variables (case-sensitive nonempty strings of letters)
 * 
 * <p>PS3 instructions: this is a required ADT interface.
 * You MUST NOT change its name or package or the names or type signatures of existing methods.
 * You may, however, add additional methods, or strengthen the specs of existing methods.
 * Declare concrete variants of Expression in their own Java source files.
 */
public interface Expression {
    
    
	public static Expression parse(String in) throws IOException {
	    in = in.replaceAll("\\s+", ""); 
	    return parseExpression(in);
	}

	private static Expression parseExpression(String in) throws IOException {
	    return parseAdd(in);
	}

	
	private static Expression parseAdd(String in) throws IOException {
	    Expression lft = parseMulti(in);
	    if (lft == null) return null;

	    while (in.length() > 0 && (in.charAt(0) == '+' )) {
	        String operator = String.valueOf(in.charAt(0));
	        in = in.substring(1); 
	        Expression right = parseMulti(in);
	        if (right == null) throw new IOException("Invalid expression: missing operand after operator");
	        if (operator.equals("+")) {
	            lft = new Addition(lft, right); 
	        }
	        
	    }

	    return lft;
	}

	
	private static Expression parseMulti(String in) throws IOException {
	    Expression lft = parsePr(in);
	    if (lft == null) return null;

	    while (in.length() > 0 && (in.charAt(0) == '*' )) {
	        String op = String.valueOf(in.charAt(0));
	        in = in.substring(1); 
	        Expression rght = parsePr(in);
	        if (rght == null) throw new IOException("Invalid expression: missing operand after operator");
	        lft = new Multiplication(lft, rght); 
	    }

	    return lft;
	}

	// Parse primary expressions (numbers, variables, or parentheses)
	private static Expression parsePr(String input) throws IOException {
	    if (input.isEmpty()) return null;

	    // Handle numbers (integers or floats)
	    if (Character.isDigit(input.charAt(0)) || input.charAt(0) == '.') {
	        int endInx = 0;
	        while (endInx < input.length() && (Character.isDigit(input.charAt(endInx)) || input.charAt(endInx) == '.')) {
	            endInx++;
	        }
	        String numberStr = input.substring(0, endInx);
	        double value = Double.parseDouble(numberStr);
	        input = input.substring(endInx); 
	        return new Number(value);
	    }

	    if (Character.isLetter(input.charAt(0))) {
	        int endInx = 0;
	        while (endInx < input.length() && (Character.isLetterOrDigit(input.charAt(endInx)))) {
	            endInx++;
	        }
	        String varName = input.substring(0, endInx);
	        input = input.substring(endInx);
	        return new Variables(varName);
	    }

	    
	    if (input.charAt(0) == '(') {
	        input = input.substring(1);
	        Expression innerExpr = parseExpression(input);
	        if (innerExpr == null || input.isEmpty() || input.charAt(0) != ')') {
	            throw new IOException("Invalid expression: mismatched parentheses");
	        }
	        input = input.substring(1); 
	        return innerExpr;
	    }

	   
	    throw new IOException("Invalid expression: unrecognized token");
	}


   
    /**
     * @return a parsable representation of this expression, such that
     * for all e:Expression, e.equals(Expression.parse(e.toString())).
     */
    @Override 
    public String toString();

    /**
     * @param thatObject any object
     * @return true if and only if this and thatObject are structurally-equal
     * Expressions, as defined in the PS3 handout.
     */
    @Override
    public boolean equals(Object thatObject);
    
    /**
     * @return hash code value consistent with the equals() definition of structural
     * equality, such that for all e1,e2:Expression,
     *     e1.equals(e2) implies e1.hashCode() == e2.hashCode()
     */
    @Override
    public int hashCode();
    
    // TODO more instance methods
    Expression differentiate(String var);
    
}