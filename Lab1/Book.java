package Lab1;

public class Book {
    private String name;
    private int countPages;
    private String author;

    public Book(String name, int countPages, String author) {
        this.name = name;
        this.countPages = countPages;
        this.author = author;
    }

    public Book(int countPages, String author) {
        name = "Kolobok";
        this.countPages = countPages;
        this.author = author;
    }

    public Book(String name, String author) {
        this.name = name;
        countPages = 1000;
        this.author = author;
    }

    public Book(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
        author = "Fyodor Dostoevsky";
    }

    public Book(String name) {
        this.name = name;
        countPages = 1000;
        author = "Mikhail Bulgakov";
    }

    public Book(int countPages) {
        name = "3 piglets";
        this.countPages = countPages;
        author = "Lev Tolstoy";
    }

    /*public Book(String author) {
        name = "Red hat";
        countPages = 1000;
        this.author = author;
    }*/

    public Book() {
        name = "Moidodyr";
        countPages = 1000;
        this.author = "Korney Chukovsky";
    }

    public void setName(String newName) {name = newName;}
    public void setCountPages(int newCountPages) {countPages = newCountPages;}
    public void setAuthor(String newAuthor) {author = newAuthor;}

    public String getName() {return name;}
    public int getCountPages() {return countPages;}
    public String getAuthor() {return author;}

    public String allInfo() {return name + ", count of pages " + countPages + ", author " + author;}

    public void takeBook() {
        System.out.println(name + " has " + countPages + " and was written by " + author);
    }
}
