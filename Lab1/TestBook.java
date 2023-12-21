package Lab1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("The gold fish", 95, "Alexander Pushkin");
        Book book2 = new Book(33);
        Book book3 = new Book();
        Book book4 = new Book("Beauty and the Beast");

        book2.setCountPages(15245);
        book2.setName("War and peace");

        book1.takeBook();
        book2.takeBook();
        book3.takeBook();
        book4.takeBook();
    }
}
