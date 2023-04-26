package case_study.controllers;

import case_study.service.employee_service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    public void employeeMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----EMPLOYEE MANAGEMENT---- \n" +
                    "1. Display list employees \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Return main menu \n" +
                    "Mời bạn chọn: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice <= 0 || choice > 4) {
                    throw new Exception("Chỉ được nhập từ 1 tới 4!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (choice) {
                case 1:
                    employeeService.displayEmployeeList();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai rồi!!");
                    break;
            }
        }while (flag);
    }
}
