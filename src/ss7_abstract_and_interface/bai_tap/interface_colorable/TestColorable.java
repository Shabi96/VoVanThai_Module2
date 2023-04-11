package ss7_abstract_and_interface.bai_tap.interface_colorable;

import java.util.Arrays;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
        System.out.println(Arrays.toString(shapes));
    }
}
