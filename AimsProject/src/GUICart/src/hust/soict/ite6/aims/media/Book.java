package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Thuộc tính đặc thù cho Book
    private List<String> authors = new ArrayList<>();

    // Constructor không tham số, kế thừa từ lớp Media
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    // Getter cho authors
    public List<String> getAuthors() {
        return authors;
    }

    // Phương thức thêm tác giả vào danh sách (kiểm tra tác giả đã có chưa)
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    // Phương thức xóa tác giả khỏi danh sách (kiểm tra tác giả có trong danh sách không)
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    // Phương thức toString để in thông tin của sách
    @Override
    public String toString() {
        // Sử dụng danh sách tác giả và nối chúng thành chuỗi
        String authorList = String.join(", ", authors);  // Nối các tác giả thành chuỗi
        return "Book [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() + ", Authors=" + authorList + "]";
    }
}
