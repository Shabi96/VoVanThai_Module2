package case_study.controllers;

import java.util.Scanner;

public class FacilityController {
    public void facilityMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----FACILITY MANAGEMENT---- \n" +
                    "1. Display list facilitys \n" +
                    "2. Add new facility \n" +
                    "3. Display list facility maintenance \n" +
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
                    break;
                case 2:
                    break;
                case 3:
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
