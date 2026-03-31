package test;


/* Write a program to check if the two strings are anagram or not.
Two strings are anagram if they contain a similar group of characters in a varied sequence.
e.g., “abcdef” and “defabc” are anagram, but “abcded” and “abcefg” are not anagram. */


import java.util.Arrays;

public class ConfizTest {

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        s1Array = sortArray(s1Array);
        s2Array = sortArray(s2Array);

        return Arrays.equals(s1Array,s2Array);
    }

    public static char[] sortArray(char[] array){
        char[] sortedArray = new char[array.length];

        for(int i =0; i<array.length;i++){
            sortedArray[i] = array[i];
        }

        char temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i<array.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        String a  = "abcdef";
        String b = "defabc";

        if(isAnagram(a,b)){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("Strings are not Anagram");
        }
    }

}
