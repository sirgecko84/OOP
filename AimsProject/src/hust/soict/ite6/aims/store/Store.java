package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.media.Media;
import java.util.ArrayList;

public class Store {
    // Mảng lưu trữ các Media trong cửa hàng
    private ArrayList<Media> itemsInStore;

    // Constructor khởi tạo Store với số lượng Media ban đầu
    public Store() {
        itemsInStore = new ArrayList<Media>();
    }

    // Phương thức thêm Media vào cửa hàng
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    // Phương thức xóa Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " not found in the store.");
        }
    }

    // Phương thức in danh sách các Media trong cửa hàng
    public void displayItemsInStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in the store:");
            for (Media media : itemsInStore) {
                System.out.println(media.getTitle());
            }
        }
    }
}
