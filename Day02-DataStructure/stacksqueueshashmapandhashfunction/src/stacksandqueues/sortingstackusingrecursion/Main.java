package stacksandqueues.sortingstackusingrecursion;
// Main.java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        
        System.out.println("Original Stack: " + stack);
        
        SortStack.sortStack(stack);
        
        System.out.println("Sorted Stack: " + stack);
    }
}