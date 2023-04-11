package ss7_abstract_and_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Before increase percent " + circle);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percent: ");
        double percent = Double.parseDouble(sc.nextLine());
        circle.resize(percent);
        System.out.println("After increasing " + circle);
    }
}
