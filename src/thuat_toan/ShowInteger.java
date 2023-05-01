package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class ShowInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % 3 == 0 && i % 5 == 0 && i % 2 != 0) {
                    list.add(i);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
