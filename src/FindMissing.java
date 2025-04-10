
public class FindMissing {

	public static void main(String[] args) {
		int arr[]= {1,3,4,8,9,10};
		int count=arr.length;
		int missing=arr[0];

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<count;j++) {
				if(arr[i]!=j) {
					missing=arr[j];
					System.out.println(missing);
					break;
				}
			}
		}

	}

}
