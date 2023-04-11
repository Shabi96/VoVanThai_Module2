package ss7_abstract_and_interface.bai_tap.interface_resizeable;

import java.util.Arrays;

public class TestIResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Shape c = new Circle(10);
        Shape s = new Square(5);
        Shape r = new Rectangle(3, 4);
        shapes[0] = c;
        shapes[1] = s;
        shapes[2] = r;
        System.out.println("Before increase percent: " + Arrays.toString(shapes));
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random() * 100);
        }
        System.out.println("After increasing percent: " + Arrays.toString(shapes));
    }
}
