import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first value: ");
            double value1 = scanner.nextDouble();
            System.out.print("Enter unit (FEET/INCH): ");
            Unit unit1 = Unit.valueOf(scanner.next().toUpperCase());

            System.out.print("Enter second value: ");
            double value2 = scanner.nextDouble();
            System.out.print("Enter unit (FEET/INCH): ");
            Unit unit2 = Unit.valueOf(scanner.next().toUpperCase());

            Quantity q1 = new Quantity(value1, unit1);
            Quantity q2 = new Quantity(value2, unit2);

            if (q1.equals(q2)) {
                System.out.println("Values are equal.");
            } else {
                System.out.println("Values are NOT equal.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please check values and units.");
        } finally {
            scanner.close();
        }
    }
}