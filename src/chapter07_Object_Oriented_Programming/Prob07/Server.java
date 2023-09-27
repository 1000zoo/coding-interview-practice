package chapter07_Object_Oriented_Programming.Prob07;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    private static final Map<String, User> userMap = new HashMap<>();
    private static final Map<Integer, ChatRoom> chatRoomMap = new HashMap<>();


    public static boolean addUser(String email, User user) {
        if (userMap.containsKey(email)) {
            // 이미 존재하는 Email
            return false;
        }
        userMap.put(email, user);
        return true;
    }

    public static boolean removeUser(String email) {
        userMap.remove(email);
        return true;
    }

    public static User findUser(String email) {
        return userMap.get(email);
    }

    public static void joinChatRoom(int roomId, User user) {
        ChatRoom room = chatRoomMap.get(roomId);
        if (room.getClass() != GroupChatRoom.class) throw new ClassCastException();
        ((GroupChatRoom) room).addParticipants(user);
    }

    public static void leaveChatRoom(int roomId, User user) {
        ChatRoom room = chatRoomMap.get(roomId);
        if (room.getClass() != GroupChatRoom.class) throw new ClassCastException();
        ((GroupChatRoom) room).removeParticipants(user);
    }

    public static List<Message> loadMessages(int roomId) {
        ChatRoom room = chatRoomMap.get(roomId);
        return room.loadMessages();
    }

    public static List<User> loadParticipants(int roomId) {
        ChatRoom room = chatRoomMap.get(roomId);
        return room.participants;
    }

    public static void inviteGroupChatRoom(int roomId, User host, User guest) {
        joinChatRoom(roomId, guest);
        // host 가 guest 를 초대했습니다.
    }
}
