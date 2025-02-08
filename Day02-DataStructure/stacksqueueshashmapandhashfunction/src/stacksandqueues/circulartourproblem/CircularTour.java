package stacksandqueues.circulartourproblem;

class CircularTour {
    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int totalSurplus = 0; // Total surplus petrol
        int currentSurplus = 0; // Current surplus petrol
        int startIndex = 0; // Starting index

        for (int i = 0; i < petrol.length; i++) {
            // Calculate surplus petrol for the current pump
            totalSurplus += petrol[i] - distance[i];
            currentSurplus += petrol[i] - distance[i];

            // If current surplus is negative, reset the starting point
            if (currentSurplus < 0) {
                startIndex = i + 1; // Move to the next pump
                currentSurplus = 0; // Reset current surplus
            }
        }

        // If total surplus is negative, tour is not possible
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}