package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.*;

public class TestPlayable {
    public static void main(String[] args) {
        // Tạo một DigitalVideoDisc
        DigitalVideoDisc dvd = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        // Gọi phương thức play() của DigitalVideoDisc
        System.out.println("Testing DigitalVideoDisc play:");
        dvd.play();

        // Tạo một Track
        Track track1 = new Track("Song A", 4);  // 4 minutes
        Track track2 = new Track("Song B", 5);  // 5 minutes

        // Gọi phương thức play() của Track
        System.out.println("\nTesting Track play:");
        track1.play();
        track2.play();

        // Tạo một CompactDisc với các Track
        CompactDisc cd = new CompactDisc(1, "The Best Album", "Pop", 19.99f, 10, "John Doe", "Singer");
        // Gọi phương thức play() của CompactDisc
        System.out.println("\nTesting CompactDisc play:");
        cd.play();
    }
}
