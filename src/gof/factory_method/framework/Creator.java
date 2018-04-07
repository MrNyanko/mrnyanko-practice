package gof.factory_method.framework;

public abstract class Creator {
    public final Product create() {
        return factoryMethod();
    }

    protected abstract Product factoryMethod();
}
