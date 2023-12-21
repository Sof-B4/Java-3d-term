package Lab18;

import java.io.Serializable;

interface Animal {
    // Допустим, у Animal есть какие-то методы
    void makeSound();
}

public class MyGenericClass2<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public MyGenericClass2(T firstValue, V secondValue, K thirdValue) {
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
        MyGenericClass<String, SerializableAnimal, Double> myGenericObject = new MyGenericClass<>("Hello", new SerializableAnimal(), 3.14);
        myGenericObject.displayValues();
        myGenericObject.displayClassNames();
    }

    // Пример класса, реализующего интерфейс Animal и интерфейс Serializable
    static class SerializableAnimal implements Animal, Serializable {
        @Override
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
}
