package gof.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractExpression abstractExpression = new TerminalExpression();
    }
}
