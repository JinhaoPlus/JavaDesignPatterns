package top.jinhaoplus.Chap5_SIngleton;

public class UnsafeSingleton {
    private static UnsafeSingleton unsafeSingleton;

    private UnsafeSingleton() {
        // assume some complex operations
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create an instance");
    }

    public static UnsafeSingleton getInstance() {
        if (unsafeSingleton == null) {
            return new UnsafeSingleton();
        }
        return unsafeSingleton;
    }
}
