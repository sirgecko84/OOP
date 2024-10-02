//bai 6.5
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    // Function to sort the array
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    // Function to calculate the sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Function to calculate the average of array elements
    public static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to either use a constant array or enter their own
        System.out.println("Would you like to enter the array manually? (yes/no): ");
        String choice = scanner.nextLine();

        int[] array;
        if (choice.equalsIgnoreCase("yes")) {
            // Get array input from user
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
            // Use a constant array
            array = new int[] {5, 1, 9, 3, 7, 6};
            System.out.println("Using constant array: " + Arrays.toString(array));
        }

        // Sort the array
        sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Calculate the sum of the array
        int sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);

        // Calculate the average of the array
        double average = calculateAverage(array);
        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}
