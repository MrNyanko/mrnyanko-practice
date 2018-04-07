package gof.facade;

public class Facade {
    public void method() {
        ClassA classA = new ClassA();
        classA.method();
        ClassB classB = new ClassB();
        classB.method();
    }
}
