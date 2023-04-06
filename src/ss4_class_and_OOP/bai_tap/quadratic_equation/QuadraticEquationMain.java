package ss4_class_and_oop.bai_tap.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double inputA = Float.parseFloat(sc.nextLine());
        System.out.println("Enter b: ");
        double inputB = Float.parseFloat(sc.nextLine());
        System.out.println("Enter c: ");
        double inputC = Float.parseFloat(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(inputA, inputB, inputC);
        if(quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("The equation have 2 roots is: ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else if(quadraticEquation.getDiscriminant() < 0) {
            double x = 0;
            System.out.println("The equation has root is x: " + x);
        } else {
            System.out.println("The equation has nos roots!");
        }
    }
}
