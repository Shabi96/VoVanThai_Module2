package ss13_thuat_toan_tim_kiem.bai_tap.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arrayInteger = new int[size];
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            int inputNumber = Integer.parseInt(sc.nextLine());
            arrayInteger[i] = inputNumber;
        }
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println("Nhập số muốn tìm: ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch.binarySearch(arrayInteger, 0, arrayInteger.length - 1, input));
    }
}
