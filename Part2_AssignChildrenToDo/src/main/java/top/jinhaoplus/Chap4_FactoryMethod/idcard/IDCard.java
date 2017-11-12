package top.jinhaoplus.Chap4_FactoryMethod.idcard;

import top.jinhaoplus.Chap4_FactoryMethod.framework.Product;

public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("create IDCard for " + owner);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void use() {
        System.out.println("user IDCard of " + owner);
    }
}
