public class Inch {

    private double value;

    public Inch(double value) {
        this.value = value;
    }

    public boolean equals(Inch other) {
        return Double.compare(this.value, other.value) == 0;
    }
}