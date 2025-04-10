import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatString {
	
	public static String[] uniqueNames(String[] names1, String[] names2) {
		Set<String> charSet = new LinkedHashSet<String>(Arrays.asList(names1));
		Set<String> charSet1 = new LinkedHashSet<String>(Arrays.asList(names2));
		Set<String> mergesets=new LinkedHashSet<String>();
		mergesets.addAll(charSet);
		mergesets.addAll(charSet1);
		
		
        return mergesets.toArray(new String[mergesets.size()]);
    }

	public static void main(String[] args) {
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		System.out.println(string);
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		
		
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", DuplicatString.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	}
	
	    
	   
	        

}
