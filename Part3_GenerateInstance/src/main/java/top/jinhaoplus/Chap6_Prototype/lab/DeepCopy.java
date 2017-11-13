package top.jinhaoplus.Chap6_Prototype.lab;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy implements Cloneable {
    private String a;
    private int b;
    private List<String> array;

    // the clone process don't invoke construct method
    public DeepCopy() {
        System.out.println("construct!");
    }

    public DeepCopy createClone() {
        try {
            return (DeepCopy) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = (DeepCopy) super.clone();
        List<String> cloneArray = new ArrayList<>();
        deepCopy.array.forEach(ele -> cloneArray.add(ele));
        deepCopy.setArray(cloneArray);
        return deepCopy;
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
