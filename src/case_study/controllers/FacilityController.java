package case_study.controllers;

import case_study.repository.facility_repository.FacilityRepository;
import case_study.repository.facility_repository.house.HouseRepository;
import case_study.service.facility_service.FacilityService;
import case_study.service.facility_service.house.HouseService;
import case_study.service.facility_service.room.RoomService;
import case_study.service.facility_service.villa.VillaService;
import case_study.utils.facility_write_and_read.FacilityWriteAndRead;

import java.util.Scanner;

public class FacilityController {
    private FacilityService facilityService = new FacilityService();
    private HouseService houseService = new HouseService();
    private VillaService villaService = new VillaService();
    private RoomService roomService = new RoomService();
    private FacilityRepository facilityRepository = new FacilityRepository();

    public void facilityMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----FACILITY MANAGEMENT---- \n" +
                    "1. Display list facility \n" +
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
                    boolean check = true;
                    do {
                        System.out.print("1. Display all Facility\n" +
                                "2. Display House\n" +
                                "3. Display Room\n" +
                                "4. Display Villa\n" +
                                "0. Return\n" +
                                "Enter: ");
                        String choose = sc.nextLine();
                        switch (choose) {
                            case "1":
                                facilityService.displayFacilityList();
                                break;
                            case "2":
                                houseService.displayHouseList();
                                break;
                            case "3":
                                roomService.displayRoomList();
                                break;
                            case "4":
                                villaService.displayVillaList();
                                break;
                            case "0":
                                check = false;
                                break;
                            default:
                                System.out.println("Bạn chọn sai rồi!!!");
                        }
                    } while (check);
                    break;
                case 2:
                    facilityService.addNewFacility();
                    boolean flag1 = true;
                    do {
                        System.out.print("----Facility----\n" +
                                "1. Add new House\n" +
                                "2. Add new Room\n" +
                                "3. Add new Villa\n" +
                                "4. Back to menu\n" +
                                "Mời chọn: ");
                        String choice1 = sc.nextLine();
                        switch (choice1) {
                            case "1":
                                houseService.addNewHouse();
                                break;
                            case "2":
                                roomService.addNewRoom();
                                break;
                            case "3":
                                villaService.addNewVilla();
                                break;
                            case "4":
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Bạn chọn sai rồi!!!");
                                break;
                        }
                    } while (flag1);
                    break;
                case 3:
                    facilityRepository.displayFix();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }
}
