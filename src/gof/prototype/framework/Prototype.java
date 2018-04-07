package gof.prototype.framework;

public interface Prototype extends Cloneable{
    public abstract Prototype createClone();
}
