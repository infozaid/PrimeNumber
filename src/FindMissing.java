
public class FindMissing {

	public static void main(String[] args) {
		int arr[]= {1,3,4,8,9,10};
		int count=10;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<count;j++) {
				if(arr[i]!=j) {
					System.out.println(i);
					
				}
			}
		}

	}

}
