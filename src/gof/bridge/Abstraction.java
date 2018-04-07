package gof.bridge;

public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void method1() {
        implementor.implMethodX();
    }

    public void method2() {
        implementor.implMethodY();
    }
    public void method3() {
        implementor.implMethodY();
    }

}
