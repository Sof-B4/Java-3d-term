package Lab21;

// Выделим общие части классов LinkedQueue и ArrayQueue в базовый класс AbstractQueue
public abstract class AbstractQueue implements Queue{
    protected int head, tail;
    protected static final int START_CAPACITY = 5;
}
