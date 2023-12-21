package Lab4;
import java.util.Date;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("1984", "Джордж Оруэлл", new Date());
        System.out.println(book);
        book.set_name("Скотный двор");
        book.set_writing_date(new Date());
        System.out.println(book);
    }
}
