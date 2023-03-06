package behavioral.interpreter;

import java.util.Stack;

public class Evaluate implements Expression {
    Expression evaluate;

    public Evaluate(String context) {
        Stack<Expression> expressions = new Stack<>();
        String reverseExpression = new StringBuilder(context).reverse().toString();
        for (String str : reverseExpression.split("\\D")) {
            expressions.push(new NumberExpression(Integer.parseInt(str)));
        }
        for (String str : context.split("\\d")) {
            if (str.equals("+")) {
                expressions.push(new PlusExpression(expressions.pop(), expressions.pop()));
            } else if (str.equals("-")) {
                expressions.push(new MinusExpression(expressions.pop(), expressions.pop()));
            }
        }
        evaluate = expressions.pop();
    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
