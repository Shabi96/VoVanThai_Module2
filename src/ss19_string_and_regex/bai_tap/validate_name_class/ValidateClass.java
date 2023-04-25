package ss19_string_and_regex.bai_tap.validate_name_class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    public static boolean validateClass(String num) {
        String PATTERN = "^(C|A|P)\\d{4}(G|H|I|K)$";
        return Pattern.matches(PATTERN, num);
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào tên lớp để kiểm tra: ");
            String className = sc.nextLine();
            if (validateClass(className)) {
                flag = false;
                System.out.println(validateClass(className));
            }
        } while (flag);

    }
}
