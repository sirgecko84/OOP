import java.util.Scanner;

public class EquationSolver {

    // Function to solve a first-degree equation (linear equation) ax + b = 0
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    // Function to solve a system of first-degree equations with two variables
    public static void solveLinearSystem(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Function to solve a second-degree equation (quadratic equation) ax^2 + bx + c = 0
    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            solveLinearEquation(b, c); // Treat it as a linear equation
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one double root: x = " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose the type of equation to solve:");
            System.out.println("1. First-degree equation (ax + b = 0)");
            System.out.println("2. System of first-degree equations with two variables");
            System.out.println("3. Second-degree equation (ax^2 + bx + c = 0)");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Solve a first-degree equation
                    System.out.print("Enter the coefficient a: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Enter the coefficient b: ");
                    double b1 = scanner.nextDouble();
                    solveLinearEquation(a1, b1);
                    break;

                case 2:
                    // Solve a system of first-degree equations with two variables
                    System.out.println("Enter the coefficients for the system:");
                    System.out.print("a11: ");
                    double a11 = scanner.nextDouble();
                    System.out.print("a12: ");
                    double a12 = scanner.nextDouble();
                    System.out.print("b1: ");
                    double b2_1 = scanner.nextDouble();
                    System.out.print("a21: ");
                    double a21 = scanner.nextDouble();
                    System.out.print("a22: ");
                    double a22 = scanner.nextDouble();
                    System.out.print("b2: ");
                    double b2 = scanner.nextDouble();
                    solveLinearSystem(a11, a12, b2_1, a21, a22, b2);
                    break;

                case 3:
                    // Solve a second-degree equation
                    System.out.print("Enter the coefficient a: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter the coefficient b: ");
                    double b2_quad = scanner.nextDouble();
                    System.out.print("Enter the coefficient c: ");
                    double c = scanner.nextDouble();
                    solveQuadraticEquation(a2, b2_quad, c);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
