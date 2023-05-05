package case_study.controllers;

import case_study.service.booking_service.BookingService;
import case_study.service.contract_service.ContractService;

import java.util.Scanner;

public class BookingController {
    private BookingService bookingService = new BookingService();
    private ContractService contractService = new ContractService();
    public void bookingMenu() {
        Scanner sccaner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----BOOKING MANAGEMENT---- \n" +
                    "1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Creat new contracts \n" +
                    "4. Display lis contracts \n" +
                    "5. Edit contracts \n" +
                    "6. Return main menu \n" +
                    "Mời bạn chọn: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sccaner.nextLine());
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
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayBookingList();
                    break;
                case 3:
                    contractService.addNewContract();
                    break;
                case 4:
                    contractService.displayContractList();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    flag = false;
                default:
                    break;
            }
        }while (flag);
    }
}
