import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();

        // Convert strings to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Calculate sum, difference, product, and quotient
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Check for division by zero
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            // Print results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        }
    }
}