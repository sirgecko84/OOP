package Tido;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

private int qtyOrdered = 0;

public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	if(qtyOrdered < 20) {
		itemOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("Disc has been added");
	}
	else {
		System.out.println("Cart is full");
	}
}

public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	for(int i = 0; i < qtyOrdered; i++) {
		if(itemOrdered[i].getTitle() == disc.getTitle()) {
			for(int j = i; j<qtyOrdered; j++) {
				itemOrdered[j] = itemOrdered[j+1];
			}
			qtyOrdered--;
			System.out.println("Disc has been removed");
			break;
		}
	}
}

public float totalCost() {
	float total = 0;
	for(int i = 0; i < qtyOrdered; i++) {
		total+= itemOrdered[i].getCost();
	}
	return total;
}
}

