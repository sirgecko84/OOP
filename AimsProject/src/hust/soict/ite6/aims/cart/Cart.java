package hust.soict.ite6.aims.cart;

import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Add a single media item to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Media has been added");
        } else {
            System.out.println("Cart is full");
        }
    }

    // Add multiple media items using an array
    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(media);
                System.out.println("Media " + media.getTitle() + " has been added");
            } else {
                System.out.println("Cart is full, cannot add " + media.getTitle());
                break; // Stop when the cart is full
            }
        }
    }

    // Add two media items using overloading
    public void addMedia(Media media1, Media media2) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media1);
            System.out.println("Media " + media1.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + media1.getTitle());
        }

        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media2);
            System.out.println("Media " + media2.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + media2.getTitle());
        }
    }

    // Remove a media item from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Media has been removed");
        } else {
            System.out.println("Media not found in cart");
        }
    }

    // Calculate the total cost of media items in the cart
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Print the details of the media items in the cart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + media.toString());
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    // Search for media by ID
    // public void searchById(int id) {
    //     boolean found = false;
    //     for (Media media : itemsOrdered) {
    //         if (media.getId() == id) {
    //             System.out.println("Found: " + media.toString());
    //             found = true;
    //             break;
    //         }
    //     }
    //     if (!found) {
    //         System.out.println("No media found with ID: " + id);
    //     }
    // }

    // Search for media by title
    // public void searchByTitle(String title) {
    //     boolean found = false;
    //     for (Media media : itemsOrdered) {
    //         if (media.isMatch(title)) {
    //             System.out.println("Found: " + media.toString());
    //             found = true;
    //         }
    //     }
    //     if (!found) {
    //         System.out.println("No media found with title: " + title);
    //     }
    // }
}
