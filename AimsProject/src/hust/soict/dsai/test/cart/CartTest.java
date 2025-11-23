package hust.soict.dsai.test;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;

public class CartTest {
    public static void main (String[] args){
        // --------- Create Store and Cart ---------
        Store store = new Store();
        Cart cart = new Cart();

        // --------- Create Media ---------
        Media dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        Media dvd2 = new DigitalVideoDisc(2, "Star Wars", "Sci-fi", 24.95f, 124, "George Lucas");
        Media book1 = new Book(3, "Data Structures", "Education", 15.50f);
        Media cd1 = new CompactDisc(4, "Thriller", "Music", 18.00f, 40, "Quincy Jones", "Michael Jackson");

        // Add tracks to CD (optional)
        cd1.addTrack(new Track("Beat It", 5));
        cd1.addTrack(new Track("Thriller", 6));
    }
}
