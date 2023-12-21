package Lab3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dostoevsky", "afsgd@mail.ru", 'М');
        System.out.println(a1);
        a1.setEmail("dostoevsky@mail.ru");
        System.out.println(a1);
    }
}
