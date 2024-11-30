package hust.soict.ite6.test.disc;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.store.Store;
public class TestClassMember {
    public static void main(String[] args) {
        // Create some DVDs to test
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Jungle");
        System.out.println("DVD 1 - ID: " + dvd1.getId() + ", Title: " + dvd1.getTitle());

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Adventure", "The Jungle Adventure", 15.5f);
        System.out.println("DVD 2 - ID: " + dvd2.getId() + ", Title: " + dvd2.getTitle());

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("John Doe", "Action", "The Big Adventure", 120, 20.0f);
        System.out.println("DVD 3 - ID: " + dvd3.getId() + ", Title: " + dvd3.getTitle());

        System.out.println("Total number of DigitalVideoDiscs: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}
