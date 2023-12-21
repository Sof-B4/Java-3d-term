package Lab16.Ex5;

//Шаг 1. Когда определяется условие ошибки, то мы выбрасываем
//исключение с определенным именем. Сообщение может быть связано с
//исключением. Откомпилируйте этот класс, создайте его экземпляр и
//выполните метод getDetails() с нулем в качестве значения параметра.

public class Exception5 {
    public static void getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                System.out.println("key is null");
            }
        }
    }
    public static void main(String[] args) {
        getDetails(null);
    }
}