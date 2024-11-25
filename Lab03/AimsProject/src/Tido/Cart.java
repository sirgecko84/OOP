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

//2. Working with method overloading
//2.1 Overloading by differing types of parameter
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    for (DigitalVideoDisc dvd : dvdList) {
        if (qtyOrdered < 20) {
            itemOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("Disc " + dvd.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + dvd.getTitle());
            break; // Dừng lại khi giỏ hàng đã đầy
        }
    }
}

// method allows to pass an arbitrary number of arguments for dvd
// public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//     for (DigitalVideoDisc dvd : dvdList) {
//         if (qtyOrdered < 20) {
//             itemOrdered[qtyOrdered] = dvd;
//             qtyOrdered++;
//             System.out.println("Disc " + dvd.getTitle() + " has been added");
//         } else {
//             System.out.println("Cart is full, cannot add " + dvd.getTitle());
//             break; // Dừng lại khi giỏ hàng đã đầy
//         }
//     }
// }

//2.2 . Overloading by differing the number of parameters
public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    if (qtyOrdered < 20) {
        itemOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        System.out.println("Disc " + dvd1.getTitle() + " has been added");
    } else {
        System.out.println("Cart is full, cannot add " + dvd1.getTitle());
    }
    
    if (qtyOrdered < 20) {
        itemOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println("Disc " + dvd2.getTitle() + " has been added");
    } else {
        System.out.println("Cart is full, cannot add " + dvd2.getTitle());
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

