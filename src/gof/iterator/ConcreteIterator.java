package gof.iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate concreteAggregate;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
