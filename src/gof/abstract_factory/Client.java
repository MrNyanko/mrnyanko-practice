package gof.abstract_factory;

import gof.abstract_factory.factory.AbstractFactory;
import gof.abstract_factory.factory.AbstractProduct1;
import gof.abstract_factory.factory.AbstractProduct2;
import gof.abstract_factory.factory.AbstractProduct3;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactory.getFactory("className");
        AbstractProduct1 abstractProduct1 = abstractFactory.createProduct1();
        AbstractProduct2 abstractProduct2 = abstractFactory.createProduct2();
        AbstractProduct3 abstractProduct3 = abstractFactory.createProduct3();
        abstractProduct1.executeA();
        abstractProduct1.executeB();
        abstractProduct2.doAlpha();
        abstractProduct2.doBeta();
        abstractProduct3.preformOne();
        abstractProduct3.preformTwo();
    }
}
