package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() { return artist; }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track " + track.getTitle() + " already exists.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track " + track.getTitle() + " not found.");
        }
    }

    @Override
    public int getLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by artist: " + this.getArtist());
        System.out.println("CD total length: " + this.getLength() + " minutes.");
        System.out.println("----------------------------------------");

        for (Track track : tracks) {
            track.play();
        }
    }
}


