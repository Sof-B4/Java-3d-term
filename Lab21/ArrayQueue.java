package Lab21;

//ArrayQueue - реализует очередь в виде класса
// (с неявной передачей ссылки на экземпляр очереди)

// INV: FIFO (First in - first out)
//      0 <= size
//      queue[head]..queue[tail] - queue
public class ArrayQueue {
    private ArrayQueueModule queue;

    public ArrayQueue(){
        this.queue = ArrayQueueModule.getInstance();
    }

    // PRE: size > 0
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    public Object dequeue() {
        return queue.dequeue();
    } // Удалить и вернуть первый элемент в очереди

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue - immutable
    public Object element() {
        return queue.element();
    } // первый элемент в очереди

    // PRE:  None
    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1] - immutable
    public void enqueue(Object o) {
        queue.enqueue(o);
    } // добавить элемент в очередь

    // PRE:  None
    // POST: queue - immutable
    //       R = (head == tale)
    public boolean isEmpty() {
        return queue.isEmpty();
    } // является ли очередь пустой

    // PRE:  None
    // POST: size == 0
    public boolean clear() {
        return queue.clear();
    } // удалить все элементы из очереди

    // PRE:  none
    // POST: R = size
    public int size() {
        return queue.size();
    } // текущий размер очереди
}
