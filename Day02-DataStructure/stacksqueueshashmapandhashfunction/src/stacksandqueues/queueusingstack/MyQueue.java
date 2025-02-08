package stacksandqueues.queueusingstack;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1; // Stack for enqueue operations
    private Stack<Integer> stack2; // Stack for dequeue operations

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void enqueue(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Now stack2 has the elements in the correct order
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Return the top element of stack2
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}