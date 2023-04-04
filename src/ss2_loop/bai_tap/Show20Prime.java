package ss2_loop.bai_tap;

import java.util.Scanner;

public class Show20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố cần in ra: ");
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        int i;
        for (i = 2; count < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                count++;
            }
        }
    }
}
