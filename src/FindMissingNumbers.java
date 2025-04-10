
public class FindMissingNumbers {

	static void printMissingElements(int arr[], int N) {

		// Initialize diff
		int diff = arr[0];

		for (int i = 0; i < N; i++) {
				// Loop for consecutive
				// missing elements
				while (diff < arr[i] - i) {
					System.out.print((i + diff) + " ");

					diff++;
				}
		}
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
