import java.util.EmptyStackException;
public class myLinkedListStack<E> {
    MyLinkedList list = new MyLinkedList<>();
    public myLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(E element) {
        list.add(element); // add element to the top of list
        System.out.println("element "+element+" added");
    }

    public void pop(){
        int index = list.getSize()-1; // index of element
        list.remove(index);
        index = list.getSize()-1; // reassigning decreased value of size
        System.out.println("current top: "+list.getElement(index)); // return top element
    }

    public void peek() {
        int index = list.getSize()-1;
        System.out.println("current top: "+list.getElement(index));
    }

    public void isEmpty(){
        boolean empty = true; // create boolean
        if(list.getSize() > 0)
            empty = false; // is size > 0 boolean is false

        if(empty)
            System.out.println("stack is empty");
        else
            System.out.println("stack is not empty");  // print result
    }

    public void size(){
        System.out.println("number of elements: "+list.getSize()); // return number of elements
    }
}
