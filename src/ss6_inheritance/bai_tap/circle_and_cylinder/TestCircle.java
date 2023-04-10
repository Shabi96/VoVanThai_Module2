package ss5_inheritance.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle cc = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the color: ");
        String color = sc.nextLine();
        Circle cc1 = new Circle(radius, color);
        System.out.println(cc.toString());
        System.out.println(cc1.toString());
    }
}
