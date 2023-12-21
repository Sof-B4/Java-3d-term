package Lab2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.");
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < arr.length; i++) sum1 += arr[i];
        int i = 0;
        while (i < arr.length) {sum2 += arr[i]; i++;}
        i = 0;
        do {sum3 += arr[i];i++;} while (i < arr.length);
        System.out.println("Сумма чисел массива с помощью цикла for равна " + sum1);
        System.out.println("Сумма чисел массива с помощью цикла while равна " + sum2);
        System.out.println("Сумма чисел массива с помощью цикла do while равна " + sum3);
    }
}