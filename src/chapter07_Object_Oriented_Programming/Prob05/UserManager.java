package chapter07_Object_Oriented_Programming.Prob05;

import java.util.*;

public class UserManager {
    public Map<Integer, User> userMap;

    public UserManager() {
        userMap = new HashMap<>();
    }

    public User addUser(int id, String details, int accountType) {
        if (userMap.containsKey(id)) return null;

        User user = new User(id, details, accountType);
        userMap.put(id, user);
        return user;
    }

    public User find(int id) {
        return userMap.get(id);
    }
    public boolean remove(User user) {
        return remove(user.getUserID());
    }
    public boolean remove(int id) {
        if (!userMap.containsKey(id)) return false;
        userMap.remove(id);
        return true;
    }
}
