package chapter07_Object_Oriented_Programming.Prob03;

import java.util.*;

public class Jukebox {
    public List<CD> cdList;
    public List<User> userList;

    public Jukebox() {
        cdList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public void addCD(CD cd) {
        cdList.add(cd);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void findSong(String title, String artist) {
        Song song = new Song(title, artist);
        for (CD cd : cdList) {
            if (cd.contains(song)) {
                playSong(song);
            }
        }
    }

    public void findSongByTitle(String title) {
        List<Song> list = new ArrayList<>();
        for (CD cd : cdList) {
            list.addAll(cd.findByTitle(title));
        }
        displayList(list);
    }
    public void findSongByArtist(String artist) {
        List<Song> list = new ArrayList<>();
        for (CD cd : cdList) {
            list.addAll(cd.findByArtist(artist));
        }
        displayList(list);
    }

    public void displayList(List<Song> list) {
        System.out.println("list = " + list);
    }

    public void playSong(Song song) {
        System.out.println("song = " + song);
    }
}
