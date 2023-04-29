import java.util.NoSuchElementException;
public class myLinkedListQueue<E> {
    MyLinkedList list = new MyLinkedList<>();
    public myLinkedListQueue(){
        list = new MyLinkedList<>();
    }

    public void enqueue(E element){
        list.add(element); // add element to the list
        System.out.println("element "+element+" added");
    }

    public void dequeue(){
        try{
        list.remove(0);
        System.out.println("first in queue: "+list.getElement(0));
        } catch (NoSuchElementException noSuchElementException){
            System.out.println("method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }

    public void peek(){
        try{
            System.out.println("first in queue: "+list.getElement(0));
        } catch (NoSuchElementException noSuchElementException){
            System.out.println("method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
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
