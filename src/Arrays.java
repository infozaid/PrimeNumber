import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		
		numbers.add(100);
		numbers.add(50);
		numbers.add(30);
		numbers.add(60);
		numbers.add(80);
		
		Collections.reverse(numbers);
		
		System.out.println(numbers.get(0));
		System.out.println("Iteration #1");
		for(int i:numbers) {
			System.out.println(i);
		}
		
		System.out.println("Iteration #2");
		
		for(int Value :numbers) {
			System.out.println(Value);
		}
	}

}
