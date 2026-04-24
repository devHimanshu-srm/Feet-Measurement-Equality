public class Quantity {

    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to another unit
    public double convertTo(Unit targetUnit) {
        if (unit == null || targetUnit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
        }

        // Step 1: convert to base (feet)
        double valueInFeet = unit.toFeet(value);

        // Step 2: convert to target
        return targetUnit.fromFeet(valueInFeet);
    }

    // Equality (same as before)
    public boolean equals(Quantity other) {
        return Double.compare(this.convertTo(Unit.FEET),
                other.convertTo(Unit.FEET)) == 0;
    }
}