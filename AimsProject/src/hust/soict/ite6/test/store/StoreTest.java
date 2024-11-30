package hust.soict.ite6.test.store;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.store.Store;
public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng với sức chứa 10 DVD
        Store store = new Store(10);

        // Tạo DVD và thêm vào cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd3);

        // In danh sách DVD trong cửa hàng
        store.displayItemsInStore();

        // Xóa DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // Kiểm tra lại danh sách DVD trong cửa hàng
        store.displayItemsInStore();
    }
}
