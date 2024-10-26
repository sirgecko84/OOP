package Tido;
public class Aims {

	public static void main(String[] args) {
		// Create a new cart;
		Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation", "Roger Allers", 90, 20.95);
		anOrder.addDigitalVideoDisc(dvd2);
		
		// print total cost
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	}

}
