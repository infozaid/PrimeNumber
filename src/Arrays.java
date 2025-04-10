import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Arrays {


	static void sumOfNumbersLessThanThree(int arr[]){
		int sum=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]<6){
				sum+=arr[i];
			}
		}
		System.out.println("There is sum which are less than Six: "+sum);
	}

	static void maximum(int arr[]){
		int max = arr[0];

		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}


		int findMaxThroughStreams = java.util.Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);

		System.out.println("Here is max value in a given array: "+max);

		System.out.println("Here is max Value using streams: "+findMaxThroughStreams);
	}


	static void min(int arr[]){
		int min = arr[0];
		for(int i= 0; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("The minimum value of a given array is: "+min);
	}

	public static void main(String[] args) {

		int arr[]={33,34,4,5,6,1,2};
		min(arr);

		maximum(arr);

		sumOfNumbersLessThanThree(arr);

		ArrayList<Integer> numbers=new ArrayList<>();

		numbers.add(100);
		numbers.add(50);
		numbers.add(30);
		numbers.add(60);
		numbers.add(80);

		numbers.stream()
				.map(String::valueOf)
				.peek(System.out::println)
						.collect(Collectors.toSet());

		System.out.println("before reverse number..."+numbers);
		numbers.stream().forEach(System.out::println);

		System.out.println("after reverse number...");
		Collections.reverse(numbers);

		System.out.println(numbers.get(0));
		for(int i:numbers) {
			System.out.println(i);
		}

		System.out.println("Iteration #2");

		for(int Value :numbers) {
			System.out.println(Value);
		}

	}

}
