package hust.soict.ite6.test.media;

import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Track;

public class TestMediaTrack {
    public static void main(String[] args) {
        // Tạo đối tượng Track
        Track track1 = new Track("Song A", 180);
        Track track2 = new Track("Song A", 180);
        Track track3 = new Track("Song B", 200);

        // Kiểm tra equals trong lớp Track
        System.out.println("Track1 equals Track2: " + track1.equals(track2)); // true
        System.out.println("Track1 equals Track3: " + track1.equals(track3)); // false

        // Tạo đối tượng Media (Media là lớp abstract, nên tạo một lớp con ví dụ)
        Media media1 = new Media(1, "Movie A", "Action", 20.5f) {}; // Tạo đối tượng Media tạm thời
        Media media2 = new Media(1, "Movie A", "Action", 20.5f) {}; // Cũng có thông tin giống như media1
        Media media3 = new Media(2, "Movie B", "Drama", 15.0f) {}; // Media khác

        // Kiểm tra equals trong lớp Media
        System.out.println("Media1 equals Media2: " + media1.equals(media2)); // true
        System.out.println("Media1 equals Media3: " + media1.equals(media3)); // false
    }
}
