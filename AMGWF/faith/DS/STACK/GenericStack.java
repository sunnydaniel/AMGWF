package faith.DS.STACK;

public interface GenericStack<E> {
    
    void push(E v);
    E pop();
    E peek() throws Exception;
    boolean isEmpty();

}
