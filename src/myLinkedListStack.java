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
        try{
        int index = list.getSize()-1; // index of element
        list.remove(index);
        System.out.println("current top: "+list.getElement(list.getSize()-1)); // return top element
        } catch (EmptyStackException emptyStackException){
            System.out.println("the method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }

    public void peek() {
        try{
            System.out.println("current top: "+list.getElement(list.getSize()-1)); // return top element
        } catch (EmptyStackException emptyStackException){
            System.out.println("the method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }

    public void isEmpty(){
        if(empty())
            System.out.println("stack is empty");
        else
            System.out.println("stack is not empty");  // print result
    }

    private boolean empty(){
        return list.getSize() == 0;
    }

    public void size(){
        System.out.println("number of elements: "+list.getSize()); // return number of elements
    }
}
