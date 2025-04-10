
import java.util.*;
import java.util.Arrays;


public class Avg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Date date=new Date();
		int total=arr.length;
		for(int i=0;i<arr.length;i++) {
			total+=i;
		}

		System.out.println(total);
		System.out.println("Average of total in a given array is: "+total/arr.length);
		System.out.println(date.toString());

		List<Integer> numList= Arrays.asList(1,2,3,5,7,9,10,11,12,13,14,15);
		int sum=0;
		Iterator<Integer> iterator = numList.iterator();
		while(iterator.hasNext()){
			int num = iterator.next();
			if(num<10){
				sum+=num;
			}
		}

		System.out.println("sum without using streams: "+sum);

		int sum0=numList.stream().filter(num->num<10).mapToInt(num->num).sum();


		System.out.println("sum using streams: "+sum0);

		List<String> nameList=new ArrayList<>(Arrays.asList("Brown","Black","Carrot"));
		//	List<String> filteredList= nameList.stream().filter(name->name.charAt(0)=='B').collect(Collectors.toList());

		nameList.removeIf(name->(name.charAt(0) == 'B'));

		nameList.forEach(System.out::println);

		//	System.out.println(filteredList);
	}

}
