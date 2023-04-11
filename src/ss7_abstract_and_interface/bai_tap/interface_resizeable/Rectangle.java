package ss7_abstract_and_interface.bai_tap.interface_resizeable;


public class Rectangle extends Shape implements IResizeable {
    private double width = 1;
    public double length = 1;

    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{ area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + (getWidth() * percent / 100));
        setLength(getLength() + (getLength() * percent / 100));
    }
}
