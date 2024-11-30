package hust.soict.ite6.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getter và Setter cho id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter và Setter cho title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và Setter cho category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter và Setter cho cost
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    // Ghi đè phương thức equals() của lớp Object
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra xem hai đối tượng có cùng tham chiếu không
        if (this == obj) return true;
        
        // Kiểm tra đối tượng có phải là null hoặc không phải là instance của Media
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Kiểm tra sự bằng nhau của tiêu đề (title)
        Media media = (Media) obj;
        return title.equals(media.title);
    }
}
