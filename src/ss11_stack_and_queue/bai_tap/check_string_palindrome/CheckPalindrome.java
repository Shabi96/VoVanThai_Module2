package ss11_stack_and_queue.bai_tap.check_string_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] strings = str.split("");
        System.out.println(Arrays.toString(strings));
        for (String string : strings) {
            stack.push(string.toLowerCase(Locale.ROOT));
            queue.add(string.toLowerCase(Locale.ROOT));
        }

        int size = stack.size();
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(stack.pop(), queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is a Palindrome!");
        } else {
            System.out.println("String is not a Palindrome!");
        }
    }
}
