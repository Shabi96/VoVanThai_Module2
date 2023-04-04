package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrays1 = new int[arrays.length + 1];
        for (int i = 0; i < arrays.length; i++) {
            arrays1[i] = arrays[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the insert number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the index of insert number");
        int index = Integer.parseInt(sc.nextLine());
        if (index <= -1 || index >= arrays.length - 1) {
            System.out.println("Element cannot be inserted");
        } else {
            for (int i = arrays1.length - 1; i > index; i--) {
                arrays1[i] = arrays1[i - 1];
            }
            arrays1[index] = number;
        }
        System.out.println(Arrays.toString(arrays1));
    }
}
