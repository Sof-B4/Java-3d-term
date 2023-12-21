package Lab16.Ex3;

import java.util.Scanner;

//С помощью перехватывания исключений можно оказывать влияние на
//поведение программы. В вашем решении в предыдущем упражнении вы
//можете добавить новый пункт - catch в начале списка пунктов catch.
//Шаг 1. Выполите это действие, чтобы поймать общее исключение класса Exception.
//Шаг 2. Перезапустите программу с приведенными выше данными и
//обратите внимание на ее поведение.

public class Exception3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Non-integer input detected");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
