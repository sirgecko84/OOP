package Tido;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo và thêm DVD vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Guy Ritchie", 128, 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Kiểm tra phương thức in giỏ hàng
        cart.print();

        // Tìm kiếm theo ID
        System.out.println("\nSearch by ID:");
        cart.searchById(2);

        // Tìm kiếm theo tiêu đề
        System.out.println("\nSearch by Title:");
        cart.searchByTitle("Star Wars");
    }
}

