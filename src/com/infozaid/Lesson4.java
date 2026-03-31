package com.infozaid;

public class Lesson4 {
    public static void main(String[] args) {
        /*

        int count = 0;
        for (int i = 2; i < 100; i++){
            if (isEven(i)){
                System.out.println("Even number is "+ i);
                count++;
            }
            if (count == 20){
                break;
            }

        }
        */

        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number is: " + i);
                count++;
            }
            if (count == 20) {
                break;
            }
        }
    }

    public static boolean isPrime ( int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}