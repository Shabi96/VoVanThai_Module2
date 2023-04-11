package ss7_abstract_and_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Before increase percent: " + square);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percent: ");
        double percent = Double.parseDouble(sc.nextLine());
        square.resize(percent);
        System.out.println("After increasing percent: " + square);
    }
}
