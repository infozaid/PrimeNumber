package test;

/*4. First Non-Repeating Character

        Return first unique character in a string
        👉 Example: "swiss" → w*/


import java.sql.SQLOutput;
import java.util.Arrays;

public class ConfizTest2 {

    /*public static Character firstNonRepeating(String s){

        *//*int[] freq = new int[256];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(char ch:s.toCharArray()){
            if(freq[ch]==1){
                return ch;
            }
        }
        return null;*//*


        for(Character ch : s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return null;
    }*/

    // below is well performed solution
    public static Character firstNonRepeating(String s){
        byte[] flag = new byte[256];

        for(int i=0;i<s.length();i++){
            flag[s.charAt(i)]++;
        }
        for(int i=0; i<s.length();i++){
            if(flag[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return null;
    }

   /* public static Character firstNonRepeating(String s){

        *//*int[] freq = new int[256];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(char ch:s.toCharArray()){
            if(freq[ch]==1){
                return ch;
            }
        }
        return null;*//*


        *//*for(Character ch : s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return null;*//*
    }*/



    public static void main(String[] args) {

        int size = 1_000_000;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<size-1; i++){
            sb.append("a");
        }
        sb.append('z');

        long start = System.currentTimeMillis();

        Character result = firstNonRepeating(sb.toString());
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
        System.out.println(result);

       // String s = "swiss";

       // System.out.println(firstNonRepeating(s));
    }
}
