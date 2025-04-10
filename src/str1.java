import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

import javax.lang.model.element.Element;

public class str1 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Brian");

		arr.add("Bob");

		arr.add("David");

		arr.add("Brandon");
		arr.add("Eli");

		ArrayList<String> test = new ArrayList<String>();

		test = filter(arr, 'B');

		for (String s : test) {
			System.out.println(s);
		}

	}

	public static ArrayList<String> filter(ArrayList<String> a, char c) {
		int i = 0;
		while (i < a.size()) {
			String test1 = a.get(i);
			if (test1.charAt(0) == c) {
				a.remove(i);
			} else {
				i++;
			}
		}
		return a;
	}
}
