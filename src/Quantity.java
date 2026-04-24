public class Quantity {

    private double value;
    private Unit unit;

    // Conversion factors (to base unit: FEET)
    private static final double INCH_TO_FEET = 1.0 / 12.0;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert everything to FEET (base unit)
    private double toBaseUnit() {
        if (unit == Unit.FEET) {
            return value;
        } else if (unit == Unit.INCH) {
            return value * INCH_TO_FEET;
        }
        throw new IllegalArgumentException("Unsupported unit");
    }

    // Equality check after conversion
    public boolean equals(Quantity other) {
        return Double.compare(this.toBaseUnit(), other.toBaseUnit()) == 0;
    }
}