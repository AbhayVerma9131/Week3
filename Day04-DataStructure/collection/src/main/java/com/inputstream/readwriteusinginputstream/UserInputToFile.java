package com.inputstream.readwriteusinginputstream;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        // Specify the output file name
        String filename = "output.txt"; // Change this to your desired file path
        
        // Call the method to read input and write to the file
        readAndWriteInputToFile(filename);
    }

    // Method to read user input and write to a file
    public static void readAndWriteInputToFile(String filename) {
        BufferedReader consoleReader = null;
        FileWriter fileWriter = null;
        BufferedWriter fileBufferedWriter = null;

        try {
            // Create an InputStreamReader to read from the console (System.in)
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            
            // Wrap the InputStreamReader in a BufferedReader for efficient reading
            consoleReader = new BufferedReader(inputStreamReader);
            
            // Create a FileWriter to write to the specified file
            fileWriter = new FileWriter(filename, true); // 'true' for appending
            
            // Wrap the FileWriter in a BufferedWriter for efficient writing
            fileBufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text to write to the file (type 'exit' to stop):");
            
            // Read input line by line
            String userInput;
            while (true) {
                // Read a line of user input
                userInput = consoleReader.readLine();

                // Stop if the user types "exit"
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                // Write the user input to the file, followed by a new line
                fileBufferedWriter.write(userInput);
                fileBufferedWriter.newLine(); // Adds a newline after each input
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Close resources in the finally block to ensure they are closed properly
            try {
                if (consoleReader != null) {
                    consoleReader.close();
                }
                if (fileBufferedWriter != null) {
                    fileBufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
