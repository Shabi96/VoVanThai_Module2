package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD:");
        double vnd = 23000;
        double usd = sc.nextDouble();
        System.out.println("Số tiền quy đổi sang VNĐ là: " + (usd * vnd));
    }
}
