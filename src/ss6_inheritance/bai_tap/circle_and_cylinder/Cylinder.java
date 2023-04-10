package ss5_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
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
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + ", volume=" + getVolume() +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' + ", area =" + getArea() + ", perimeter=" + getPerimeter() +
                '}';
    }
}
