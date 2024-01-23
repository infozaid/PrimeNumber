
public class Pyramid {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		String s = "";
		for (int i = 1; i<=arr.length; ++i) {
			
		    s=s+i;
		    System.out.println(s);
		  }
		
		
		int count =1;
		
		for(int j=1;j<=4;j++) {
		System.out.print("\n");
		for (int k=1;k<=j;k++) {
			System.out.print(count+" ");
			count++;
		}
		
		}
		
	           
	 }
	
	
	
}


