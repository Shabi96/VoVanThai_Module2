package ss5_inheritance.bai_tap.point2d_and_point3d;

public class Test2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        Point2D point2D1 = new Point2D(3, 4);
        System.out.println(point2D1.toString());
        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());
        Point3D point3D1 = new Point3D(4, 5, 6);
        System.out.println(point3D1.toString());
    }
}
