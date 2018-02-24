package top.jinhaoplus.Chap21_Proxy;

public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyjob("constructing a instance of Printer");
    }

    public Printer(String name) {
        this.name = name;
        heavyjob("constructing a instance of Printer(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyjob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("END");
    }

}
