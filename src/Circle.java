public class Circle implements Ploshad {
    double r;

    public int getR() {
        return (int) r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}' + ", ego ploshad "+ ploshad();
    }

    @Override
    public double ploshad() {
        double ploshad= r*r*Math.PI;
        return ploshad;
    }
}
