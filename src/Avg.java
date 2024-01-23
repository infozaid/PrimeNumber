
public class Avg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int total=arr.length;
		for(int i=0;i<arr.length;i++) {
			 total=total+i;
		}
		System.out.println(total);
		System.out.println(total/arr.length);
	}

}
