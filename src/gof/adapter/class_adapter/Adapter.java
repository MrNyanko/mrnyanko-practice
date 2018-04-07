package gof.adapter.class_adapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public void targetMethod1() {
        methodA();
    }

    @Override
    public void targetMethod2() {
        methodB();
    }
}
