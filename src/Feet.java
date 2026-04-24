public class Feet {

    private double value;

    public Feet(double value) {
        this.value = value;
    }

    public boolean equals(Feet other) {
        return Double.compare(this.value, other.value) == 0;
    }
}