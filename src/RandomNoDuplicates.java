import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

import javax.swing.text.View;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNoDuplicates {
	
	protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        StringBuilder salt1 = new StringBuilder();
        StringBuilder salt2 = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 15) { // length of the random string.
        	final Set<Integer> s = new HashSet<>();
        	
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            int index1 = (int) (rnd.nextFloat() * SALTCHARS.length());
            int index2 = (int) (rnd.nextFloat() * SALTCHARS.length());
            s.contains(index);
            s.add(index);
            s.contains(index1);
            s.add(index1);
            s.contains(index2);
            s.add(index2);
           // System.out.println(index);
            salt.append(SALTCHARS.charAt(index));
            //salt1.append(SALTCHARS.charAt(index1));
            //salt2.append(SALTCHARS.charAt(index2));
        	
        }
        String saltStr = salt.toString();
        String saltStr1=salt1.toString();
        String saltStr2=salt2.toString();
        return saltStr+"\n"+saltStr1+"\n"+saltStr2;

    }
	
	
	private static final char[] possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
	private static Set<String> used = new HashSet<>();
	private static final SecureRandom rand = new SecureRandom();

	public static String randomSpecialCharacterString() {
	  String randomStr;
	  do {
	    randomStr = randomSpecialCharacterNonRepeatedString();
	  } while (used.contains(randomStr));
	  used.add(randomStr);
	  return randomStr;
	}

	  public static String randomSpecialCharacterNonRepeatedString() {
	    final StringBuilder randomStr = new StringBuilder(5);

	    IntStream.range(0, 11).forEach(i -> {
	      String randomChar;
	      do {
	        randomChar = RandomStringUtils.random(1, 0, possibleCharacters.length, false, false, possibleCharacters,
	            new SecureRandom());
	      } while (randomStr.indexOf(randomChar) >= 0);
	      randomStr.append(randomChar);
	      

	    });
	    int spacePosition = rand.nextInt(5);
	    return randomStr.replace(spacePosition, spacePosition + 1, "").toString();
	  }
     
	
	public static void main(String [] args) {
		System.out.println(getSaltString());
		randomSpecialCharacterString();
		System.out.println(randomSpecialCharacterString());
		
	}
      
	    
    
}



