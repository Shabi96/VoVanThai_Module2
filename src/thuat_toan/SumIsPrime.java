package thuat_toan;

import java.util.ArrayList;
import java.util.Scanner;

public class SumIsPrime {
    public boolean checkIsPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SumIsPrime sumIsPrime = new SumIsPrime();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhập vào số lượng số nguyên tố muốn tính tổng: ");
        int amount = Integer.parseInt(sc.nextLine());
        int count = 0;
        int number = 2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            if (sumIsPrime.checkIsPrime(number)) {
                arrayList.add(number);
                sum += number;
                count++;
            }
            number++;
        } while (count < amount);
        System.out.println(amount + " số nguyên tố là: " + arrayList);
        System.out.println("Tổng các số nguyên tố là : " + sum);
    }
}
