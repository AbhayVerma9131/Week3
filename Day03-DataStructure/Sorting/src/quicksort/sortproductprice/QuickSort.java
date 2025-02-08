package quicksort.sortproductprice;

public class QuickSort {

    // Method to partition the array
    public static int partition(double[] prices, int low, int high) {
        // Choose the rightmost element as the pivot
        double pivot = prices[high];
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (prices[j] <= pivot) {
                i++; // Increment index of smaller element
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Method to implement Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    // Method to print the array
    public static void printArray(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    // Main method to test the Quick Sort implementation
    public static void main(String[] args) {
        double[] productPrices = {29.99, 19.99, 49.99, 9.99, 39.99};

        System.out.println("Original Product Prices:");
        printArray(productPrices);

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices:");
        printArray(productPrices);
    }
}