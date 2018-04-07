package gof.state;

public abstract class Context {
    private State state;

    public abstract void requestX();
    public abstract void requestY();
    public abstract void requestZ();
}
