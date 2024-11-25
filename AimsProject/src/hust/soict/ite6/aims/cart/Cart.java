package hust.soict.ite6.cart.aims;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Add a single DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Disc has been added");
        } else {
            System.out.println("Cart is full");
        }
    }

    // Add multiple DVDs using an array
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("Disc " + dvd.getTitle() + " has been added");
            } else {
                System.out.println("Cart is full, cannot add " + dvd.getTitle());
                break; // Stop when the cart is full
            }
        }
    }

    // Add two DVDs using overloading
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("Disc " + dvd1.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + dvd1.getTitle());
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("Disc " + dvd2.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + dvd2.getTitle());
        }
    }

    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getTitle().equals(disc.getTitle())) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("Disc has been removed");
                break;
            }
        }
    }

    // Calculate the total cost of DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
	// Phương thức in danh sách các đĩa DVD trong giỏ hàng
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc disc = itemOrdered[i];
			System.out.println((i + 1) + ". " + disc.toString());
			totalCost += disc.getCost();
		}
		System.out.println("Total cost: " + totalCost + " $");
		System.out.println("***************************************************");
	}
	
	// Phương thức tìm kiếm theo ID
	public void searchById(int id) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getId() == id) {
				System.out.println("Found: " + itemOrdered[i].toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No DVD found with ID: " + id);
		}
	}
	
	// Phương thức tìm kiếm theo tiêu đề
	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].isMatch(title)) {
				System.out.println("Found: " + itemOrdered[i].toString());
				found = true;
			}
		}
		if (!found) {
				System.out.println("No DVD found with title: " + title);
		}
	}
}
