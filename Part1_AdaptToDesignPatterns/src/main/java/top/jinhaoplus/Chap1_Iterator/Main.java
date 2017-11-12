package top.jinhaoplus.Chap1_Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A-Book"));
        bookShelf.appendBook(new Book("B-Book"));
        bookShelf.appendBook(new Book("C-Book"));
        bookShelf.appendBook(new Book("D-Book"));
        Iterator iterator = bookShelf.itearator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
