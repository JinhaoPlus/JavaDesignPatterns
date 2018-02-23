package top.jinhaoplus.Chap16_Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private CollegueCheckbox checkGuest;
    private CollegueCheckbox checkLogin;
    private CollegueTextField textUser;
    private CollegueTextField textPass;
    private CollegueButton buttonOk;
    private CollegueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        colleagueChanged();

        pack();
        show();
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new CollegueCheckbox("Guest", g, true);
        checkLogin = new CollegueCheckbox("Login", g, false);
        textUser = new CollegueTextField("", 10);
        textPass = new CollegueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new CollegueButton("OK");
        buttonCancel = new CollegueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setCollegueEnabled(false);
            textPass.setCollegueEnabled(false);
            buttonOk.setCollegueEnabled(true);
        } else {
            textUser.setCollegueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setCollegueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setCollegueEnabled(true);
            } else {
                buttonOk.setCollegueEnabled(false);
            }
        } else {
            textPass.setCollegueEnabled(false);
            buttonOk.setCollegueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
