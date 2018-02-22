package top.jinhaoplus.Chap13_Visitor;

public interface Element {
    public abstract void accept(Visitor visitor);
}
