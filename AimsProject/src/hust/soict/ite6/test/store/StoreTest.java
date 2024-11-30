package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.store.Store;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng
        Store store = new Store();

        // Thêm các đối tượng Media vào cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);
        store.addMedia(dvd1);

        Book book1 = new Book(1, "Java Programming", "Educational", 39.99f);
        store.addMedia(book1);

        CompactDisc cd1 = new CompactDisc(1, "Best of 90s", "Pop", 15.99f, 60, "Various Artists", "Various Performers");
        store.addMedia(cd1);

        // Hiển thị danh sách các Media trong cửa hàng
        store.displayItemsInStore();

        // Xóa DVD khỏi cửa hàng
        store.removeMedia(dvd1);
        
        // Hiển thị lại danh sách sau khi xóa
        store.displayItemsInStore();
    }
}
