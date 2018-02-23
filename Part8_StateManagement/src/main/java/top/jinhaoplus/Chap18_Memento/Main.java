package top.jinhaoplus.Chap18_Memento;

import top.jinhaoplus.Chap18_Memento.game.Gamer;
import top.jinhaoplus.Chap18_Memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======== " + i);
            System.out.println("current status: " + gamer);

            gamer.bet();

            System.out.println("hold money " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("money increases a lot, keep current status");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("money decreases a lot, restore previous status");
                gamer.storeMemento(memento);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
