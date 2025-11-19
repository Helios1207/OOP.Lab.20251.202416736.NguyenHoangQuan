package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qty;
    private static final int MAX_NUM_DVDS = 50;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_NUM_DVDS];
        qty = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qty < MAX_NUM_DVDS) {
            itemsInStore[qty] = disc;
            qty++;
            System.out.println("Add: " + disc.getTitle());
        } else {
            System.out.println("Full");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qty; i++) {
            if (itemsInStore[i].equals(disc)) {
                // Shift remaining DVDs left
                for (int j = i; j < qty - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qty - 1] = null;
                qty--;
                found = true;
                System.out.println("Remove: " + disc.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("Not found: " + disc.getTitle());
        }
    }

    public void displayStore() {
        System.out.println("*****DVD*****");
        for (int i = 0; i < qty; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].getTitle());
        }
        System.out.println("*************");
    }
}