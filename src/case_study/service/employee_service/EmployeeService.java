package case_study.service.employee_service;

import case_study.model.employee.Employee;
import case_study.repository.employee_repository.EmployeeRepository;

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
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String day = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Nhập cmnd: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phone: ");
        int phone = Integer.parseInt(sc.nextLine());
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
        System.out.println("Nhập wage: ");
        double wage = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(id, name, day, gender, cmnd, phone, email, level, position, wage);
        employeeRepository.addNewEmployee(employee);
        System.out.println("Thêm thành công!!!!");
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập vào id Employee muốn sửa: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        int isEdit = employeeRepository.checkById(idEdit);
        if(isEdit > 0) {
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String day = sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gender = sc.nextLine();
            System.out.println("Nhập cmnd: ");
            int cmnd = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập phone: ");
            int phone = Integer.parseInt(sc.nextLine());
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
            System.out.println("Nhập wage: ");
            double wage = Double.parseDouble(sc.nextLine());
            Employee employee = new Employee(id, name, day, gender, cmnd, phone, email, level, position, wage);
            employeeRepository.editEmployee(idEdit, employee);
            System.out.println("Sửa thành công!!!");
        } else {
            System.out.println("Không tìm thấy!!!");
        }
    }
}
