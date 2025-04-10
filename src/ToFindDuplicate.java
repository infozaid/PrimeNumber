
public class ToFindDuplicate {

	static void removeDuplicate(){
		int arr[] = {0, 0, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9};
		int n = arr.length;
		int result[] = new int[n];
		int index = 0;

// Iterate through the array
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			// Check if the current element is a duplicate
			for (int j = 0; j < index; j++) {
				if (arr[i] == result[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If not a duplicate, add it to the result array
			if (!isDuplicate) {
				result[index++] = arr[i];
			}
		}

// Optional: Copy unique elements back to the original array or trim the result array
		int[] uniqueArr = new int[index];
		for (int i = 0; i < index; i++) {
			uniqueArr[i] = result[i];
		}

// Print the unique elements
		for (int i = 0; i < uniqueArr.length; i++) {
			System.out.print(uniqueArr[i] + " ");
		}
	}

	public static void main(String[] args) {

		removeDuplicate();

		int arr[]= {0,0,1,2,2,3,4,4,5,5,6,7,8,9};
		int result []=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					result[i] = arr[i];
					System.out.println(result[i]);
				}
			}
		}
	}
}
