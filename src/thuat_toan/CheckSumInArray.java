package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class CheckSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 15;
        List<Integer> list = new ArrayList<>();
        for (int k : arr) {
            list.add(k);
        }
        for (int i = 0; i < list.size(); i++) {
            int index = list.indexOf(num - list.get(i));
            if (index != -1) {
                System.out.println(i + " và " + index + " là vị trí 2 số trong mảng ("
                        + list.get(i) + "," + list.get(index) + ") có tổng bằng " + num);
                list.remove(index);
            }
        }
    }
}
