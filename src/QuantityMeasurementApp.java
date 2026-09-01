import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Input 1
            System.out.print("Enter value 1: ");
            double value1 = scanner.nextDouble();
            System.out.print("Enter unit 1 (FEET/INCH/YARD/CM): ");
            Unit unit1 = Unit.valueOf(scanner.next().toUpperCase());

            // Input 2
            System.out.print("Enter value 2: ");
            double value2 = scanner.nextDouble();
            System.out.print("Enter unit 2 (FEET/INCH/YARD/CM): ");
            Unit unit2 = Unit.valueOf(scanner.next().toUpperCase());

            Quantity q1 = new Quantity(value1, unit1);
            Quantity q2 = new Quantity(value2, unit2);

            if (q1.equals(q2)) {
                System.out.println("Values are equal.");
            } else {
                System.out.println("Values are NOT equal.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Use FEET, INCH, YARD, or CM.");
        } finally {
            scanner.close();
        }
    }
}