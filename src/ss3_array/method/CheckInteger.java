package ss3_array.method;

import java.util.Scanner;

public class CheckInteger {
    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(inputNumber));
    }
}
