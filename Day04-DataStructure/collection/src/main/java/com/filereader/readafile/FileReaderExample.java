package com.filereader.readafile;

import java.io.*;

public class FileReaderExample {
    
    public static void main(String[] args) {
        // Specify the file path
        String filename = "example.txt"; // Change this to the path of your file
        
        // Call the method to read and print file content
        readFileLineByLine(filename);
    }

    // Method to read file line by line and print to console
    public static void readFileLineByLine(String filename) {
        BufferedReader reader = null;
        
        try {
            // Create a FileReader to open the file
            FileReader fileReader = new FileReader(filename);
            
            // Wrap FileReader in BufferedReader for efficient reading
            reader = new BufferedReader(fileReader);
            
            // Read and print each line of the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // Close the BufferedReader to release resources
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
