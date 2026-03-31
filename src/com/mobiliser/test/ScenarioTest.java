package com.mobiliser.test;

public class ScenarioTest {
    public static void main(String[] args) {

        int total = 0;
        String response = "";

        try {


            for (int i = 0; i < 5; i++) {
                total += i;
            }
            if (total>0){
                response = "Success";
            }
        }catch (Exception e) {
            if(total<0){
                response = "Error";
            }
            e.printStackTrace();
        }finally {
            System.out.println(response);
        }
    }
}
