package app.linkedin;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class User {

    private String name;
    private String profession;
    private LocalDate joinedDate;
    private Set<User> connections;

    public User(String name, String profession, LocalDate joinedDate) {
        this.name = name;
        this.profession = profession;
        this.joinedDate = joinedDate;
        this.connections = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Set<User> getConnections() {
        return connections;
    }

    public void setConnections(Set<User> connections) {
        this.connections = connections;
    }

    public void addConnections(User user){
        connections.add(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", joinedDate=" + joinedDate +
                ", connections=" + connections +
                '}';
    }
}
