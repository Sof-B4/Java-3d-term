package Lab16.Ex6;

//Шаг 1. Откомпилируйте и запустите эту программу с правильным
//значением для ключа и с нулем в качестве значения. При выполнении с
//нулевым значением вы увидите некоторый вывод.
//Шаг 2. Обобщите все вышесказанное и выполните эту программу с
//правильным значением для ключа и с нулем в ключе.
//Шаг 3. Теперь добавьте блоки try-catch, чтобы использовать для вывода
//сообщений метод printMessage(), таким образом, чтобы исключения
//обрабатывались и программа не “ломалась”.

public class Exception6 {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public static String getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                key = "null";
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        printMessage(null);
    }
}