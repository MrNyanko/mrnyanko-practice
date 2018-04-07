package gof.abstract_factory.concretefactory;

import gof.abstract_factory.factory.AbstractFactory;
import gof.abstract_factory.factory.AbstractProduct1;
import gof.abstract_factory.factory.AbstractProduct2;
import gof.abstract_factory.factory.AbstractProduct3;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public AbstractProduct1 createProduct1() {
        return new ConcreteProduct1();
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ConcreteProduct2();
    }

    @Override
    public AbstractProduct3 createProduct3() {
        return new ConcreteProduct3();
    }
}
