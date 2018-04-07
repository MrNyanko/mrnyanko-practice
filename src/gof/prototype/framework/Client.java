package gof.prototype.framework;

import java.util.HashMap;

public class Client {
    private HashMap<String, Prototype> showcase = new HashMap<>();

    public void register(String name, Prototype prototype) {
        showcase.put(name, prototype);
    }
    public Prototype create(String prototypeName) {
        return showcase.get(prototypeName);
    }
}
