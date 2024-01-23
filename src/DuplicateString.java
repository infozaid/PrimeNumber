
public class DuplicateString {

	public static void main(String[] args) {
		
		String [] array = {"anps", "anps", "anps", "bbo", "ehllo"};
		// If you already are assured that the strings in the array are sorted
		// then the sort is not necessary. 
		
		for(int i = 0; i < array.length; i++){
		    if((i+1)==array.length || !array[i].equals(array[(i+1)])){
		        System.out.println(array[i]);
		    } else {
		        System.out.print(array[i]+" ");
		    }
		}

	}

}
