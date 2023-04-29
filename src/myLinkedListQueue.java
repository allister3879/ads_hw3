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

    public void peek(){
        System.out.println(list.getElement(0));
    }

    public void isEmpty(){
        if(list.getSize() == 0)
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }

    public void size(){
        System.out.println("number of elements: "+ list.getSize());
    }
}
