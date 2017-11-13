package top.jinhaoplus.Chap8_AbstractFactory.listfactory;

import top.jinhaoplus.Chap8_AbstractFactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href='" + url + "'>" + caption + "</a></li>\n";
    }
}
