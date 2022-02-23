package ss6_ke_thua.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                ", height=" + height +
                ", radius" + getRadius() +
                ", volume=" + getVolume() +
                ", color=" + getColor() +
                '}';
    }
}
