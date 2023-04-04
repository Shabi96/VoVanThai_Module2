package ss3_array.bai_tap;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " +(i + 1));
            int inputNumber = Integer.parseInt(sc.nextLine());
            array[i] = inputNumber;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }
}
