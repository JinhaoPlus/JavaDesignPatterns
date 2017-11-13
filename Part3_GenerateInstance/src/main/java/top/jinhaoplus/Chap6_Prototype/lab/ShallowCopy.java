package top.jinhaoplus.Chap6_Prototype.lab;

import java.util.List;

public class ShallowCopy implements Cloneable {
    private String a;
    private int b;
    private List<String> array;

    // the clone process don't invoke construct method
    public ShallowCopy() {
        System.out.println("construct!");
    }

    public ShallowCopy createClone() {
        try {
            return (ShallowCopy) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }
}
