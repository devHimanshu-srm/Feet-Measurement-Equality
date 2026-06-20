public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1, LengthUnit.FEET);
        Quantity q2 = new Quantity(12, LengthUnit.INCH);

        // UC5 Conversion
        System.out.println("Convert 1 FEET to INCH: " + q1.convertTo(LengthUnit.INCH));

        // UC6 Addition (default unit)
        System.out.println("Addition (default unit): " + q1.add(q2));

        // UC7 Addition (target unit)
        System.out.println("Addition (YARD): " + q1.add(q2, LengthUnit.YARD));

        // Equality
        System.out.println("Are equal? " + q1.equals(q2));
    }
}