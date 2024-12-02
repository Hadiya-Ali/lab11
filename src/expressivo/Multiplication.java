package expressivo;



import java.util.Objects;


public class Multiplication implements Expression {
    private final Expression lt;
    private final Expression rt;

    
    public Multiplication(Expression lt, Expression rt) {
        if (lt == null || rt == null) {
            throw new IllegalArgumentException("Both are null.");
        }
        this.lt = lt;
        this.rt = rt;
    }

    @Override
    public String toString() {
    	
        
        String lftStr = lt.toString();
        String rghtStr = rt.toString();
        
       
        return lftStr + " * " + rghtStr;
    }

    @Override
    public boolean equals(Object ob) {
    	//checking the equal 
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;

        
        Multiplication m = (Multiplication) ob;
        
       
        return lt.equals(m.lt) && rt.equals(m.rt);
    }
    @Override
    public Expression differentiate(String var) {
        
        Expression leftD = lt.differentiate(var);
        Expression rightD = rt.differentiate(var);

        
        Expression t1 = new Multiplication(leftD, rt);
        Expression t2 = new Multiplication(lt, rightD);

   
        return new Addition(t1, t2);
    }

    @Override
    public int hashCode() {
     
        return Objects.hash(lt, rt);
    }
}

