package top.jinhaoplus.Chap3_TemplateMethod;

public class StringDisplay extends AbstractDisplay {

    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    protected void open() {
        prinrln();
    }

    protected void print() {
        System.out.println("|" + string + "|");
    }

    protected void close() {
        prinrln();
    }

    private void prinrln() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
