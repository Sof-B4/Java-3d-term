package Lab10;
import java.util.Scanner;

public class Practice10 {

    static int task_4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {return 1;}
            else {return 0;}
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += task_4(len + 1, sum + i, k, s);
        }
        return res;
    }

    static int task_5(int number) {
        return (number == 0) ? 0 : (number % 10) + task_5(number / 10);
    }

    static String task_6(int n, int i) {
        if (n < 2) {return "NO";}
        else if (n == 2) {return "YES";}
        else if (n % i == 0) {return "NO";}
        else if (i < n / 2) {return task_6(n, i + 1);}
        else {return "YES";}
    }

    // метод для рекурсивного вывода чисел от 1 до N
    static void printNumbers(int N) {
        if (N >= 1) {
            printNumbers(N - 1); // Рекурсивный вызов с числом на 1 меньше
            System.out.print(N + " "); // Вывод текущего числа
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //2)
        System.out.println("\n2) Рекурсивный вывод чисел от 1 до N.");
        System.out.print("Введи число N: ");
        int N = in.nextInt();
        printNumbers(N);
        // 4)
        System.out.println("\n4) Даны натуральные числа k и s. Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна s.");
        System.out.print("  Введи число k: ");
        int k = in.nextInt();
        System.out.print("  Введи число s: ");
        int s = in.nextInt();
        System.out.print("  Кол-во чисел: " + task_4(0, 0, k, s));

        // 5)
        System.out.println("\n5) Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр.");
        System.out.print("  Введи число N: ");
        int P = in.nextInt();
        System.out.println("  Сумма цифр числа N: " + task_5(P));

        // 6)
        System.out.println("6) Проверка числа на простоту. Дано натуральное число n>1. Проверьте, является ли оно простым.");
        System.out.print("  Введи число N: ");
        N = in.nextInt();
        System.out.println("  Результат: " + task_6(N, 2));

    }


}
