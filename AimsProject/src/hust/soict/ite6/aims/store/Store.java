package hust.soict.ite6.aims.store;
import hust.soict.ite6.aims.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;


public class Store {
    // Mảng lưu trữ các DVD trong cửa hàng
    private DigitalVideoDisc[] itemsInStore;
    private int numberOfDVDs;

    // Constructor khởi tạo Store với số lượng DVD ban đầu
    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        numberOfDVDs = 0;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfDVDs < itemsInStore.length) {
            itemsInStore[numberOfDVDs] = dvd;
            numberOfDVDs++;
            System.out.println(dvd.getTitle() + " has been added to the store.");
        } else {
            System.out.println("Store is full, cannot add " + dvd.getTitle());
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < numberOfDVDs; i++) {
            if (itemsInStore[i].getTitle().equals(dvd.getTitle())) {
                // Xoá DVD bằng cách dịch chuyển các DVD còn lại
                for (int j = i; j < numberOfDVDs - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numberOfDVDs - 1] = null;
                numberOfDVDs--;
                System.out.println(dvd.getTitle() + " has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(dvd.getTitle() + " not found in the store.");
        }
    }

    // Phương thức in danh sách các DVD trong cửa hàng
    public void displayItemsInStore() {
        if (numberOfDVDs == 0) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in the store:");
            for (int i = 0; i < numberOfDVDs; i++) {
                System.out.println(itemsInStore[i].getTitle());
            }
        }
    }
}
