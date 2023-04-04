package ss3_array.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        char character = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + character + " trong chuỗi là: " + count);
    }
}
