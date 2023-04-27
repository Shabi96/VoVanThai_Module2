package case_study.service.employee_service;

import case_study.model.employee.Employee;
import case_study.repository.employee_repository.EmployeeRepository;
import case_study.utils.employee_write_and_read.Validate;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayEmployeeList() {
        List<Employee> employees = employeeRepository.getEmployeeList();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        String code;
        do {
            System.out.println("Nhập mã nhân viên: ");
            code = sc.nextLine();
            if (Validate.validateEmployeeCode(code)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.out.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validateEmployeeCode(code));

        String name;
        do {
            System.out.println("Nhập tên: ");
            name = sc.nextLine();
            if (Validate.validateName(name)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.out.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validateName(name));
        String day;
        boolean checkAge = true;
        do {
            System.out.println("Nhập ngày sinh(YYYY-MM-DD): ");
            day = sc.nextLine();
            LocalDate dob = LocalDate.parse(day);
            if (Validate.validateDayOfBirth(day) && Validate.calAge(dob) >= 18) {
                System.out.println("Thêm thành công!!!");
                checkAge = false;
            } else {
                System.err.println("Nhập chưa đúng định dạng hoặc chưa đủ 18 tuổi!!!");
            }
        } while (checkAge);
        boolean flag3 = true;
        String gender = "";
        do {
            System.out.println("Chọn giới tính: \n" +
                    "1. Nam\n" +
                    "2. Nữ\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                gender = "Nam";
                flag3 = false;
            } else if (choice.equals("2")) {
                gender = "Nữ";
                flag3 = false;
            } else {
                System.err.println("Bạn chọn sai rồi!!!");
            }
        } while (flag3);

        String id;
        do {
            System.out.println("Nhập ID: ");
            id = sc.nextLine();
            if (Validate.validateId(id)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validateId(id));
        String phone;
        do {
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
            if (Validate.validatePhone(phone)) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Nhập chưa đúng định dạng!");
            }
        } while (!Validate.validatePhone(phone));
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        String level = "";
        boolean flag = true;
        do {
            System.out.print("Chọn level: \n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau đại học\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    level = "Trung cấp";
                    flag = false;
                    break;
                case "2":
                    level = "Cao đẳng";
                    flag = false;
                    break;
                case "3":
                    level = "Đại học";
                    flag = false;
                    break;
                case "4":
                    level = "Sau đại học";
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai rồi");
                    break;
            }
        } while (flag);
        boolean flag1 = true;
        String position = null;
        do {
            System.out.print("Chọn position: \n" +
                    "1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    position = "Lễ tân";
                    flag1 = false;
                    break;
                case "2":
                    position = "Phục vụ";
                    flag1 = false;
                    break;
                case "3":
                    position = "Chuyên viên";
                    flag1 = false;
                    break;
                case "4":
                    position = "Giám sát";
                    flag1 = false;
                    break;
                case "5":
                    position = "Quản lý";
                    flag1 = false;
                    break;
                case "6":
                    position = "Giám đốc";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Bạn chưa chọn đúng!!");
                    break;
            }
        } while (flag1);

        double wage;
        boolean flag4 = true;
        do {
            System.out.println("Nhập lương: ");
            wage = Double.parseDouble(sc.nextLine());
            if (wage > 0) {
                flag4 = false;
            } else {
                System.out.println("Lương phải lớn hơn 0");
            }
        } while (flag4);
        Employee employee = new Employee(code, name, day, gender, id, phone, email, level, position, wage);
        employeeRepository.addNewEmployee(employee);
        System.out.println("Thêm thành công!!!!");
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập vào mã Employee muốn sửa: ");
        String codeEdit = sc.nextLine();
        int isEdit = employeeRepository.checkById(codeEdit);
        if (isEdit >= 0) {
            boolean checkEdit = true;
            do {
                System.out.print("Bạn muốn sửa gì???\n" +
                        "1. Mã khách hàng\n" +
                        "2. Tên\n" +
                        "3. Ngày sinh\n" +
                        "4. Giới tính\n" +
                        "5. ID\n" +
                        "6. Số điện thoại\n" +
                        "7. Email\n" +
                        "8. Trình độ\n" +
                        "9. Vị trí\n" +
                        "10. Lương\n" +
                        "0. Thoát\n" +
                        "Mời chọn: ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        String code;
                        do {
                            System.out.println("Nhập mã nhân viên mới: ");
                            code = sc.nextLine();
                            if (Validate.validateEmployeeCode(code)) {
                                System.out.println("Sửa thành công!!!");
                                employeeRepository.getEmployeeList().get(isEdit).setCode(code);
                            } else {
                                System.err.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateEmployeeCode(code));
                        break;
                    case "2":
                        String name;
                        do {
                            System.out.println("Nhập tên mới: ");
                            name = sc.nextLine();
                            if (Validate.validateName(name)) {
                                employeeRepository.getEmployeeList().get(isEdit).setName(name);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.err.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateName(name));

                        break;
                    case "3":
                        String day;
                        boolean checkAge = true;
                        do {
                            System.out.println("Nhập ngày sinh mới(YYYY-MM-DD): ");
                            day = sc.nextLine();
                            LocalDate dob = LocalDate.parse(day);
                            if (Validate.validateDayOfBirth(day) && Validate.calAge(dob) >= 18) {
                                employeeRepository.getEmployeeList().get(isEdit).setDayOfBirth(day);
                                System.out.println("Sửa thành công!!!");
                                checkAge = false;
                            } else {
                                System.err.println("Nhập chưa đúng định dạng hoặc bạn chưa đủ 18 tuổi!!!");
                            }
                        } while (checkAge);

                        break;
                    case "4":
                        boolean flag3 = true;
                        String gender = "";
                        do {
                            System.out.println("Chọn giới tính: \n" +
                                    "1. Nam\n" +
                                    "2. Nữ\n" +
                                    "Mời chọn: ");
                            String choice1 = sc.nextLine();
                            if (choice1.equals("1")) {
                                gender = "Nam";
                                employeeRepository.getEmployeeList().get(isEdit).setGender(gender);
                                flag3 = false;
                            } else if (choice1.equals("2")) {
                                gender = "Nữ";
                                employeeRepository.getEmployeeList().get(isEdit).setGender(gender);
                                flag3 = false;
                            } else {
                                System.out.println("Bạn chọn sai rồi!!!");
                            }
                        } while (flag3);
                        break;
                    case "5":
                        String id;
                        do {
                            System.out.println("Nhập ID mới: ");
                            id = sc.nextLine();
                            if (Validate.validateId(id)) {
                                employeeRepository.getEmployeeList().get(isEdit).setId(id);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.out.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validateId(id));
                        break;
                    case "6":
                        String phone;
                        do {
                            System.out.println("Nhập số điện thoại: ");
                            phone = sc.nextLine();
                            if (Validate.validatePhone(phone)) {
                                employeeRepository.getEmployeeList().get(isEdit).setPhone(phone);
                                System.out.println("Sửa thành công!!!");
                            } else {
                                System.out.println("Nhập chưa đúng định dạng!");
                            }
                        } while (!Validate.validatePhone(phone));
                        break;
                    case "7":
                        System.out.println("Nhập email mới: ");
                        String email = sc.nextLine();
                        employeeRepository.getEmployeeList().get(isEdit).setEmail(email);
                        break;
                    case "8":
                        String level = "";
                        boolean flag = true;
                        do {
                            System.out.print("Chọn level: \n" +
                                    "1. Trung cấp\n" +
                                    "2. Cao đẳng\n" +
                                    "3. Đại học\n" +
                                    "4. Sau đại học\n" +
                                    "Mời chọn: ");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    level = "Trung cấp";
                                    employeeRepository.getEmployeeList().get(isEdit).setLevel(level);
                                    flag = false;
                                    break;
                                case "2":
                                    level = "Cao đẳng";
                                    employeeRepository.getEmployeeList().get(isEdit).setLevel(level);

                                    flag = false;
                                    break;
                                case "3":
                                    level = "Đại học";
                                    employeeRepository.getEmployeeList().get(isEdit).setLevel(level);
                                    flag = false;
                                    break;
                                case "4":
                                    level = "Sau đại học";
                                    employeeRepository.getEmployeeList().get(isEdit).setLevel(level);
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("Bạn chọn sai rồi");
                                    employeeRepository.getEmployeeList().get(isEdit).setLevel(level);
                                    break;
                            }
                        } while (flag);
                        break;
                    case "9":
                        boolean flag1 = true;
                        String position;
                        do {
                            System.out.print("Chọn position: \n" +
                                    "1. Lễ tân\n" +
                                    "2. Phục vụ\n" +
                                    "3. Chuyên viên\n" +
                                    "4. Giám sát\n" +
                                    "5. Quản lý\n" +
                                    "6. Giám đốc\n" +
                                    "Mời chọn: ");
                            String choice1 = sc.nextLine();
                            switch (choice1) {
                                case "1":
                                    position = "Lễ tân";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                case "2":
                                    position = "Phục vụ";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                case "3":
                                    position = "Chuyên viên";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                case "4":
                                    position = "Giám sát";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                case "5":
                                    position = "Quản lý";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                case "6":
                                    position = "Giám đốc";
                                    employeeRepository.getEmployeeList().get(isEdit).setPosition(position);
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("Bạn chưa chọn đúng!!");
                                    break;
                            }
                        } while (flag1);
                    case "10":
                        double wage;
                        boolean flag4 = true;
                        do {
                            System.out.println("Nhập lương mới: ");
                            wage = Double.parseDouble(sc.nextLine());
                            if (wage > 0) {
                                employeeRepository.getEmployeeList().get(isEdit).setWage(wage);
                                flag4 = false;
                            } else {
                                System.out.println("Lương phải lớn hơn 0");
                            }
                        } while (flag4);
                        break;
                    case "0":
                        checkEdit = false;
                        employeeRepository.editEmployee();
                        System.out.println("Sửa thành công");
                        break;
                    default:
                        System.out.println("Bạn chọn sai rồi!!");
                        break;
                }
            } while (checkEdit);
        } else {
            System.out.println("Không tìm thấy!!!!");
        }
    }
}
