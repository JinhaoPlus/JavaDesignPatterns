package top.jinhaoplus.Chap4_FactoryMethod;

import top.jinhaoplus.Chap4_FactoryMethod.framework.Factory;
import top.jinhaoplus.Chap4_FactoryMethod.framework.Product;
import top.jinhaoplus.Chap4_FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product cardA = factory.create("AAA");
        Product cardB = factory.create("BBB");
        Product cardC = factory.create("CCC");
        cardA.use();
        cardB.use();
        cardC.use();
    }
}
