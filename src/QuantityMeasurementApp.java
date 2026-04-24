public class QuantityMeasurementApp {

    // Static method for feet comparison
    public static boolean compareFeet(double value1, double value2) {
        Feet f1 = new Feet(value1);
        Feet f2 = new Feet(value2);
        return f1.equals(f2);
    }

    // Static method for inch comparison
    public static boolean compareInch(double value1, double value2) {
        Inch i1 = new Inch(value1);
        Inch i2 = new Inch(value2);
        return i1.equals(i2);
    }

    public static void main(String[] args) {

        // Hardcoded values (as per UC2 requirement)
        double feet1 = 5.0;
        double feet2 = 5.0;

        double inch1 = 12.0;
        double inch2 = 12.0;

        // Feet comparison
        if (compareFeet(feet1, feet2)) {
            System.out.println("Feet values are equal.");
        } else {
            System.out.println("Feet values are NOT equal.");
        }

        // Inch comparison
        if (compareInch(inch1, inch2)) {
            System.out.println("Inch values are equal.");
        } else {
            System.out.println("Inch values are NOT equal.");
        }
    }
}