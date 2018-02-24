package top.jinhaoplus.Chap22_Command.drawer;

import top.jinhaoplus.Chap22_Command.command.Command;

import java.awt.*;

public class DrawCommand implements Command {

    private Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
