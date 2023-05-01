package thuat_toan;

import java.util.Scanner;

public class SwapInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số ");
        int number = Integer.parseInt(sc.nextLine());
        int swapNumber = 0;
        while (number > 0) {
            int change = number % 10;
            swapNumber = swapNumber * 10 + change;
            number /= 10;
        }
        System.out.println(swapNumber);
    }
}
