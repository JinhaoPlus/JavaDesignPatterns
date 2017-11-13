package top.jinhaoplus.Chap3_TemplateMethod;

public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}