package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
	    if (itemsInStore.contains(media)) {
	        System.out.println("Media already exists");
	    } else {
	        itemsInStore.add(media);
	        System.out.println("Added : " + media.getTitle());
	    }
	}
	
	public void removeMedia(Media media) {
	    if (itemsInStore.contains(media)) {
	        itemsInStore.remove(media);
	        System.out.println("Removed : " + media.getTitle());
	    } else {
	        System.out.println("Media not found.");
	    }
	}
	
    public void printStore() {
        System.out.println("******** STORE ********");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
        System.out.println("************************");
    }
    
    public Media findByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
    

}