package thuat_toan;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        String[] arr = str.split("");
        System.out.println("Nhập vào 1 kí tự bất kì: ");
        String c = sc.nextLine();
        int count = 0;
        for (String s : arr) {
            if (c.equals(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
