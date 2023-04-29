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
}
