package ss3_array.bai_tap;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {8, 9, 10};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
