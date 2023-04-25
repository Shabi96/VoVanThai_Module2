package ss19_string_and_regex.bai_tap.validate_phone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static boolean validatePhone(String num) {
        String PATTERN = "^84-0\\d{9}$";
        return Pattern.matches(PATTERN, num);
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số điện thoại kiểm tra(Bắt đầu bằng '84-' nhoaaa): ");
            String phoneNumber = sc.nextLine();
            if (validatePhone(phoneNumber)) {
                flag = false;
                System.out.println(validatePhone(phoneNumber));
            }
        } while (flag);
    }
}
