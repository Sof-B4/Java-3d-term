package Lab21;

// ArrayQueueADT - реализует очередь в виде абстрактного типа данных
// (с явной передачей ссылки на экземпляр очереди)

// INV: FIFO (First in - first out)
//      0 <= size
//      queue[head]..queue[tail] - queue
public class ArrayQueueADT {

    private ArrayQueueModule queue;

    public ArrayQueueADT(ArrayQueueModule queue) {
        this.queue = queue;
    }

    // PRE: size > 0
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    public Object dequeue() {
        return queue.dequeue();
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue - immutable
    public Object element() {
        return queue.element();
    }

    // PRE:  None
    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1] - immutable
    public void enqueue(Object o) {
        queue.enqueue(o);
    }

    // PRE:  None
    // POST: queue - immutable
    //       R = (head == tale)
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // PRE:  None
    // POST: size == 0
    public boolean clear() {
        return queue.clear();
    }

    // PRE:  none
    // POST: R = size
    public int size() {
        return queue.size();
    }
}