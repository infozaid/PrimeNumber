import java.util.Arrays;

public class FindLargestAndSmallest {

	public static void main(String[] args) {

		int arr[]= {5,3,7,8,9,2,1,4,6};
		int total=arr.length;

		for (int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		//here We put value
		int find=arr[0],find2=arr[1];
		System.out.println("1st Smallest number  "+find+" 2nd smallest number "+find2);
		
		System.out.println("Here is 2nd method to sort array");
		Arrays.sort(arr);

		int find1=arr[total-1];
		System.out.println("Largest number "+find1);
	}

}
