package bubblesort.sortstudentmarks;


public class BubbleSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Initialize swapped as false

            // Last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) {
                    // Swap if the element found is greater than the next element
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true; // Set swapped to true
                }
            }

            // If no two elements were swapped in the inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Main method to test the Bubble Sort implementation
    public static void main(String[] args) {
        int[] studentMarks = {85, 70, 90, 60, 75, 80};

        System.out.println("Original Marks:");
        printArray(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("Sorted Marks:");
        printArray(studentMarks);
    }
}