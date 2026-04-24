public class Quantity {

    private double value;
    private LengthUnit unit;

    public Quantity(double value, LengthUnit unit) {
        if (unit == null || !Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.value = value;
        this.unit = unit;
    }

    // Convert to target unit
    public double convertTo(LengthUnit targetUnit) {
        double base = unit.toBase(value);
        return targetUnit.fromBase(base);
    }

    // Equality
    public boolean equals(Quantity other) {
        double thisBase = this.unit.toBase(this.value);
        double otherBase = other.unit.toBase(other.value);
        return Double.compare(thisBase, otherBase) == 0;
    }

    // UC6: Add (result in first unit)
    public Quantity add(Quantity other) {
        double sumBase = this.unit.toBase(this.value) +
                other.unit.toBase(other.value);

        double result = this.unit.fromBase(sumBase);
        return new Quantity(result, this.unit);
    }

    // UC7: Add with target unit
    public Quantity add(Quantity other, LengthUnit targetUnit) {
        double sumBase = this.unit.toBase(this.value) +
                other.unit.toBase(other.value);

        double result = targetUnit.fromBase(sumBase);
        return new Quantity(result, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}