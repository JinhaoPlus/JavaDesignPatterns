package top.jinhaoplus.Chap8_AbstractFactory.listfactory;

import top.jinhaoplus.Chap8_AbstractFactory.factory.Item;
import top.jinhaoplus.Chap8_AbstractFactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
