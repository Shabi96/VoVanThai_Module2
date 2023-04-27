package case_study.utils.employee_write_and_read;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validate {
    private static final String REGEX_EMPLOYEE_CODE = "^(NV-)\\d{4}$";
    private static final String REGEX_NAME = "^([A-Z]{1}[a-z]{1,}\\s)*([A-Z]{1}[a-z]{1,})$";
    private static final String REGEX_ID = "^(\\d{9}|\\d{12})$";
    private static final String REGEX_PHONE = "^0\\d{9}$";
    private static final String REGEX_DAY_OF_BIRTH = "^(\\d{4}-(01|0[3-9]{1}|10|11|12)-(1\\d{1}|2\\d{1}|30|31)|(\\d{4}-(02)-1\\d{1}|2\\d{1}))$";
    private static final String REGEX_CUSTOMER_CODE = "^(KH-)\\d{4}$";


    public static boolean validateName(String name) {
        return Pattern.matches(REGEX_NAME, name);
    }

    public static boolean validateId(String id) {
        return Pattern.matches(REGEX_ID, id);
    }

    public static boolean validateEmployeeCode(String employeeCode) {
        return Pattern.matches(REGEX_EMPLOYEE_CODE, employeeCode);
    }

    public static boolean validateCustomerCode(String customerCode) {
        return Pattern.matches(REGEX_CUSTOMER_CODE, customerCode);
    }

    public static boolean validatePhone(String phone) {
        return Pattern.matches(REGEX_PHONE, phone);
    }

    public static boolean validateDayOfBirth(String dayOfBirth) {
        return Pattern.matches(REGEX_DAY_OF_BIRTH, dayOfBirth);
    }

    public static int calAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if (dob != null) {
            return Period.between(dob, curDate).getYears();
        }
        return 0;
    }
}
