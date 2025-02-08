package stacksandqueues.slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    // Function to find the maximum in each sliding window of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Result array to store maximums
        Deque<Integer> deque = new ArrayDeque<>(); // Deque to store indices

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices from the back while the current element is greater
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(i);

            // If we have processed at least k elements, record the maximum
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()]; // The maximum is at the front of the deque
            }
        }

        return result;
    }
}