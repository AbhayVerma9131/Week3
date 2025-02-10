package com.stringbuilder.removeduplicate;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String input = "programming";
        
        // Create an instance of StringManipulator
        StringManipulator manipulator = new StringManipulator();
        
        // Remove duplicates and print the result
        String result = manipulator.removeDuplicates(input);
        System.out.println("String without duplicates: " + result);
    }
}




