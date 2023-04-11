package ss7_abstract_and_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Before increase percent: " + rectangle);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percent: ");
        double percent = Double.parseDouble(sc.nextLine());
        rectangle.resize(percent);
        System.out.println("After increasing: " + rectangle);
    }
}
