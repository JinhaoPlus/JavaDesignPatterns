package top.jinhaoplus.Chap10_Strategy;

public class Hand {
    public static final int HANDVALUE_STONE = 0;
    public static final int HANDVALUE_SCISS = 1;
    public static final int HANDVALUE_CLOTH = 2;
    public static final Hand[] hand = {
            new Hand(HANDVALUE_STONE),
            new Hand(HANDVALUE_SCISS),
            new Hand(HANDVALUE_CLOTH),
    };

    private static final String[] name = {
            "石头", "剪刀", "布",
    };

    private int handvalue;

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    public int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handvalue];
    }
}
