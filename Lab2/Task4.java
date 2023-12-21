package Lab2;
import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задание 4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.");
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100);
        System.out.print("Исходный массив из случайных чисел: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) System.out.print(arr[i] + " ");
            else System.out.print(arr[i] + "\n");
        }
        Arrays.sort(arr);
        System.out.print("Отсортированный массив из случайных чисел: ");
        for (int i: arr) {System.out.print( i + " " );}
    }
}
