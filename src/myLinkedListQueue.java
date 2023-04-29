import java.util.NoSuchElementException;
public class myLinkedListQueue<E> {
    MyLinkedList list = new MyLinkedList<>();
    public myLinkedListQueue(){
        list = new MyLinkedList<>();
    }

    public void enqueue(E element){
        list.add(element); // add element to the list
    }

    public void dequeue(){
        list.remove(0);
        System.out.println(list.getElement(0));
    }
}
