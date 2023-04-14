package ss11_stack_and_queue.bai_tap.swap_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        String[] mWord = str.split(" ");
        System.out.println(Arrays.toString(mWord));
        for (int i = mWord.length - 1; i >= 0; i--) {
            wStack.push(mWord[i]);
        }
        System.out.println(String.join(" ", wStack) + " " + String.join(" ", mWord));
    }
}
