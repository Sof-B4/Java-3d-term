package Lab17;
import java.util.Scanner;

public class INN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();
        try {
            if (inn.length() != 12) {
                throw new InvalidInnException("Ошибка >> Недействительный ИНН!");
            }
            Long.parseLong(inn);
            System.out.println("Оповещение >> Ваш заказ успешно оформлен!");
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ИНН должен состоять только из цифр!");
        }
    }
}

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}