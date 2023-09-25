package chapter07_Object_Oriented_Programming.Prob03;

import java.util.*;

public class User {
    public String id;
    public List<Song> playlist;

    public User(String id) {
        this.id = id;
        playlist = new ArrayList<>();
    }

    public void add(Song song) {
        playlist.add(song);
    }
    public void remove(Song song) {
        playlist.remove(song);
    }
}
