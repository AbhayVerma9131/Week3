package com.stringbuilder.removeduplicate;

public class StringManipulator {
    // Method to remove duplicates using StringBuilder and UniqueCharacterTracker
    public String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        
        // Create an instance of UniqueCharacterTracker to track seen characters
        UniqueCharacterTracker tracker = new UniqueCharacterTracker();
        
        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // If the character is not already in the tracker, add it to result
            if (!tracker.hasSeen(currentChar)) {
                result.append(currentChar);
                tracker.addCharacter(currentChar);
            }
        }
        
        return result.toString();
    }
}
