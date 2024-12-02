package expressivo;

import java.util.Objects;

public class Variables implements Expression {

	private final String v;

    public Variables(String v) {
    	//checking if they are empty
        if (v == null || v.isEmpty()) {
            throw new IllegalArgumentException("Variable is empty");
        }
        this.v = v;
    }

    @Override
    public String toString() {
    	//returning the string
        return v;
        
    }
    @Override
    public Expression differentiate(String var) {
        if (this.v.equals(var)) {
            return new Number(1);  // The derivative of 'v' with respect to 'v' is 1
        } else {
            return new Number(0);  // The derivative of 'v' with respect to another variable is 0
        }
    }
    

    @Override
    public boolean equals(Object Ob) {
        if (this ==  Ob) return true;
        if (Ob == null || getClass() != Ob.getClass()) return false;
        //checking if they are equal
        Variables that = (Variables) Ob;
        return v.equals(that.v);
    }

    @Override
    public int hashCode() {
    	//checking hash values
        return Objects.hash(v);
    }
}
