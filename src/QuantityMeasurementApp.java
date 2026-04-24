import java.util.Scanner;

public class QuantityMeasurementApp {

    // Method to compare two values in feet
    public static boolean compareFeet(double value1, double value2) {
        return Double.compare(value1, value2) == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first value in feet: ");
            double feet1 = scanner.nextDouble();

            System.out.print("Enter second value in feet: ");
            double feet2 = scanner.nextDouble();

            if (compareFeet(feet1, feet2)) {
                System.out.println("Values are equal.");
            } else {
                System.out.println("Values are NOT equal.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}