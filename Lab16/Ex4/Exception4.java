package Lab16.Ex4;

import java.util.Scanner;

//Шаг 1. Добавьте блок finally к решению Задания №2.
//Шаг 2. Повторно запустите программу, чтобы проверить ее поведение.

public class Exception4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("Non-integer input detected");
        } finally {
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }
}