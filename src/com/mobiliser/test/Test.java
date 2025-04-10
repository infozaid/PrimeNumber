package com.mobiliser.test;

public class Test {

    public static void main(String[] args){
        Customer customer = new Customer();

        System.out.println((customer.getBolSpare5() != null && customer.getBolSpare5()) ? "Yes" : "No");

        if(customer.getBolSpare5()!=null && customer.getBolSpare5()){
            System.out.println("Suspended");
        }else{
            System.out.println("not suspended");
        }
    }
}
