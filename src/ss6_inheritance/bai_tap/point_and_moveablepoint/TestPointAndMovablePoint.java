package ss5_inheritance.bai_tap.point_and_moveablepoint;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint.toString());
        MovablePoint movablePoint1 = new MovablePoint(5, 6, 7, 8);
        System.out.println(movablePoint1.toString());
        System.out.println(movablePoint1.move());
    }
}
