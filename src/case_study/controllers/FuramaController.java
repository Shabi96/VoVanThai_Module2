package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print(" ----FURAMA MANAGEMENT---- \n" +
                    "1. Employee " +
                    "Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit \n" +
                    "Mời bạn chọn chức năng làm việc: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice <= 0 || choice > 6) {
                    throw new Exception("Chỉ được nhập từ 1 tới 6!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (choice) {
                case 1:
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.employeeMenu();
                    break;
                case 2:
                    CustomerController customerController = new CustomerController();
                    customerController.customerMenu();
                    break;
                case 3:
                    FacilityController facilityController = new FacilityController();
                    facilityController.facilityMenu();
                    break;
                case 4:
                    BookingController bookingController = new BookingController();
                    bookingController.bookingMenu();
                    break;
                case 5:
                    PromotionController promotionController = new PromotionController();
                    promotionController.promotionMenu();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }
}
