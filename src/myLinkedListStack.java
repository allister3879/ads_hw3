import java.util.EmptyStackException;
public class myLinkedListStack<E> {
    MyLinkedList list = new MyLinkedList<>();
    public myLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(E element) {
        list.add(element);
    }
}
