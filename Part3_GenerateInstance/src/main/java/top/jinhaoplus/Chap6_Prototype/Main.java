package top.jinhaoplus.Chap6_Prototype;

import top.jinhaoplus.Chap6_Prototype.framework.Manager;
import top.jinhaoplus.Chap6_Prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");

        p1.use("Hello world");
        p2.use("Hello world");
        p3.use("Hello world");
    }
}
