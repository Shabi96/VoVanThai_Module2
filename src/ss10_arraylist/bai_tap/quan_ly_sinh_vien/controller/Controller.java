package ss10_arraylist.bai_tap.quan_ly_sinh_vien.controller;

import java.util.Scanner;

public class Controller {
    private final CoachController controller = new CoachController();
    private final StudentController studentController = new StudentController();
    public void showMenu() {
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
                    controller.showCoachMenu();
                    break;
                case "2":
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
