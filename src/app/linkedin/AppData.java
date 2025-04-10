package app.linkedin;

import java.time.LocalDate;
import java.util.*;

public class AppData {

    private Map<String , User> users;

    public AppData() {
        this.users = new HashMap<>();
    }

    public void addUser(String name , String profession , LocalDate joinedDate){
        if(!users.containsKey(name)){
            users.put(name, new User(name,profession,joinedDate));
        }
    }

    public User getUser(String name){
        return users.get(name);
    }

    public void addConnections(String name1, String name2){
        User user1=users.get(name2);
        User user2=users.get(name1);
        if(user1!=null && user2!=null){
            user1.addConnections(user2);
            user2.addConnections(user1);
        }
    }

    public List<User> getUsersSortedBy(String criteria){
        List<User> userList = new ArrayList<>(users.values());
        switch (criteria.toLowerCase()) {
            case "date":
                userList.sort(Comparator.comparing(User::getJoinedDate));
                break;
            case "name":
                userList.sort(Comparator.comparing(User::getName));
                break;
            case "profession":
                userList.sort(Comparator.comparing(User::getProfession));
                break;
        }

           return userList;
        }
    }

