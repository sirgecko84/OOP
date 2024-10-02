//bài 6.4
import java.util.Scanner;

public class DisplayNumberOfDay {
    
    // Kiểm tra xem 1 năm có phải năm nhuận không?
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Đếm số ngày 1 tháng
    public static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1":
                return 31;
            case "february": case "feb.": case "feb": case "2":
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case "march": case "mar.": case "mar": case "3":
                return 31;
            case "april": case "apr.": case "apr": case "4":
                return 30;
            case "may": case "5":
                return 31;
            case "june": case "jun.": case "jun": case "6":
                return 30;
            case "july": case "jul.": case "jul": case "7":
                return 31;
            case "august": case "aug.": case "aug": case "8":
                return 31;
            case "september": case "sep.": case "sep": case "9":
                return 30;
            case "october": case "oct.": case "oct": case "10":
                return 31;
            case "november": case "nov.": case "nov": case "11":
                return 30;
            case "december": case "dec.": case "dec": case "12":
                return 31;
            default:
                return -1; // đầu vào không hợp lệ
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;
        int days;

        while (true) {
            System.out.print("Enter the month (name or number): ");
            month = scanner.nextLine();

            System.out.print("Enter the year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid year.");
                scanner.next();  // Discard invalid input
            }
            year = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            if (year < 0) {
                System.out.println("Year must be a non-negative number.");
                continue;
            }

            days = getDaysInMonth(month, year);
            if (days == -1) {
                System.out.println("Invalid month! Please try again.");
            } else {
                System.out.println("The number of days in " + month + " " + year + " is: " + days);
                break;
            }
        }
        scanner.close();
    }
}
