package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class FibonacciLessThan100 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        int n3;
        list.add(n1);
        list.add(n2);
        for (int i = 0; i < 100; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 > 100) {
                break;
            }
            list.add(n3);
        }
        System.out.println(list);
    }
}
