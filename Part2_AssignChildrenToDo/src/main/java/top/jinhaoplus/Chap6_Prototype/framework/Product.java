package top.jinhaoplus.Chap6_Prototype.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
