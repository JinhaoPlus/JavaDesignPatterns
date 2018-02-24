package top.jinhaoplus.Chap23_Interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
