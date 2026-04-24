import java.util.Scanner;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();

            System.out.print("Enter source unit (FEET/INCH/YARD/CM): ");
            Unit source = Unit.valueOf(scanner.next().toUpperCase());

            System.out.print("Enter target unit (FEET/INCH/YARD/CM): ");
            Unit target = Unit.valueOf(scanner.next().toUpperCase());

            Quantity q = new Quantity(value, source);

            double result = q.convertTo(target);

            System.out.println("Converted Value: " + result + " " + target);

        } catch (Exception e) {
            System.out.println("Invalid input! Check value and units.");
        } finally {
            scanner.close();
        }
    }
}