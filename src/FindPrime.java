
public class FindPrime {

    public static void main(String[] args) {

        int i, m = 0, flag = 0;

        int n = 11;

        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " Number is not prime");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }
}
