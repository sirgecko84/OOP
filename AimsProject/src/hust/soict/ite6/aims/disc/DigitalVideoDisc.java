package hust.soict.ite6.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Classifier member and Instance member
    private static int nbDigitalVideoDiscs = 0; // class variable to count DVDs
    private int id; // instance variable to hold the unique id

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    // Constructor with title
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;  // assign unique id
    }

    // Constructor with category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;  // assign unique id
    }

    // Constructor with director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;  // assign unique id
    }

    // Constructor with all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;  // assign unique id
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for nbDigitalVideoDiscs
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Phương thức isMatch để tìm kiếm tiêu đề
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title); // So sánh không phân biệt hoa thường
    }

    // Phương thức toString để in thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " 
                + (director != null ? director : "N/A") + " - " 
                + (length > 0 ? length : "N/A") + ": " + cost + " $";
    }
}
