package insertionsort.sortemployeeid;

public class InsertionSort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        // Traverse through 1 to n (the first element is considered sorted)
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i]; // The element to be inserted
            int j = i - 1;

            // Move elements of employeeIds[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j = j - 1;
            }
            employeeIds[j + 1] = key; // Insert the key at the correct position
        }
    }

    // Method to print the array
    public static void printArray(int[] employeeIds) {
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Main method to test the Insertion Sort implementation
    public static void main(String[] args) {
        int[] employeeIds = {102, 101, 105, 103, 104};

        System.out.println("Original Employee IDs:");
        printArray(employeeIds);

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");
        printArray(employeeIds);
    }
}