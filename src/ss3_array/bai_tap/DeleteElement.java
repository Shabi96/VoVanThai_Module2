package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arrayInteger = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử cần xóa: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arrayInteger.length; i++) {
            if (number == arrayInteger[i]) {
                int j = i;
                while ( j < arrayInteger.length - 1) {
                    arrayInteger[j] = arrayInteger[j + 1];
                    j++;
                }
                i--;
                arrayInteger[arrayInteger.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayInteger));
    }
}
