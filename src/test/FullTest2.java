package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FullTest2 {

    static void  printMissingElements(int[] arr, int N) {

        // Initialize diff
        int diff = arr[0];

        List<Integer> list = new ArrayList<>();
        for(int value:arr){
            list.add(value);
        }
        System.out.println("before sort: "+list);

        for (int i = 0; i < N; i++) {
            // Loop for consecutive
            // missing elements
            while (diff < arr[i] - i) {
                int temp  = i+diff;
                list.add(temp);
                System.out.print((i + diff) + " ");
                diff++;
            }
        }
        List<Integer> sorted  = list.stream().sorted().collect(Collectors.toList());
        System.out.println();
        System.out.println("after sort: "+sorted);
    }

    // Driver Code
    public static void main(String[] args) {

        // Given array arr[]
        int arr[] = { 6, 7, 10, 11, 13 };

        int N = arr.length;

        // Function call
        printMissingElements(arr, N);
    }
}
