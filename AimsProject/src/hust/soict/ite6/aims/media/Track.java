package hust.soict.ite6.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter cho title
    public String getTitle() {
        return title;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu đối tượng này và đối tượng so sánh là giống nhau
        if (this == obj) return true;

        // Kiểm tra nếu đối tượng truyền vào là null hoặc không phải là đối tượng cùng lớp
        if (obj == null || getClass() != obj.getClass()) return false;

        // Ép kiểu đối tượng thành Track để truy cập các thuộc tính
        Track track = (Track) obj;

        // So sánh title và length
        return title.equals(track.title) && length == track.length;
    }

    @Override
    public String toString() {
        return "Track [Title=" + title + ", Length=" + length + "]";
    }
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.title);
        System.out.println("Track length: " + this.length);
    }
}
