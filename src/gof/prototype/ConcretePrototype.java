package gof.prototype;

import gof.prototype.framework.Prototype;

public class ConcretePrototype implements Prototype {
    @Override
    public Prototype createClone() {
        Prototype prototype = null;

        try {
            prototype = (Prototype) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
