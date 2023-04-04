package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng: ");
        int longArray = Integer.parseInt(sc.nextLine());
        int[][] array = new int[longArray][];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào số lượng phần tử của hàng: " + (i + 1));
            int input = Integer.parseInt(sc.nextLine());
            array[i] = new int[input];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ: " + (j + 1) + " của hàng " + (i + 1));
                int number = Integer.parseInt(sc.nextLine());
                array[i][j] = number;

            }
        }
        System.out.println("Mảng sau khi nhập là: " + Arrays.deepToString(array));
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Mảng có giá trị lớn nhất là: "+ max);
    }
}
