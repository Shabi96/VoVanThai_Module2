package ss15_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException(String s) {
        super(s);
    }

    static void inputEdge(double a, double b, double c) throws IllegalTriangleException {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("Bạn nhập chưa đúng điều kiện 3 cạnh của tam giác!");
        } else if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác không được nhỏ hơn không!");
        } else {
            System.out.println("OKKK!!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập vào cạnh thứ nhất");
            double inputEdge1 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập vào cạnh thứ hai");
            double inputEdge2 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập vào cạnh thứ ba");
            double inputEdge3 = Double.parseDouble(sc.nextLine());
            inputEdge(inputEdge1, inputEdge2, inputEdge3);
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalTriangleException e) {
            e.printStackTrace();
            System.out.println("Nhập sai rồi!");
        }
    }
}
