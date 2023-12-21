package Lab19;

public class ArrOfAnyDataTypes <T> {
    private T[] array;
    public ArrOfAnyDataTypes(T[] array) {
        this.array = array;
    }
    public T getElement(int index) {
        return array[index];
    }
}