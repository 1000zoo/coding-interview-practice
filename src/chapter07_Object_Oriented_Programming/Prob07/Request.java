package chapter07_Object_Oriented_Programming.Prob07;

import java.util.List;

public class Request {
    private final String ip = "";

    public static boolean connectServer(User user) {
        return false;
    }

    public static boolean sendMessage(Message msg) {
        return false;
    }

    public static User findUser(String email) {
        return Server.findUser(email);
    }

    public static boolean addFriends(String email) {
        return false;
    }

    public static boolean removeFriends(User user) {
        return false;
    }

    public static List<Message> loadMessages(int roomId) {
        return Server.loadMessages(roomId);
    }

    public static List<User> loadParticipants(int roomId) {
        return Server.loadParticipants(roomId);
    }

    public static void joinChatRoom(int roomId, User user) {
        Server.joinChatRoom(roomId, user);
    }

    public static void inviteGroupChatRoom(int roomId, User host, User guest) {
        Server.inviteGroupChatRoom(roomId, host, guest);
    }

    public static void leaveGroupChatRoom(int roomId, User user) {
        Server.leaveChatRoom(roomId, user);
    }

}
