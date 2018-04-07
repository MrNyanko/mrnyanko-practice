package gof.bridge;

public class RefineAbstraction extends Abstraction {
    public RefineAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refineMethodA() {
        method1();
    }

    public void refineMethodB() {
        method2();
    }
}
