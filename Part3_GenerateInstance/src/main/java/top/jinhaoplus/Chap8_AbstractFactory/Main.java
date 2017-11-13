package top.jinhaoplus.Chap8_AbstractFactory;

import top.jinhaoplus.Chap8_AbstractFactory.factory.Factory;
import top.jinhaoplus.Chap8_AbstractFactory.factory.Link;
import top.jinhaoplus.Chap8_AbstractFactory.factory.Page;
import top.jinhaoplus.Chap8_AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("top.jinhaoplus.Chap8_AbstractFactory.listfactory.ListFactory");
        Link google = factory.createLink("Google", "http://www.google.com/");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");

        Link zhihu = factory.createLink("Zhihu", "http://www.zhihu.com");
        Link weibo = factory.createLink("Weibo", "http://www.weibo.com");

        Tray searchEnginesTray = factory.createTray("Search Engines!");
        searchEnginesTray.add(google);
        searchEnginesTray.add(us_yahoo);
        searchEnginesTray.add(jp_yahoo);

        Tray socialTray = factory.createTray("Social!");
        socialTray.add(zhihu);
        socialTray.add(weibo);

        Page page = factory.createPage("CCC Page", "CCC");
        page.add(searchEnginesTray);
        page.add(socialTray);

        page.output();
    }
}
