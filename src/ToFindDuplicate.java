
public class ToFindDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {0,0,1,2,2,3,4,4,5,5,6,7,8,9};
		int tot=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}
	
}
