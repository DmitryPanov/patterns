package behavioral.interpreter;


public class PlusExpression implements Expression {
    Expression left;
    Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Expression context) {
        return left.interpret(context) + right.interpret(context);
    }
}
