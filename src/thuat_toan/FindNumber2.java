package thuat_toan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng số nguyên: ");
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào số thứ " + (i + 1));
            list.add(i, Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Mảng sau khi nhập là: " + list);
        list.sort(Integer::compareTo);
        System.out.println("Số lớn thứ 2 trong mảng là: " + list.get(size - 2));
    }
}
