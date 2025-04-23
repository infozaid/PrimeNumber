import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Check {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 8, 9);

        int sum = 0;

        int sum2 = 0;

        for(Integer num : numList) {
            if(num<10){
                sum2+=num;
            }
            System.out.println(num);
        }
        System.out.println(sum2);

        Iterator<Integer> iterator = numList.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num < 10) {
                sum += num;
            }
        }
        System.out.println(sum);

        int sumUsingStreams = numList.stream().filter(num -> num < 10).mapToInt(num -> num).sum();
        System.out.println("Sum using streams: " + sumUsingStreams);
    }
}
