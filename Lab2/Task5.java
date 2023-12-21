package Lab2;

public class Task5 {
    public static long factorial(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) sum *= i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Задание 5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.");
        System.out.println("Факториал числа 5 равен " + factorial(5));
        System.out.println("Факториал числа 10 равен " + factorial(10));
        System.out.println("Факториал числа 20 равен " + factorial(20));
    }
}
