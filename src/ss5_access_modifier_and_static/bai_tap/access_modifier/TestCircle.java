package ss5_access_modifier_and_static.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        Circle cir1 = new Circle(radius);
        System.out.println(cir1.toString());
    }
}
