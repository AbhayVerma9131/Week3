package com.stringbuilder.removeduplicate;

import java.util.*;
public class UniqueCharacterTracker {
    private HashSet<Character> seenChars;
    
    // Constructor to initialize the HashSet
    public UniqueCharacterTracker() {
        seenChars = new HashSet<>();
    }
    
    // Method to check if a character has been seen before
    public boolean hasSeen(char c) {
        return seenChars.contains(c);
    }
    
    // Method to add a character to the HashSet
    public void addCharacter(char c) {
        seenChars.add(c);
    }
}
