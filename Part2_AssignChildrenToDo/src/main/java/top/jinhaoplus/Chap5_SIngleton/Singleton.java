package top.jinhaoplus.Chap5_SIngleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("create an instance");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
