package expressivo;

import java.util.Objects;

public class Number implements Expression{
	
	 private final double v;

	    public Number(double v) {
	        this.v = v;
	    }

	    @Override
	    public String toString() {
	    	//giving back the string
	        return Double.toString(v);
	    }

	    @Override
	    public boolean equals(Object ob) {
	        if (ob == this) {
	            return true; 
	        }
	        if (ob instanceof Number) {
	            Number other = (Number) ob; 
	            //checking if they are equal
	            return v == other.v || (Double.isNaN(v) && Double.isNaN(other.v));  
	        }
	        return false;  
	    }


	    @Override
	    public int hashCode() {
	    	//returning the hash values
	        return Objects.hash(v);
	    }

}
