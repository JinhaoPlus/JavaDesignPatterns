package top.jinhaoplus.Chap17_Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObersver(observer1);
        generator.addObersver(observer2);
        generator.execute();
    }
}
