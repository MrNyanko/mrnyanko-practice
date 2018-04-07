package gof.abstract_factory.factory;

public abstract class AbstractFactory {
    public static AbstractFactory getFactory(String classname) {
        AbstractFactory abstractFactory = null;
        try {
            abstractFactory = (AbstractFactory) Class.forName(classname).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return abstractFactory;
    }

    public abstract AbstractProduct1 createProduct1();

    public abstract AbstractProduct2 createProduct2();

    public abstract AbstractProduct3 createProduct3();

}
