package faith.DS.QUEUE;

public interface GenericQueue<E> {

    E dequeue();
    //boolean isFull();
    boolean isEmpty();
    void enqueue(E val);
    int size();
}
