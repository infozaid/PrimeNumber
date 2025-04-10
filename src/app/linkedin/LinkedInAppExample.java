package app.linkedin;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class LinkedInAppExample {

    public static void main(String[] args){
        AppData appData = new AppData();

        appData.addUser("Ali","Software Engineer", LocalDate.of(2023,5,1));
        appData.addUser("Yousuf","Data Engineer", LocalDate.of(2022,6,1));
        appData.addUser("Salman","Data Engineer", LocalDate.of(2020,8,20));



        appData.addConnections("Alice","Bob");
        appData.addConnections("Alice","johny");

        List<User> sortedByDate = appData.getUsersSortedBy("date");
        sortedByDate.forEach(System.out::println);

        System.out.println("Print Alice Connections");

        User alice = appData.getUser("Ali");


        alice.getConnections().forEach(System.out::println);

    }
}
