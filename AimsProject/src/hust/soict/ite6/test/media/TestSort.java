package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Media> cart = new ArrayList<>();

        // Sử dụng lớp Book thay vì Media
        cart.add(new Book(1, "Book A", "Book", 10.5f));
        cart.add(new Book(2, "Book B", "Book", 8.0f));
        cart.add(new Book(3, "Book A", "Book", 15.0f));

        System.out.println("Before sorting:");
        for (Media media : cart) {
            System.out.println(media);
        }

        // Sắp xếp theo title rồi cost
        Collections.sort(cart, Media.COMPARE_BY_TITLE_COST);
        System.out.println("\nSorted by Title then Cost:");
        for (Media media : cart) {
            System.out.println(media);
        }

        // Sắp xếp theo cost rồi title
        Collections.sort(cart, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted by Cost then Title:");
        for (Media media : cart) {
            System.out.println(media);
        }
    }
}

