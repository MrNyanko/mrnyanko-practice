package gof.factory_method.concrete;

import gof.factory_method.framework.Creator;
import gof.factory_method.framework.Product;

public class ConcreteCreator extends Creator{
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
