package top.jinhaoplus.Chap5_SIngleton;

public class SafeSingleton {
    private static SafeSingleton safeSingleton;

    private SafeSingleton() {
        // assume some complex operations
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create an instance");
    }

    public static synchronized SafeSingleton getInstance() {
        if (safeSingleton == null) {
            safeSingleton = new SafeSingleton();
        }
        return safeSingleton;
    }
}
