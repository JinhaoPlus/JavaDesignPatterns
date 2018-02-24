package top.jinhaoplus.Chap23_Interpreter;

/**
 * 基本指令: 不可再分，go或right或left
 * <primitive_command> ::= go | right | left
 */
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + "is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
