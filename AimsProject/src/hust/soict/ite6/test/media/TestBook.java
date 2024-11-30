package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.Book;
import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        // Tạo đối tượng Book mới
        Book book1 = new Book(1, "Java Programming", "Technology", 29.99f);
        
        // Kiểm tra các thuộc tính của sách
        System.out.println("Book ID: " + book1.getId());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Category: " + book1.getCategory());
        System.out.println("Cost: " + book1.getCost());

        // Thêm tác giả vào sách
        book1.addAuthor("Author 1");
        book1.addAuthor("Author 2");
        book1.addAuthor("Author 1");  // Test trường hợp tác giả đã có

        // In danh sách tác giả
        System.out.println("Authors: " + book1.getAuthors());

        // Xóa tác giả
        book1.removeAuthor("Author 2");
        book1.removeAuthor("Author 3");  // Test trường hợp tác giả không tồn tại

        // In danh sách tác giả sau khi xóa
        System.out.println("Authors after removal: " + book1.getAuthors());
    }
}
