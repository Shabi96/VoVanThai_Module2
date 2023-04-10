package ss5_inheritance.bai_tap.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(10);
        System.out.println(cl.toString());
        Cylinder cl1 = new Cylinder(4, "yellow", 7);
        System.out.println(cl1.toString());
    }
}
