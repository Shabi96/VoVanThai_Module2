package thuat_toan;

import java.util.*;

public class CheckInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if(!s.equals(" ")) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(map.get(s) + s);
        }
    }
}
