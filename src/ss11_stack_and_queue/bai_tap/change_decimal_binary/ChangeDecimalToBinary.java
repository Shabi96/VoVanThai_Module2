package ss11_stack_and_queue.bai_tap.change_decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number need to change: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        while (inputNumber != 0) {
            int result = inputNumber % 2;
            stack.push(result);
            inputNumber /= 2;
        }
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}
