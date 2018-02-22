package top.jinhaoplus.Chap16_Mediator;

import java.awt.*;

public class CollegueButton extends Button implements Colleague {

    private Mediator mediator;

    public CollegueButton(String caption) throws HeadlessException {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setCollegueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
