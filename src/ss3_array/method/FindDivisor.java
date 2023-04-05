package ss3_array.method;

import java.util.Arrays;
import java.util.Scanner;

public class FindDivisor {
    public static int[] divisor(int number) {
        int count = 0;
        int[] array1 = new int[number];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                array1[count] = i;
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = array1[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int checkNumber = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(divisor(checkNumber)));
    }
}
