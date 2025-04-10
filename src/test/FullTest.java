package test;

import java.util.*;

public class FullTest {

    static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        int [] numArray= {1,25,69,678,36,336,35,880,310,200,100,900,1000};
        for (int i=0;i< numArray.length;i++){
            System.out.println("Enter element "+i+" values "+numArray[i]);
        }
        System.out.println("The Average of total values: "+getAverage(numArray));
        System.out.println("Here is the sorted array: "+ Arrays.toString(sortArray(numArray)));
        System.out.println("Here is the max value of array: "+maxArrayValue(numArray));
        System.out.println("Here is the removeElement array: "+Arrays.toString(removeElement(numArray,25)));
        System.out.println("Here is the removeElement using list: "+removeElementUsingList(numArray,25));
        System.out.println("Here add Element  in existing array: "+Arrays.toString(addElement(numArray,60)));
        System.out.println("Here add Element using list in existing array: "+addElementUsingList(numArray,85));
    }

    public static int[] getIntArray(int number){
        System.out.println("Enter: "+number+" values");
        int [] values =  new int[number];
        for (int i=0; i < values.length; i++){
            values[i] = a.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / (double) numbers.length;
    }

    public static void printArray(int[] array){
        for(int i:array){
            System.out.println("Element: "+i+" values: "+array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int maxArrayValue(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int[] removeElement(int[] array, int element){
        int [] newArray = new int[array.length-1];

        for(int i=0;i<newArray.length;i++){
            if(array[i]<element){ // here we check if arr<element it will just place the elements of array
                newArray[i]=array[i]; // here it is placing each element
            }else{
                newArray[i]=array[i+1]; // here it is remove element if elements appear
            }
        }
        return newArray;
    }

    public static int[] addElement(int[] array,int element){
        int[] newArray = new int[array.length+1];
        for(int i=0;i<newArray.length;i++){
            if(newArray[array.length-1]==0){
                newArray[i]=array[i];
            }
        }
        if(newArray[array.length]==0){
            newArray[array.length]=element;
        }
        return newArray;
    }



    public static List<Integer> removeElementUsingList(int [] array, int element){
        List<Integer> list = new ArrayList<>();
        for(int value:array){
            list.add(value);
        }
        list.remove(Integer.valueOf(element));
        return list;
    }

    public static List<Integer> removeElementUsingListStream(int [] array, int element){
        List<Integer> list = new ArrayList<>();
        for(int value:array){
            list.add(value);
        }

        list.remove(Integer.valueOf(element));
        return list;
    }

    public static List<Integer> addElementUsingList(int[] array,int element){

        List<Integer> list = new ArrayList<>();
        for(int value:array){
            list.add(value);
        }
        list.add(Integer.valueOf(element));
        return list;
    }
}
