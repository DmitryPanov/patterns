package behavioral.interpreter;

public class InterpreterPatternApi {
    public static void main(String[] args) {
        String expression = "11+2+3-4";
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
