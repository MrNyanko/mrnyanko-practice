package gof.tamplate_method;

public abstract class AbstractClass {
    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

    public void templateMethod() {
        method1();
        method2();
        method3();
    }
}
