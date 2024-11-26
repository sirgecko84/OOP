package hust.soict.ite6.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            String filename = "hust/soict/ite6/garbage/test.txt"; // Đường dẫn file của bạn
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            // Test 1: Dùng toán tử + để tạo "rác"
            long startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Using + operator: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
