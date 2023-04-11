package ss7_abstract_and_interface.bai_tap.interface_colorable;


public class Square extends Shape implements IColorable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{ area=" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Square: " + getColor() + " all four sides...");
    }
}