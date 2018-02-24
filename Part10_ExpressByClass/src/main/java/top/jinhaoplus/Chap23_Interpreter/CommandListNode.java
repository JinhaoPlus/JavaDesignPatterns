package top.jinhaoplus.Chap23_Interpreter;

import java.util.ArrayList;

/**
 * 指令列表: 多个指令组成的列表
 * <command_list> ::= <command>* end
 */
public class CommandListNode extends Node {

    private ArrayList<CommandNode> commandNodes = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing end");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                CommandNode commandNode = new CommandNode();
                commandNode.parse(context);
                commandNodes.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return commandNodes.toString();
    }
}
