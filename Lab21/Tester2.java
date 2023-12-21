package Lab21;

public class Tester2 {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.element());
    }
}
