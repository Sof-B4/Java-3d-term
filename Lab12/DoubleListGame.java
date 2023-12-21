package Lab12;

import java.util.*;

public class DoubleListGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoubleList player1Cards = new DoubleList();
        DoubleList player2Cards = new DoubleList();

        // Ввод карт первого игрока
        System.out.println("Введите карты первого игрока - 5 чисел");
        for (int i = 0; i < 5; i++) {
            int card = scanner.nextInt();
            player1Cards.add(card);
        }

        // Ввод карт второго игрока
        System.out.println("Введите карты второго игрока - 5 чисел");
        for (int i = 0; i < 5; i++) {
            int card = scanner.nextInt();
            player2Cards.add(card);
        }

        int moves = 0;

        // Игра продолжается, пока один из игроков не останется без карт или не будет сделано 106 ходов
        while (!player1Cards.isEmpty() && !player2Cards.isEmpty() && moves < 106) {
            int card1 = player1Cards.removeFirst();
            int card2 = player2Cards.removeFirst();

            // Проверка на выигрышную комбинацию
            if (card1 == 0 && card2 == 9) {
                player1Cards.add(card1);
                player1Cards.add(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Cards.add(card1);
                player2Cards.add(card2);
            } else if (card1 > card2) {
                player1Cards.add(card1);
                player1Cards.add(card2);
            } else {
                player2Cards.add(card1);
                player2Cards.add(card2);
            }

            moves++;
        }

        // Вывод результата
        if (player1Cards.isEmpty()) {
            System.out.println("second " + moves);
        } else if (player2Cards.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }
}

class DoubleList {
    Node head;
    Node tail;

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        int value = head.value;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
