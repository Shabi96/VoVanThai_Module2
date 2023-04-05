package ss4_class_and_OOP.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return this.a;
    }

    private double getB() {
        return this.b;
    }

    private double getC() {
        return this.c;
    }

    private double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    private double getRoot1() {
        return (-getB() + Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }
    private double getRoot2() {
        return (-getB() - Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }

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
            System.out.println("The equation has roots is x: " + x);
        } else {
            System.out.println("The equation has nos roots!");
        }
    }
}
