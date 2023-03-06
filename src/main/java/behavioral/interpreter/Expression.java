package behavioral.interpreter;

public interface Expression {
    int interpret(Expression context);
}
