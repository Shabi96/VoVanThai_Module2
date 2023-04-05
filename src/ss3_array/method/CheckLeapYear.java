package ss3_array.method;

import java.util.Scanner;

public class CheckLeapYear {
    public static boolean isLeapYear(int number) {
        if (number % 400 == 0 || number % 100 != 0 && number % 4 == 0 ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int inputYear = Integer.parseInt(sc.nextLine());
        System.out.println(isLeapYear(inputYear));
    }
}
