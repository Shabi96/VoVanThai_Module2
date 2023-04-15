package ss10_arraylist.bai_tap.quan_ly_sinh_vien.controller;

import ss10_arraylist.bai_tap.quan_ly_sinh_vien.service.CoachService;

import java.util.Scanner;

public class CoachController {
    private CoachService coachService = new CoachService();

    public void showCoachMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----Quản lý giáo viên---- \n" +
                    "1. Thêm mới giáo viên \n" +
                    "2. Xóa giáo viên \n" +
                    "3. Xem danh sách giáo viên \n" +
                    "0. Thoát \n" +
                    "Mời chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    coachService.addNewCoach();
                    break;
                case "2":
                    coachService.deleteCoachById();
                    break;
                case "3":
                    coachService.displayCoachList();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chưa chọn đúng chức năng!");
                    break;
            }

        } while (flag);
    }
}
