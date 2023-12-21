package Lab12;

import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод карт первого игрока
        System.out.println("Введите карты первого игрока - 5 чисел");
        Stack<Integer> firstPlayerCards = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int card = scanner.nextInt();
            firstPlayerCards.push(card);
        }

        // Ввод карт второго игрока
        System.out.println("Введите карты второго игрока - 5 чисел");
        Stack<Integer> secondPlayerCards = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int card = scanner.nextInt();
            secondPlayerCards.push(card);
        }

        int moves = 0;
        while (moves < 106 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstPlayerCard = firstPlayerCards.pop();
            int secondPlayerCard = secondPlayerCards.pop();

            if (firstPlayerCard == 0 && secondPlayerCard == 9) {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            } else if (firstPlayerCard == 9 && secondPlayerCard == 0) {
                secondPlayerCards.add(0, secondPlayerCard);
                secondPlayerCards.add(0, firstPlayerCard);
            } else if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            } else {
                secondPlayerCards.add(0, secondPlayerCard);
                secondPlayerCards.add(0, firstPlayerCard);
            }

            moves++;
        }

        if (moves == 106) {
            System.out.println("botva");
        } else if (firstPlayerCards.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
