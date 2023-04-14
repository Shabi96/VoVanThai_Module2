package ss11_stack_and_queue.bai_tap.check_bracket;

import java.util.*;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String[] arrayChar = str.split("");
        boolean flag = false;
        int left = 0;
        String right = ")";
        for (String s : arrayChar) {
            if (Objects.equals(s, "(")) {
                bStack.push(s);
            } else if (Objects.equals(s, right)) {
                if (bStack.isEmpty()) {
                    flag = true;
                    break;
                } else {
                    left++;
                }
            }
            if (bStack.size() < left) {
                break;
            }
        }
        if (flag) {
            System.out.println(true);
        } else if (bStack.size() == left) {
            System.out.println("Well");
        } else {
            System.out.println(false);
        }
    }
}
