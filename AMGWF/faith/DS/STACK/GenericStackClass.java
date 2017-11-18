package faith.DS.STACK;

import java.util.EmptyStackException;

import faith.DS.LINKEDLIST.GenericNode;

public class GenericStackClass<E> implements GenericStack<E> {
    
    protected GenericNode<E> top;
    int size;
    
     @Override
    public void push(E ele) {
        // TODO Auto-generated method stub
        
         GenericNode<E> node=new GenericNode<>(ele,top);
         top=node;
         size++;
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        if(isEmpty()) throw new EmptyStackException();
        
        E ele =top.getElement();
        top=top.getNext();
        size--;
        return ele;
    }

    @Override
    public E peek() throws Exception {
        // TODO Auto-generated method stub
        if(isEmpty()) throw new Exception("Stack is empty bruh!");
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size==0;
    }

}
