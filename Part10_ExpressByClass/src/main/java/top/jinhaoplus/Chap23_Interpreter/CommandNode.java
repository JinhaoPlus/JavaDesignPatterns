package top.jinhaoplus.Chap23_Interpreter;

/**
 * 指令: 循环指令或基本指令
 * <command> ::= <repeat_command> | <primitive_command>
 */
public class CommandNode extends Node {
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
