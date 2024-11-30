package expressivo;
import java.util.Objects;

public class Addition implements Expression{
	
	    private final Expression l;
	    private final Expression r;

	    public Addition(Expression le, Expression ri) {
	        if (le == null || ri == null) {
	            throw new IllegalArgumentException("Both null");
	        }
	        this.l = le;
	        this.r = ri;
	    }

	    @Override
	    public String toString() {
	        String lStr = l.toString();
	        String rStr = r.toString();
	        //returning the strings
	        return lStr + " + " + rStr;
	    }
	    @Override
	    public boolean equals(Object ob) {
	    	//checking the true values
	        if (this == ob) {
	            return true;  
	        }
	        if (ob == null) {
	            return false;  
	        }
	        if (getClass() != ob.getClass()) {
	            return false;  
	        }

	      
	        Addition other = (Addition) ob;

	        
	        boolean lEquals = (l == null ? other.l == null : l.equals(other.l));
	        boolean riEquals = (r == null ? other.r == null : r.equals(other.r));

	        return lEquals && riEquals;
	    }

	   
	    @Override
	    public int hashCode() {
	    	//returning the hash values
	        return Objects.hash(l, r);
	    }
	}



