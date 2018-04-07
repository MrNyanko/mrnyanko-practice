package gof.flayweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> pool = new HashMap<>();

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }

    public Flyweight getFlyweight(String key) {
        return pool.get(key);
    }
}
