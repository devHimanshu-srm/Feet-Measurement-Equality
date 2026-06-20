public enum LengthUnit {

    FEET(1.0),
    INCH(1.0 / 12.0),
    YARD(3.0),
    CM(0.0328084);

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    // Convert this unit → base unit (FEET)
    public double toBase(double value) {
        return value * toFeetFactor;
    }

    // Convert base unit (FEET) → this unit
    public double fromBase(double baseValue) {
        return baseValue / toFeetFactor;
    }
}