package Lab18;
//В этом примере MyGenericClass является обобщенным классом с тремя параметрами
// типа T, V, K. Класс содержит три приватных поля, конструктор, геттеры и сеттеры для каждого поля,
// а также метод displayValues(), который выводит значения полей на консоль. В методе main показано,
// как можно создать объект этого класса с конкретными типами данных для параметров T, V, K.

public class MyGenericClass<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public MyGenericClass(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }

    public K getThirdValue() {
        return thirdValue;
    }

    public void setThirdValue(K thirdValue) {
        this.thirdValue = thirdValue;
    }

    public void displayValues() {
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        System.out.println("Third Value: " + thirdValue);
    }
    public void displayClassNames() {
        System.out.println("First Value Class: " + firstValue.getClass().getName());
        System.out.println("Second Value Class: " + secondValue.getClass().getName());
        System.out.println("Third Value Class: " + thirdValue.getClass().getName());
    }

    public static void main(String[] args) {
        // Пример использования обобщенного класса
        MyGenericClass<String, Integer, Double> myGenericObject = new MyGenericClass<>("Hello", 42, 3.14);
        myGenericObject.displayValues();
        myGenericObject.displayClassNames();
    }
}
