package gof.state;

public class ConcreteState2 implements State {
    private static ConcreteState2 concreteState2 = new ConcreteState2();

    public static ConcreteState2 getInstance() {
        return concreteState2;
    }

    private ConcreteState2() {
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
