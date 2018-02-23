package top.jinhaoplus.Chap18_Memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private static String[] fruitsname = {
            "apple", "grape", "banana", "orange"
    };
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        switch (dice) {
            case 1:
                money += 100;
                System.out.println("money increases");
                break;
            case 2:
                money /= 2;
                System.out.println("money decrease");
                break;
            case 6:
                String fruit = getFruit();
                System.out.println("get fruit(" + fruit + ")");
                fruits.add(fruit);
                break;
            default:
                System.out.println("noting happened");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = (String) iterator.next();
            if (fruit.startsWith("yummy")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void storeMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "yummy";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
