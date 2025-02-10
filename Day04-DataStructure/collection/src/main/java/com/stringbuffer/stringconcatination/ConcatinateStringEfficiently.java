package com.stringbuffer.stringconcatination;

import java.util.Scanner;

public class ConcatinateStringEfficiently {
    public String concatinate(String[] arr){
        StringBuffer buffer = new StringBuffer();
        for(String s:arr){
            buffer.append(s+" ");
        }
        return buffer.toString();

    }
    public static void main(String[] args) {
        String [] str={"Hello", "world!"};
        ConcatinateStringEfficiently c=new ConcatinateStringEfficiently();
        System.out.println(c.concatinate(str));
    }
}



