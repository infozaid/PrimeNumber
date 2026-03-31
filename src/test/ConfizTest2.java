package test;
/*4. First Non-Repeating Character

        Return first unique character in a string
        👉 Example: "swiss" → w*/


import java.util.Arrays;

public class ConfizTest2 {

    public static Character firstNonRepeating(String s){
        String s3 = "check";

        for(Character ch : s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        String s = "swwiiss";

        System.out.println(firstNonRepeating(s));
    }
}
