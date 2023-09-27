package chapter07_Object_Oriented_Programming.Prob07;

import java.util.*;

public class User {
    private final String name;
    private final String email;
    private final List<User> friends;
    private final List<ChatRoom> chatRooms;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.friends = new ArrayList<>();
        this.chatRooms = new ArrayList<>();
    }

    public boolean addFriends(String email) {
        if (Request.addFriends(email)) {
            friends.add(Request.findUser(email));
            return true;
        }
        return false;
    }

    public void removeFriends(String email) {
        friends.remove(Request.findUser(email));
    }

    public void sendMessage(Message msg) {}
    public void inviteGroupChatRoom(String email) {}


}
