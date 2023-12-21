package Lab24;

public class IllegalTableNumber extends IllegalArgumentException {
    IllegalTableNumber() {
        super("Нет столика с таким номером");
    }
}
