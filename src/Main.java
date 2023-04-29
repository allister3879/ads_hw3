import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myLinkedListStack stack = new myLinkedListStack();
        System.out.println("--- Test for 'push' method ---");
        stack.push(1);
        stack.push('a');
        stack.push(7.7);
    }
}