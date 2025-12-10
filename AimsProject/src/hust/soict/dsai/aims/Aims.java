package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class Aims {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
			if (choice == 1) { viewStore(store, cart); } 
			else if (choice == 2) { updateStore(store); }
			else if (choice == 3) { viewCart(cart); }
			else if (choice == 0) { System.out.println("Exit AIMS");
				return;
			}
			else {System.out.println("Invalid"); }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("-------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-------------");
        System.out.print("Please choose a number: 0-1-2-3 ");
    }

    public static void storeMenu() {
        System.out.println("Store Options:");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.print("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options:");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.print("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Cart Options:");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.print("Please choose a number: 0-1-2-3-4-5");
    }

    public static void viewStore(Store store, Cart cart) {
        while (true) {
            store.printStore();
            storeMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) { seeMediaDetails(store, cart); }
            else if (choice == 2) { addMediaToCart(store, cart); }
            else if (choice == 3) { playMedia(store); }
            else if (choice == 4) { viewCart(cart); }
            else if (choice == 0) { return; }
            else System.out.println("Invalid choice!");
            }
        }

    public static void seeMediaDetails(Store store, Cart cart) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        Media media = store.findByTitle(title);
        if (media == null) {
            System.out.println("Media not found!");
            return;
        }
        System.out.println(media.toString());
        while (true) {
            mediaDetailsMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
            	cart.addMedia(media);
                return;
                }
            else if (choice == 2) {
                    if (media instanceof Playable playable) {
                        playable.play();
                    } else {
                        System.out.println("This media cannot be played!");
                    }
                    return;
                }
            	else if (choice == 0) { return; }
                else System.out.println("Invalid choice!");
        }
    }

    public static void addMediaToCart(Store store, Cart cart) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = store.findByTitle(title);
        if (media == null) {
            System.out.println("Media not found!");
            return;
        }
        cart.addMedia(media);
    }

    public static void playMedia(Store store) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = store.findByTitle(title);
        if (media == null) {
            System.out.println("Media not found!");
            return;
        }

        if (media instanceof Playable playable) {
            playable.play();
        } else {
            System.out.println("This media cannot be played.");
        }
    }

    public static void updateStore(Store store) {
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media from store");
        System.out.print("Choose: ");

        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1){
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter cost: ");
                float cost = Float.parseFloat(scanner.nextLine());

                Media media = new Media(0, title, category, cost) {};
                store.addMedia(media);

                System.out.println("Added to store.");
        }
        else if (choice == 2) {
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                Media media = store.findByTitle(title);
                if (media != null) {
                    store.removeMedia(media);
                    System.out.println("Removed from store.");
                } else {
                    System.out.println("Media not found.");
                }
        }
        else System.out.println("Invalid");
        }

    public static void viewCart(Cart cart) {
        while (true) {
            cart.print();
            cartMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {filterCart(cart); }
            else if (choice == 2) { sortCart(cart); }
            else if (choice == 3) { removeFromCart(cart); }
            else if (choice == 4) { playFromCart(cart); }
            else if (choice == 5) {
                System.out.println("Order placed! Cart is now empty.");
                cart.empty();
                return;
            } 
            else if (choice == 0) { return; }
            else System.out.println("Invalid choice!");
            
        }
    }
    public static void filterCart(Cart cart) {
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by Title");
        System.out.print("Choose: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            cart.filterById(id);
        } else if (choice == 2) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            cart.filterByTitle(title);
        }
    }

    public static void sortCart(Cart cart) {
        System.out.println("1. Sort by Title");
        System.out.println("2. Sort by Cost");
        System.out.print("Choose: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) cart.sortByTitleCost();
        else if (choice == 2) cart.sortByCostTitle();
    }

    public static void removeFromCart(Cart cart) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = cart.filterByTitle(title);
        if (media != null) {
            cart.removeMedia(media);
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playFromCart(Cart cart) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = cart.filterByTitle(title);
        if (media == null) {
            System.out.println("Media not found.");
            return;
        }

        if (media instanceof Playable playable) {
            playable.play();
        } else {
            System.out.println("This media cannot be played.");
        }
    }
}
