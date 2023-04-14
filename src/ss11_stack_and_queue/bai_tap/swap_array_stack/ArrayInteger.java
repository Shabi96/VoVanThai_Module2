package ss11_stack_and_queue.bai_tap.swap_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class ArrayInteger {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int size = 5;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            int inputNumber = Integer.parseInt(scanner.nextLine());
            stack.push(inputNumber);
        }
        System.out.println("Mảng sau khi nhập là: " + stack);
        Stack<Integer> stack1 = new Stack<>();
        int s;
        for (int i = 0; i < size; i++) {
            s = stack.pop();
            stack1.push(s);
        }
        System.out.println("Mảng sau khi đảo ngược là: " + stack1);
    }
}
