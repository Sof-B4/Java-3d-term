package Lab12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение карт первого игрока
        System.out.println("Введите карты первого игрока - 5 чисел");
        Deque<Integer> player1 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            player1.addLast(scanner.nextInt());
        }

        // Чтение карт второго игрока
        System.out.println("Введите карты второго игрока - 5 чисел");
        Deque<Integer> player2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            player2.addLast(scanner.nextInt());
        }

        int moves = 0; // Количество ходов

        // Игровой цикл
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pollFirst(); // Карта первого игрока
            int card2 = player2.pollFirst(); // Карта второго игрока

            if (card1 == 0 && card2 == 9) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else if (card2 == 0 && card1 == 9) {
                player2.addLast(card1);
                player2.addLast(card2);
            } else if (card1 > card2) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else {
                player2.addLast(card1);
                player2.addLast(card2);
            }

            moves++;
        }

        // Вывод результата
        if (moves == 106) {
            System.out.println("f");
        } else if (player2.isEmpty()) {
            System.out.println("fisrt " + moves);
        } else {
            System.out.println("second " + moves);
        }
    }
}
