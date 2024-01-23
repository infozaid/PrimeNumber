import java.util.ArrayList;

public class RemoveList {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Brian");

		arr.add("Bob");

		arr.add("David");

		arr.add("Brandon");
		arr.add("Eli");
		int i=0;
		while( i<arr.size()) {
			String test=arr.get(i);
			if(test.charAt(0)=='B') {
				arr.remove(i);
			}else {i++;}
		}
		for(String s:arr)
		System.out.println(s);

	}

}
