package com.stringbuilder.stringreverse;
public class StringReverse {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
   
    public static void main(String[] args) {
        String s="hello ";
        StringReverse sr = new StringReverse();
        System.out.println(sr.reverse(s));  // output: olleh
    }
}