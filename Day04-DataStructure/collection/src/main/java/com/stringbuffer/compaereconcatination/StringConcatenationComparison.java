package com.stringbuffer.compaereconcatination;

public class StringConcatenationComparison {
    
    public static void main(String[] args) {
        // Number of iterations (1 million strings)
        int iterations = 1000000;
        
        // Measure and output time for StringBuffer
        long durationBuffer = measureTimeForStringBuffer(iterations);
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // Measure and output time for StringBuilder
        long durationBuilder = measureTimeForStringBuilder(iterations);
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");
    }
    
    // Method to measure time for StringBuffer concatenation
    public static long measureTimeForStringBuffer(int iterations) {
        long startTime = System.nanoTime();
        
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to measure time for StringBuilder concatenation
    public static long measureTimeForStringBuilder(int iterations) {
        long startTime = System.nanoTime();
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
