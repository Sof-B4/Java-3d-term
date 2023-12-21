package Lab4;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date book_writing_date = new Date();

    Book(String name, String author, Date book_writing_date) {
        this.name = name;
        this.author = author;
        this.book_writing_date = book_writing_date;
        System.out.println("Книга написана");
    }

    String get_name() {return this.name;}

    void set_name(String name) {this.name = name;}

    String get_author() {return this.author;}

    void set_author(String author) {this.author = author;}

    Date get_writing_date() {return this.book_writing_date;}

    void set_writing_date(Date book_writing_date) {this.book_writing_date.setTime(book_writing_date.getTime());}

    public String toString() {
        return "Название книги: " + this.name + "; автор: " + this.author + "; дата написания: " + this.book_writing_date;
    }
}
