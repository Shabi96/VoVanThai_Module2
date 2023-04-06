package ss4_class_and_oop.bai_tap.quadratic_equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }
    public double getRoot2() {
        return (-getB() - Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }

}
