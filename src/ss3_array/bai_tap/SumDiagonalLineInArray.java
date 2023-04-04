package ss3_array.bai_tap;

import java.util.Scanner;

public class SumDiagonalLineInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        int[][] array = new int[row][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử " + (j + 1) + " của hàng: " + (i + 1));
                int inputNumber = Integer.parseInt(sc.nextLine());
                array[i][j] = inputNumber;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j || i + j == array.length - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của các số ở đường chéo của ma trận vuông là: " + sum);
    }
}
