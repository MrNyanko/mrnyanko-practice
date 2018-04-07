package gof.state;

public class ConcreteState1 implements State {
    private static ConcreteState1 concreteState1 = new ConcreteState1();

    public static ConcreteState1 getInstance() {
        return concreteState1;
    }

    private ConcreteState1() {
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodC() {

    }

    @Override
    public void methodD() {

    }
}
