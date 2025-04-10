import java.util.Arrays;

public class ToRemoveDuplicates {
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n<=1){
            return n;  
        }
        int uniqueIndex = 0;
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){  
                arr[uniqueIndex++] = arr[i];
            }  
         }
        arr[uniqueIndex++] = arr[n-1];
        return uniqueIndex;
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,80,30,40,50,60,50};  
        Arrays.sort(arr);
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  

}
