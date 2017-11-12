package top.jinhaoplus.Chap2_Adapter;


public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
