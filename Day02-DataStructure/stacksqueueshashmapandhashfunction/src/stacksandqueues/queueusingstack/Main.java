package stacksandqueues.queueusingstack;

// Example usage:
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.peek()); // returns 1
        System.out.println(queue.dequeue()); // returns 1
        System.out.println(queue.empty()); // returns false
        System.out.println(queue.dequeue()); // returns 2
        System.out.println(queue.empty()); // returns false
    }
}