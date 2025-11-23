package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public Cart() {
        super();
    }
    
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Media already have");
        } else {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        }
    }
    
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Media not found.");
        }
    }
    
    public float totalCost() {
        float sum = 0;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }
    
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    
    public void filterById(int id) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.getId() == id) {
                System.out.println(m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media with ID: " + id);
        }
    }
    
    public Media filterByTitle(String title) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.getTitle().equalsIgnoreCase(title)) {
            	return m;
            }
        }
        if (!found) {
            System.out.println("No media with title: " + title);
        }
		return null;
    }
    
    public void print(){
        System.out.println("********************CART********************");
        System.out.println("Ordered Items: ");
        System.out.println("Total cost: " + totalCost());
        System.out.println("********************************************");
    }
    
    public void empty() {
        itemsOrdered.clear();
    }
    
}


