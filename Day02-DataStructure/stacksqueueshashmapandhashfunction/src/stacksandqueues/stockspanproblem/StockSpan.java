package stacksandqueues.stockspanproblem;

import java.util.Stack;

public class StockSpan {
    // Function to calculate the stock span
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Array to store the span values
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Calculate span for prices[i]
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop(); // Pop elements from the stack while the current price is greater
            }

            // If stack is empty, all previous prices are less than or equal to current price
            if (stack.isEmpty()) {
                span[i] = i + 1; // Span is the current index + 1
            } else {
                // Span is the difference between current index and index of last higher price
                span[i] = i - stack.peek();
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }
}