//bai 6.3
import javax.swing.JOptionPane;

public class Triangle {
    public static void main (String[] args) {
        // Nhap chieu cao cua tam giac
        String input = JOptionPane.showInputDialog("Chieu cao cua tam giac: ");
        int n = Integer.parseInt(input); 
        
        //Tao tam giac
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }

        //Hien thi tam giac
        JOptionPane.showMessageDialog(null, triangle.toString());

        System.exit(0);
    }
}