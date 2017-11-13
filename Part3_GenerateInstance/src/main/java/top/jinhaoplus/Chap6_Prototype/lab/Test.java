package top.jinhaoplus.Chap6_Prototype.lab;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setA("AAA");
        shallowCopy.setB(1);
        shallowCopy.setArray(new ArrayList<String>() {{
            add("a1");
            add("a2");
        }});
        ShallowCopy newClone = shallowCopy.createClone();
        shallowCopy.getArray().set(0, "a3");
        System.out.println(shallowCopy);
        System.out.println(newClone);

        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setA("AAA");
        deepCopy.setB(1);
        deepCopy.setArray(new ArrayList<String>() {{
            add("a1");
            add("a2");
        }});
        DeepCopy newDeepClone = deepCopy.createClone();
        deepCopy.getArray().set(0, "a3");
        System.out.println(deepCopy);
        System.out.println(newDeepClone);
    }
}
