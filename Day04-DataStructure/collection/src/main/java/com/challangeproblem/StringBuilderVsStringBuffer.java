package com.challangeproblem;

import java.io.*;
import java.util.Arrays;

class FileReaderVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "A:\\Bridgelab\\Week3\\Day04-DataStructure\\abhay.txt";
        System.out.println(Arrays.toString(fileReaderVsInputReader(filePath)));

    }
    public static long[] fileReaderVsInputReader(String filePath)  {
        long arr[] = new long[2];

        try ( FileReader fileReader = new FileReader(filePath);
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              FileInputStream fileStream = new FileInputStream(filePath);
              InputStreamReader inputStream = new InputStreamReader(fileStream);
              BufferedReader inputReader = new BufferedReader(inputStream);

        )
        {

            long startTime = System.nanoTime();
            String line;
            int countFileReader = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String words[] = line.split("\\s+");
                countFileReader += words.length;

            }
            System.out.println("FileReader Word Count "+countFileReader);
            long endTime = System.nanoTime();
            arr[0]=endTime-startTime;

            startTime = System.nanoTime();
            int countInputReader = 0;
            while ((line = inputReader.readLine()) != null) {
                String words[] = line.split("\\s+");
                countInputReader += words.length;

            }
            System.out.println("InputStreamReader Word Count "+ countInputReader);
            endTime = System.nanoTime();
            arr[1]=endTime-startTime;


        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        return arr;
    }
}

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String s1="Abhishek";

        System.out.println(Arrays.toString(stringBuilderVsStringBuffer(s1)));


    }
    public static Long[] stringBuilderVsStringBuffer(String s1){
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        Long arr[]=new Long[2];


        int iterations = 1000000;

        // Measuring time for StringBuffer
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(s1);
        }
        long end = System.nanoTime();
        arr[0] = end - start;


        // Measuring time for StringBuilder

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(s1);
        }
        end = System.nanoTime();
        arr[1]= end - start;

        System.out.println();
        // Comparing performance
        return arr;


    }
}