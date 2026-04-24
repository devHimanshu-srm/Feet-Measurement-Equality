public class QuantityMeasurementApp {

    public static void main(String[] args) {

        // Example: 1 foot + 12 inches = 2 feet
        Quantity q1 = new Quantity(1, Unit.FEET);
        Quantity q2 = new Quantity(12, Unit.INCH);

        Quantity result = q1.add(q2);

        System.out.println("Result: " + result);
    }
}