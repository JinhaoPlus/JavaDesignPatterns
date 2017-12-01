package top.jinhaoplus.Chap14_Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelconPage(String mailaddr, String filename) {
        try {
            Properties mailProperties = Database.getProperties("maildata");
            String username = mailProperties.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("期待你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
