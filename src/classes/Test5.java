package classes;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test5 {

    public static String[] UniqueNames(String [] name1,String[] name2){
//        Set<String> set1=new LinkedHashSet<>(Arrays.asList(name1));
//        Set<String> set2=new LinkedHashSet<>(Arrays.asList(name2));
        /*Set<String> mergeSets=new LinkedHashSet<>();
        mergeSets.addAll(set1);
        mergeSets.addAll(set2);
        return mergeSets.toArray(new String[mergeSets.size()]);*/

        String[] mergedArray = Stream.concat(Arrays.stream(name1), Arrays.stream(name2))
                .distinct() // Ensures uniqueness
                .toArray(String[]::new);

        return  mergedArray;
    }

    public static void main(String[] args){
       int p=0;

       for(int i=1;i<=50;i++){
           for(int j=2;j<i;j++){
               if(i%j!=0){
                   p=1;
               }else{
                   p=0;
                   break;
               }
           }
           if(p==1){
               System.out.println(i+" is prime Number");
           }

       }
    }
}
