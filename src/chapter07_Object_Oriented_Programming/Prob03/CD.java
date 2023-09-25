package chapter07_Object_Oriented_Programming.Prob03;

import java.util.*;

public class CD {
    public String cdName;
    public Set<Song> playlist;

    public CD(String cdName) {
        this.cdName = cdName;
        playlist = new HashSet<>();
    }

    public CD(List<Song> list) {
        this.cdName = "NTT";
        playlist = new HashSet<>();
        playlist.addAll(list);
    }

    public void add(Song song) {
        playlist.add(song);
    }
    public void remove(Song song) {
        playlist.remove(song);
    }
    public boolean contains(Song song) {
        return playlist.contains(song);
    }
    public List<Song> findByTitle(String title) {
        List<Song> temp = new ArrayList<>();
        for (Song song : playlist) {
            if (song.isTitleEqualWith(title)) {
                temp.add(song);
            }
        }
        return temp;
    }
    public List<Song> findByArtist(String artist) {
        List<Song> temp = new ArrayList<>();
        for (Song song : playlist) {
            if (song.isArtistEqualWith(artist)) {
                temp.add(song);
            }
        }
        return temp;
    }
}
