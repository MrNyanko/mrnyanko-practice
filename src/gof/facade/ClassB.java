package gof.facade;

public class ClassB {
    public void method() {
        ClassC classC = new ClassC();
        classC.method();
    }
}
