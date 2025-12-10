package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();


    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    
    public void addTrack(Track track) {
    	if (tracks.contains(track)) {
    		System.out.println("Track already exists");
    	} else {
    		System.out.println("Add track: " + track.getTitle());
    	}
    }
    
    public void removeTrack(Track track) {
    	if (tracks.contains(track)) {
    		System.out.println("Remove track: " + track.getTitle());
    	} else {
    		System.out.println("Track not found");
    	}
    }
    
    public int getLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "CD: " + this.getTitle() + " - " + this.getCategory() +
               " - Artist: " + this.getArtist() +
               " - Director: " + this.getDirector() +
               " - Length: " + this.getLength() + " mins - " +
               this.getCost() + "$";
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());

        for (Track track : tracks) {
            track.play();
        }
    }
}