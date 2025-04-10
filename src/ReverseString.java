
public class ReverseString {

	public static void main(String[] args) {

		String str="abcdefgh";

		int levels=4;

		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		int z = 0;
		for(int i=0;i<levels;i++) {
			for (int s = levels; s > i; s--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(z + " ");
				z++;
			}
		//	System.out.println();
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
