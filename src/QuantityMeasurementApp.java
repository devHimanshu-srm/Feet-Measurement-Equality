
public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1, Unit.FEET);
        Quantity q2 = new Quantity(12, Unit.INCH);

        // Result in YARDS (custom target)
        Quantity result = q1.add(q2, Unit.YARD);

        System.out.println("Result: " + result);
    }
}