package top.jinhaoplus.Chap23_Interpreter;

/**
 * 循环指令: 循环执行的指令
 * <repeat_command> ::= repeat <number><command_list>
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
