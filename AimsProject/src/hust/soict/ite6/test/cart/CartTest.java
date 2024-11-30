package hust.soict.ite6.test.cart;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.store.Store;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo và thêm các Media vào giỏ hàng

        // Thêm DigitalVideoDisc vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Guy Ritchie", 128, 18.99f);
        cart.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Cindarella", "Animation", "Khanh Truong", 173, 17.99f);
        cart.addMedia(dvd4);

        // Thêm Book vào giỏ hàng
        Book book1 = new Book(1, "Java Programming", "Educational", 39.99f);
        cart.addMedia(book1);

        Book book2 = new Book(2, "Learning AI", "Technology", 29.95f);
        cart.addMedia(book2);

        // Thêm CompactDisc vào giỏ hàng
        CompactDisc cd1 = new CompactDisc(1, "Best of 90s", "Pop", 15.99f, 60, "Various Artists", "Various Performers");
        cart.addMedia(cd1);

        CompactDisc cd2 = new CompactDisc(2, "Rock Classics", "Rock", 17.49f, 75, "John Doe", "The Rockers");
        cart.addMedia(cd2);
         // Kiểm tra phương thức in giỏ hàng
         cart.print();

        // // Tìm kiếm theo ID
        // System.out.println("\nSearch by ID:");
        // cart.searchById(2);

        // // Tìm kiếm theo tiêu đề
        // System.out.println("\nSearch by Title:");
        // cart.searchByTitle("Star Wars");
    }
}
