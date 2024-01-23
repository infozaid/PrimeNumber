
public class ReverseString {

	public static void main(String[] args) {
		
		String str="Zaidamin";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("***************");
		// Reverse Using array
		System.out.println("Using array");
		System.out.println("****************");
		
		String arr[]= {"U" , "f" , "o" , "n", "e"};
		
		
		for(int i =arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
