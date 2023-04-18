package ss13_thuat_toan_tim_kiem.bai_tap.find_string_ascending_max;

import java.util.ArrayList;
import java.util.Scanner;

public class StringLengthMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        ArrayList<Character> max = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Character> characters = new ArrayList<>();
            characters.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > characters.get(characters.size() - 1)) {
                    characters.add(str.charAt(j));
                }
            }
            if (characters.size() > max.size()) {
                max.clear();
                max.addAll(characters);
            }
            characters.clear();
        }
        for (Character s : max) {
            System.out.println(s);
        }
    }
}
