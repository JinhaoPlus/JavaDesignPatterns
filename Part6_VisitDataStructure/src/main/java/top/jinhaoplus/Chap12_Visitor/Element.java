package top.jinhaoplus.Chap12_Visitor;

public interface Element {
    public abstract void accept(Visitor visitor);
}
