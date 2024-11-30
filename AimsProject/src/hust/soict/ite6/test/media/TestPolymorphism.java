package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();

        // Tạo các đối tượng CD, DVD, Book
        CompactDisc cd = new CompactDisc(1, "The Best Album", "Pop", 19.99f, 10, "John Doe", "Singer");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        Book book = new Book(1, "Java Programming", "Technology", 29.99f);

        // Thêm vào danh sách
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

        // Duyệt qua danh sách và in thông tin của các đối tượng
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
