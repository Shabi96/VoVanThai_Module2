package ss5_inheritance.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq);
        sq = new Square(5);
        System.out.println(sq);
        sq = new Square(3,"black", false);
        System.out.println(sq);
        System.out.println(sq.getArea());
    }
}
