package Lab16.Ex7;
//Шаг 1. Создайте следующий класс (листинг 16.7) и попытайтесь его
//скомпилировать.
//При попытке компиляции вы получите следующий синтаксис ошибки:
//Исключение Unreported java.lang.Exception
//В результате успешного пробрасывания исключение должен быть
//поймано или объявлено. Объясните причину.
//Ответ. Причиной полученной ошибки является выражение throw е.

//Проблему можно решить несколькими способами:
//Добавьте соответствующие try-catch блоки таким образом, чтобы в
//конечном итоге один из них обрабатывал исключение;
//Удалите блоки try-catch для всех методов, кроме одного, который
//обрабатывает исключение. Добавьте throws, котрый бросает исключение
//методу, который проходит исключение без обработки.
import java.util.Scanner;
public class Exception7 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) {
        if (key.compareTo("") == 0) {
            try {
                throw new Exception("key set to empty string");
            } catch (Exception e) {
                System.out.println(e + " catched");
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}