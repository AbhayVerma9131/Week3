package stacksandqueues.sortingstackusingrecursion;
// SortStack.java
import java.util.Stack;

public class SortStack {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: If stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Sort the remaining stack
        sortStack(stack);

        // Insert the popped element back in sorted order
        sortedInsert(stack, top);
    }

    // Function to insert an element into the sorted stack
    private static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or the top element is less than or equal to the element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // If the top element is greater, pop it and insert the element recursively
        int top = stack.pop();
        sortedInsert(stack, element);

        // Push the popped element back onto the stack
        stack.push(top);
    }
}