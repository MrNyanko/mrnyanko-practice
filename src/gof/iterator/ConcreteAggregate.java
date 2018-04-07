package gof.iterator;

public class ConcreteAggregate implements Aggregate {
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
