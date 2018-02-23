package top.jinhaoplus.Chap17_Observer;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int count = generator.getNumber();
        System.out.print("GraphObserver:");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
