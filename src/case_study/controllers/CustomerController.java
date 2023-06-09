package case_study.controllers;

import case_study.service.customer_service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private CustomerService customerService = new CustomerService();
    public void customerMenu() {
        Scanner sccaner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----CUSTOMER MANAGEMENT---- \n" +
                    "1. Display list customers \n" +
                    "2. Add new customer \n" +
                    "3. Edit customer \n" +
                    "4. Return main menu \n" +
                    "Mời bạn chọn: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sccaner.nextLine());
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
                    customerService.displayCustomerList();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }while (flag);
    }
}
