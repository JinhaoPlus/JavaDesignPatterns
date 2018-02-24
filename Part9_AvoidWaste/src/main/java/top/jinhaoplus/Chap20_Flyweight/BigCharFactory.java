package top.jinhaoplus.Chap20_Flyweight;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {

    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = (BigChar) pool.get(charname);
        if (bigChar == null) {
            bigChar = new BigChar(charname);
            pool.put(charname, bigChar);
        }
        return bigChar;
    }
}
