//bai 2.2.5
import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        // Nhập số thứ nhất từ dialog
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        // Nhập số thứ hai từ dialog
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        // Chuyển đổi từ chuỗi sang số double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Tính toán tổng, hiệu, tích
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Hiển thị kết quả tổng, hiệu, tích
        String result = "Sum: " + sum + "\n" +
                        "Difference: " + difference + "\n" +
                        "Product: " + product + "\n";

        // Kiểm tra xem số chia có phải 0 không
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Quotient: " + quotient;
        } else {
            result += "Cannot divide by zero.";
        }

        // Hiển thị kết quả cuối cùng trong một dialog box
        JOptionPane.showMessageDialog(null, result);

        // Thoát chương trình
        System.exit(0);
    }
}
