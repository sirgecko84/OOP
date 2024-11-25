package hust.soict.ite6.aims;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.store.Store;

public class Aims {

    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
        
        // Create new dvd objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation", "Roger Allers", 90, 20.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Animation", "Roger Allers", 95, 21.95f);
        
        // Create an array of DigitalVideoDisc
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        
        //2.1 Add the array of DVDs to the cart
        anOrder.addDigitalVideoDisc(dvdList);
		//2.1 method allows to pass an arbitrary number of arguments for dvd
        //anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

		//2.2 Use the overloaded method with two parameters
		// anOrder.addDigitalVideoDisc(dvd1, dvd2);
        // Print total cost
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
