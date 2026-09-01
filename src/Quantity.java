public class Quantity {

    private double value;
    private Unit unit;

    // Conversion constants
    private static final double INCH_TO_FEET = 1.0 / 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double CM_TO_INCH = 0.393701;
    private static final double CM_TO_FEET = CM_TO_INCH / 12.0;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert everything to FEET (base unit)
    private double toFeet() {
        switch (unit) {
            case FEET:
                return value;
            case INCH:
                return value * INCH_TO_FEET;
            case YARD:
                return value * YARD_TO_FEET;
            case CM:
                return value * CM_TO_FEET;
            default:
                throw new IllegalArgumentException("Unsupported unit");
        }
    }

    // Equality check
    public boolean equals(Quantity other) {
        return Double.compare(this.toFeet(), other.toFeet()) == 0;
    }
}
