package ua.ishop.kataula.db;

import ua.ishop.kataula.model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static final List<User> users = new ArrayList<>();

    public static void addUser(User user){
        if(user != null){
            users.add(user);
        }
    }

    public static List<User> getUsers(){
        return users;
    }
}