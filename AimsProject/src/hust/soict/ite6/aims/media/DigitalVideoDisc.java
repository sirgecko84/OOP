package hust.soict.ite6.aims.media;

// DigitalVideoDisc kế thừa từ Disc
public class DigitalVideoDisc extends Disc implements Playable {
    // Biến static để đếm số lượng DigitalVideoDisc
    private static int nbDigitalVideoDiscs = 0;

    // Constructor với tiêu đề
    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0, 0, null);
    }

    // Constructor với category, title, và cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null);
    }

    // Constructor với director, category, title, và cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, director);
    }

    // Constructor với tất cả thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    // Getter cho nbDigitalVideoDiscs
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Phương thức isMatch để tìm kiếm tiêu đề
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title); // So sánh không phân biệt hoa thường
    }

    // Phương thức toString để in thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " 
                + (getDirector() != null ? getDirector() : "N/A") + " - " 
                + (getLength() > 0 ? getLength() : "N/A") + ": " + getCost() + " $";
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
