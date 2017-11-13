package top.jinhaoplus.Chap5_SIngleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start11...");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        System.out.println("End1...");

        System.out.println("Start2...");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                UnsafeSingleton unsafeSingleton1 = UnsafeSingleton.getInstance();
                System.out.println(unsafeSingleton1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                UnsafeSingleton unsafeSingleton2 = UnsafeSingleton.getInstance();
                System.out.println(unsafeSingleton2);
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("End2...");

        System.out.println("Start3...");

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                SafeSingleton safeSingleton1 = SafeSingleton.getInstance();
                System.out.println(safeSingleton1);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                SafeSingleton safeSingleton2 = SafeSingleton.getInstance();
                System.out.println(safeSingleton2);
            }
        });
        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("End3...");
    }
}
