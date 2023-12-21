package Lab12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите карты первого игрока - 5 чисел");
        String[] input1 = scanner.nextLine().split(" ");
        System.out.println("Введите карты второго игрока - 5 чисел");
        String[] input2 = scanner.nextLine().split(" ");

        Queue<Integer> player1Cards = new ArrayDeque<>();
        Queue<Integer> player2Cards = new ArrayDeque<>();


        for (String card : input1) {
            player1Cards.offer(Integer.parseInt(card));
        }

        for (String card : input2) {
            player2Cards.offer(Integer.parseInt(card));
        }

        int moves = 0;
        while (!player1Cards.isEmpty() && !player2Cards.isEmpty() && moves < 106) {
            int player1Card = player1Cards.poll();
            int player2Card = player2Cards.poll();

            if (player1Card == 0 && player2Card == 9) {
                player1Cards.offer(player1Card);
                player1Cards.offer(player2Card);
            } else if (player1Card == 9 && player2Card == 0) {
                player2Cards.offer(player1Card);
                player2Cards.offer(player2Card);
            } else if (player1Card > player2Card) {
                player1Cards.offer(player1Card);
                player1Cards.offer(player2Card);
            } else {
                player2Cards.offer(player1Card);
                player2Cards.offer(player2Card);
            }

            moves++;
        }

        if (player1Cards.isEmpty() && player2Cards.isEmpty()) {
            System.out.println("botva");
        } else if (player1Cards.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
