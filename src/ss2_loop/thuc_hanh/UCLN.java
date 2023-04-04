package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number 2: ");
        int number2 = Integer.parseInt(sc.nextLine());
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("Không có ước chung lớn nhất!");
        }
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        System.out.println("Ước chung lớn nhất là: " + number1);
    }
}
