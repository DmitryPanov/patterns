package behavioral.interpreter;

public class MinusExpression implements Expression {
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpret(Expression context) {
        return left.interpret(context) - right.interpret(context);
    }
}
