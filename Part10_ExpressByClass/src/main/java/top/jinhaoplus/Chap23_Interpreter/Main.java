package top.jinhaoplus.Chap23_Interpreter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(Main.class.getClassLoader().getResourceAsStream("program.txt")));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
