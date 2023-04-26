package case_study.controllers;

import java.util.Scanner;

public class PromotionController {
    public void promotionMenu() {
        Scanner sccaner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----PROMOTION MANAGEMENT---- \n" +
                    "1. Display list customer to use service \n" +
                    "2. Display list customer get voucher \n" +
                    "3. Return main menu \n" +
                    "Mời bạn chọn: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sccaner.nextLine());
                if (choice <= 0 || choice > 3) {
                    throw new Exception("Chỉ được nhập từ 1 tới 3!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng!!");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    break;
            }
        }while (flag);
    }
}
