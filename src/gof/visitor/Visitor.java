package gof.visitor;

public abstract class Visitor {
    public abstract void visit(ConcreteElementA concreteElementA);

    public abstract void visit(ConcreteElementB concreteElementB);
}
