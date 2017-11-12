package top.jinhaoplus.Chap3_TemplateMethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay displayC = new CharDisplay('C');
        AbstractDisplay displayS = new StringDisplay("Hello, CCC!");
        displayC.display();
        displayS.display();
    }
}
