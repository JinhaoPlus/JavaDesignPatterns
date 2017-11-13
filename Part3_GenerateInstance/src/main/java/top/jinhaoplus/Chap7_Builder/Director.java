package top.jinhaoplus.Chap7_Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greetings");
        builder.makeString("Morning To Afternoon");
        builder.makeItems(new String[]{
                "Good Morning!",
                "Good Afternoon!",
        });
        builder.makeString("Evening");
        builder.makeItems(new String[]{
                "Good Evening!",
                "Good Nignt!",
                "Bye!",
        });
        builder.close();
    }
}
