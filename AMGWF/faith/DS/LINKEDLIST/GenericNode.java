package faith.DS.LINKEDLIST;

public class GenericNode<T> {
    
    public T element;
    public GenericNode<T> next;
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

    

    public GenericNode(T element,GenericNode<T> next) {
                this.element=element;
                this.next=next;
    }
    
    public GenericNode() {this(null,null);}
    
    public String toString (){
        return element.toString();
    } 
    
    
}
