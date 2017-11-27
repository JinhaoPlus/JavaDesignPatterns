package top.jinhaoplus.Chap10_Strategy;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Taro", new WinningStrategy(314));
        Player player2 = new Player("Hana", new ProbStrategy(15));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even: ");
                player2.even();
                player1.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
