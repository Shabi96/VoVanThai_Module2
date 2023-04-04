package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi(triệu đồng): ");
        double money = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào số tháng gửi: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào phần trăm lãi: ");
        double interest = Float.parseFloat(sc.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * month * (interest / 100) / 12;
        }
        System.out.println("Số tiền lãi là: " + totalInterest);
    }
}
