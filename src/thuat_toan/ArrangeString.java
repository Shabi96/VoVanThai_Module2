package thuat_toan;

import java.util.Scanner;

public class ArrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = chars.length - 1; j > i; j--) {
                if (chars[j] < chars[j - 1]) {
                    char s = chars[j];
                    chars[j] = chars[j - 1];
                    chars[j - 1] = s;
                }
            }
        }
        String str1 = new String(chars);
        System.out.println(str1);
    }
}
