import java.util.Scanner;

public class MatrixAddition {

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to either enter matrices manually or use constants
        System.out.println("Would you like to enter the matrices manually? (yes/no): ");
        String choice = scanner.nextLine();

        int rows, cols;
        int[][] matrix1, matrix2;

        if (choice.equalsIgnoreCase("yes")) {
            // Get matrix size from user
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];

            // Input for first matrix
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Input for second matrix
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

        } else {
            // Use constant matrices
            matrix1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            matrix2 = new int[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            rows = matrix1.length;
            cols = matrix1[0].length;

            System.out.println("Using constant matrices:");
        }

        // Display the input matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Add the two matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("Resultant Matrix (Matrix 1 + Matrix 2):");
        displayMatrix(resultMatrix);

        scanner.close();
    }
}
