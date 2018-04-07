package gof.adapter.object_adapter;

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();


    @Override
    public void targetMethod1() {
        adaptee.methodA();
    }

    @Override
    public void targetMethod2() {
        adaptee.methodB();
    }
}
