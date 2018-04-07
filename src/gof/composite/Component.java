package gof.composite;

public abstract class Component {
    public abstract void method1();

    public abstract void method2();

    public Component add() {
        return null;
    }

    public void remove() {
    }

    public Component getChild() {
        return null;
    }

}
