package ss13_thuat_toan_tim_kiem.bai_tap.find_string_length_max;

import java.util.ArrayList;
import java.util.Scanner;

public class StringLengthMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        ArrayList<Character> arrayListMax = new ArrayList<>();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (arrayList.size() >= 1 && str.charAt(i) <= arrayList.get(arrayList.size() - 1)) {
                arrayList.clear();
            }
            arrayList.add(str.charAt(i));
            if (arrayList.size() > arrayListMax.size()) {
                arrayListMax.clear();
                arrayListMax.addAll(arrayList);
            }
        }
        for (Character s : arrayListMax) {
            System.out.print(s);
        }
    }
}
