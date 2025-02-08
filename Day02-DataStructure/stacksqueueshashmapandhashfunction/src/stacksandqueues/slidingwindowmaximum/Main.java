package stacksandqueues.slidingwindowmaximum;

// Main.java
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxValues = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        // Print the maximum values for each sliding window
        System.out.println("Sliding Window Maximums: ");
        for (int max : maxValues) {
            System.out.print(max + " ");
        }
    }
}