package top.jinhaoplus.Chap16_Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CollegueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public CollegueCheckbox(String caption, CheckboxGroup group, boolean state) throws HeadlessException {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setCollegueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // colleague状态变化通知mediator
        mediator.colleagueChanged();
    }
}
