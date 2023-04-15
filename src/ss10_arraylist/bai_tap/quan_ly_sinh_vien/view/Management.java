package ss10_arraylist.bai_tap.quan_ly_sinh_vien.view;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.controller.CoachController;
import ss10_arraylist.bai_tap.quan_ly_sinh_vien.controller.StudentController;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Chọn chế độ làm việc \n" +
                    "1. Quản lý giáo viên \n" +
                    "2. Quản lý học viên \n" +
                    "0. Thoát \n" +
                    "Mời chọn: ");
            String inputNumber = scanner.nextLine();
            switch (inputNumber) {
                case "1":
                    CoachController controller = new CoachController();
                    controller.showCoachMenu();
                    break;
                case "2":
                    StudentController studentController = new StudentController();
                    studentController.showStudentMenu();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai rồi:");

            }

        } while (flag);
    }
}
