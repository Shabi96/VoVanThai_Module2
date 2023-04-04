package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        if (number < 2) {
            System.out.println(number + " is not prime");
        }  else {
            for(int i = 2; i < number; i++) {
                if(number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
