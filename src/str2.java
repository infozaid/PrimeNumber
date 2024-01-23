import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class str2 {

	public static void main(String[] args) {

		Random random = new Random();
		String s="";
		
		
		String str = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		int length = 15;
		StringBuilder s3 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		for (int i = 0; i < length; i++) {
				
			
			s2.append(str.charAt(random.nextInt(str.length())));
			
			sb1.append(str.charAt(random.nextInt(str.length())));
			sb2.append(str.charAt(random.nextInt(str.length())));
			sb3.append(str.charAt(random.nextInt(str.length())));
			sb4.append(str.charAt(random.nextInt(str.length())));
			
			}
		
		char[] chars = new char[s2.length()];
		s2.getChars(0, s2.length(), chars, 0);
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		
		for (Character character : charSet) {
		    s3.append(character);
		    sb1.append(character);
		    sb2.append(character);
		}
		
		System.out.println(s3);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4.toString());
		
	}

}
