import java.util.Scanner;

/**
 * Java Console Calculator
 * Internship Task 1 - Java Developer Internship
 * 
 * A basic calculator that supports addition, subtraction,
 * multiplication, and division using Java console I/O.
 * Key concepts: OOP, methods, conditionals, loops, Scanner I/O
 */
public class Calculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division (with divide-by-zero handling)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    // Display the main menu
    public static void displayMenu() {
        System.out.println("\n==============================");
        System.out.println("     Java Console Calculator   ");
        System.out.println("==============================");
        System.out.println("1. Addition       (+)");
        System.out.println("2. Subtraction    (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division       (/)");
        System.out.println("5. Exit");
        System.out.println("==============================");
        System.out.print("Choose an option (1-5): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Java Console Calculator!");

        // Loop to allow multiple calculations until user chooses to exit
        while (choice != 5) {
            displayMenu();

            // Validate menu input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); // discard invalid token
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("\nThank you for using the Calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option. Please choose between 1 and 5.");
                continue;
            }

            // Get operands
            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Try again: ");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid number. Try again: ");
                scanner.next();
            }
            double num2 = scanner.nextDouble();

            double result;

            // Perform selected operation using conditionals
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
                default:
                    System.out.println("Unexpected error.");
            }
        }

        scanner.close();
    }
}
