package top.jinhaoplus.Chap23_Interpreter;

/**
 * 程序
 * <program_node> ::= program <command_list>
 */
public class ProgramNode extends Node {

    private CommandListNode commoandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commoandListNode = new CommandListNode();
        commoandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commoandListNode + "]";
    }
}
