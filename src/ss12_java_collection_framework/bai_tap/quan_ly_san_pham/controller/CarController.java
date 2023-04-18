package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.service.CarService;

import java.util.Scanner;

public class CarController {
    private CarService carService = new CarService();
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.print("----Quản lý Car---- \n" +
                    "1. Thêm Car \n" +
                    "2. Sửa thông tin Car \n" +
                    "3. Xóa Car \n" +
                    "4. Hiển thị danh sách Car \n" +
                    "5. Tìm kiếm Car \n" +
                    "0. Thoát \n" +
                    "Mời chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    carService.addNewCar();
                    break;
                case "2":
                    carService.editCar();
                    break;
                case "3":
                    carService.deleteCar();
                    break;
                case "4":
                    carService.displayCarList();
                    break;
                case "5":
                    carService.findCar();
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
