import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        myLinkedListStack stack = new myLinkedListStack();
        myLinkedListQueue queue = new myLinkedListQueue<>();

        System.out.println("1 - test for stack");
        System.out.println("2 - test for queue");
        int x = sc.nextInt();
        switch (x) {
            case 1 :
                System.out.println("--- Test for 'push' method ---");
                stack.push(1);
                stack.push('a');
                stack.push(7.7);

                System.out.println("\n" + "--- Test for 'pop' method ---");
                stack.pop();
                stack.pop();
                stack.pop();

                System.out.println("\n" + "--- Test for 'peek' method ---");
                stack.peek();
                stack.push("prev");
                stack.push("top");
                stack.peek();

                System.out.println("\n" + "--- Test for 'isEmpty' method ---");
                stack.isEmpty();
                stack.list.clear();
                System.out.println("after removing all elements ->");
                stack.isEmpty();

                System.out.println("\n" + "--- Test for 'size' method ---");
                stack.size();
                stack.push("smth");
                stack.size();
            case 2:
                System.out.println("--- Test for 'enqueue' method ---");
                queue.enqueue(1);
                queue.enqueue("a");
                queue.enqueue(7.7);
        }
    }
}