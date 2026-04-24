public class Quantity {

    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to another unit (from UC5)
    public double convertTo(Unit targetUnit) {
        if (unit == null || targetUnit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }

        double valueInFeet = unit.toFeet(value);
        return targetUnit.fromFeet(valueInFeet);
    }

    // ✅ UC6: Add two quantities
    public Quantity add(Quantity other) {
        if (other == null || other.unit == null) {
            throw new IllegalArgumentException("Invalid quantity");
        }

        if (!Double.isFinite(this.value) || !Double.isFinite(other.value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }

        // Step 1: convert both to base (feet)
        double thisInFeet = this.unit.toFeet(this.value);
        double otherInFeet = other.unit.toFeet(other.value);

        // Step 2: add
        double sumInFeet = thisInFeet + otherInFeet;

        // Step 3: convert back to unit of first operand
        double resultValue = this.unit.fromFeet(sumInFeet);

        return new Quantity(resultValue, this.unit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}