package chapter07_Object_Oriented_Programming.Prob07;

import java.util.*;

public abstract class ChatRoom {
    protected List<User> participants;
    protected int id;
    protected List<Message> messages;

    public ChatRoom() {}

    public List<Message> loadMessages() {
        return this.messages;
    }
    public boolean addMessages(Message msg) {
        messages.add(msg);
        return true;
    }
}
