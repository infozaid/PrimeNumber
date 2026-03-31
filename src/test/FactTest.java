package test;

public class FactTest {

    public static void main(String[] args) {
        int number = 5;
        int i = 1;
        int factorial = 1;

        do{
            factorial*=i;
            i++;
        }while(i<=number);
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
