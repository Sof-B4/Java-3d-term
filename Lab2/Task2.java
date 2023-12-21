package Lab2;

public class Task2 {
    public static void main (String[] args) {
        System.out.println("Задание 2. Вывести на экран аргументы командной строки в цикле for.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + ( i + 1) + ": " + args[i]);
        }
    }
}
