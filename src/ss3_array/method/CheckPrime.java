package ss3_array.method;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int number) {
        if( number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        System.out.println(isPrime(inputNumber));
    }
}
