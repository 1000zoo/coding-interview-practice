package chapter07_Object_Oriented_Programming.Prob03;

import java.util.Objects;

public class Song {
    public String title;
    public String artist;

    public Song(String name, String artist) {
        title = name;
        this.artist = artist;
    }

    public boolean isTitleEqualWith(String title) {
        return this.title.equals(title);
    }
    public boolean isArtistEqualWith(String artist) {
        return this.artist.equals(artist);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    public String toString() {
        return "title: " + title + " / artist: " + artist;
    }
}
