package expressivo;
import java.util.Objects;

public class Addition implements Expression {
    private final Expression left, right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Addition addition = (Addition) obj;
        return left.equals(addition.left) && right.equals(addition.right);
    }
    @Override
    public Expression differentiate(String v) {
       
        Expression leftD = left.differentiate(v);
        Expression rightD = right.differentiate(v);

        
        return new Addition(leftD, rightD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}

	



