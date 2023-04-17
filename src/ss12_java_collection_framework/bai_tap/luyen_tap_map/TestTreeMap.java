package ss12_java_collection_framework.bai_tap.luyen_tap_map;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        for (String s : array) {
            String word = s.toUpperCase(Locale.ROOT);
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
