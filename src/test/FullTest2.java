package test;


import java.util.Arrays;

public class FullTest2 {

    public static void main(String[] args) {

        int [] numArray= {1,25,69,678,36,336,35,880,310,200,100,900,1000};
        System.out.println("here is sorted Array elements "+ Arrays.toString(sortArray(numArray)));
    }

    public static int[] sortArray(int [] array) {

        int[] sortedArray = new int [array.length];

        for(int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
        }

        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i=0;i<array.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


}
