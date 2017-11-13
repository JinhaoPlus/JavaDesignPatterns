package top.jinhaoplus.Chap7_Builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("========================\n");
        buffer.append(" [ " + title + "] \n");
    }

    @Override
    public void makeString(String string) {
        buffer.append(" #" + string + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ." + items[i] + "\n");
        }
    }

    @Override
    public void close() {
        buffer.append("========================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
