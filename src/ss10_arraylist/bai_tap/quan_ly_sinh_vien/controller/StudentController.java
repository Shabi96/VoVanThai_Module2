package ss10_arraylist.bai_tap.quan_ly_sinh_vien.controller;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    public void showStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----Quản lý sinh viên---- \n" +
                    "1. Thêm mới học biên \n" +
                    "2. Xóa học viên \n" +
                    "3. Xem danh sách sinh viên \n" +
                    "0. Thoát \n" +
                    "Mời chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentService.addNewStudent();
                    break;
                case "2":
                    studentService.deleteStudentId();
                    break;
                case "3":
                    studentService.displayStudentList();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chưa chọn đúng chức năng");
                    break;
            }
        } while (flag);
    }
}
