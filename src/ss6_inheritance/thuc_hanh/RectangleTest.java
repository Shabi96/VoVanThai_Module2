package ss5_inheritance.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println(rc);
        rc = new Rectangle(5 , 10);
        System.out.println(rc);
        rc = new Rectangle("yellow", true, 10, 20);
        System.out.println(rc);
        System.out.println(rc.getPerimeter());
    }
}
