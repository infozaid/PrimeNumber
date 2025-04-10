import java.util.Arrays;

public class TestProgram {

	static void printMissingElements() {


	}

	public static void main(String[] args) {
		int arr[] = {10,1,0,10,2,0,2,0,1,6,4,5,78,9};
		int n = arr.length;
		Arrays.sort(arr);
		n = removeDuplicateElement(arr,n);

		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
		}
	}

	public static int removeDuplicateElement(int arr[], int n){
		if(n <= 1){
			return n;
		}
		int uniqueIndex = 0;

		for(int i = 0; i < n-1; i++){
			if(arr[i]!=arr[i+1]){
				arr[uniqueIndex++]=arr[i];
			}
		}
		arr[uniqueIndex++]=arr[n-1];

		return uniqueIndex;
	}

}
