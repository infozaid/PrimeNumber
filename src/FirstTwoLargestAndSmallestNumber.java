import java.util.Arrays;

public class FirstTwoLargestAndSmallestNumber {
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,6,7,8,9,2,1,0};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
	      }
		System.out.println();
		System.out.println("here is second method to sort an array");
		int tot=arr.length;
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					int temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		
		System.out.println("first largest: " +arr[tot-2]);
	      
		
		
	}

	
}
