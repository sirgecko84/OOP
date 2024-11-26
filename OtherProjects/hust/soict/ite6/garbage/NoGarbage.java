package hust.soict.ite6.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "hust/soict/ite6/garbage/test.txt"; // Đường dẫn file của bạn
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            // Test 2: Dùng StringBuilder
            long startTime = System.currentTimeMillis();
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b);
            }
            String outputString = outputStringBuilder.toString();
            long endTime = System.currentTimeMillis();
            System.out.println("Using StringBuilder: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
