package case_study.service.facility_service.house;

import case_study.model.facility.House;
import case_study.repository.facility_repository.FacilityRepository;
import case_study.repository.facility_repository.house.HouseRepository;
import case_study.utils.validate.Validate;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner sc = new Scanner(System.in);
    private HouseRepository houseRepository = new HouseRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayHouseList() {
        LinkedHashMap<House, Integer> houseList = houseRepository.getHouseList();
        for (House h : houseList.keySet()) {
            System.out.println(h);
        }
    }

    @Override
    public void addNewHouse() {
        String idHouse;
        boolean checkId = true;
        do {
            System.out.print("Nhập id House: ");
            idHouse = sc.nextLine();
            boolean check = facilityRepository.checkById(idHouse);
            if (Validate.validateHouseId(idHouse)) {
                if (check) {
                    System.err.println("Mã đã tồn tại\n" +
                            "Vui lòng nhập lại!!");
                } else {
                    System.out.println("Thêm thành công!!");
                    checkId = false;
                }
            } else {
                System.err.println("Nhập sai định dạng (SVHO-XXXX)!!!!\n" +
                        "Vui lòng nhập lại");
            }
        } while (checkId);

        String nameHouse;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            nameHouse = sc.nextLine();
            if (Validate.validateServiceName(nameHouse)) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Nhập sai định dạng ([A-Z]xxxx)!!!!");
            }
        } while (!Validate.validateServiceName(nameHouse));

        double area;
        do {
            System.out.print("Nhập diện tích House: ");
            area = Double.parseDouble(sc.nextLine());
            if (area > 30) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Diện tích phải lớn hơn 30!!!");
            }
        } while (area <= 30);

        double price;
        do {
            System.out.print("Nhập giá House: ");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) {
                System.out.println("Thêm thành công!!!");
            } else {
                System.err.println("Chi phí phải lớn hơn 0!!!!");
            }
        } while (price < 0);

        int amount;
        do {
            System.out.print("Nhập số lượng người thuê: ");
            amount = Integer.parseInt(sc.nextLine());
            if (amount > 0 && amount < 20) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Số lượng người thuê từ 1 đến 20!!!");
            }
        } while (amount < 0 || amount > 20);
        String time = "";
        boolean flag = true;
        do {
            System.out.print("Chọn thời gian sử dụng House: \n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ\n" +
                    "Mời chọn: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    time = "Năm";
                    flag = false;
                    break;
                case "2":
                    time = "Tháng";
                    flag = false;
                    break;
                case "3":
                    time = "Ngày";
                    flag = false;
                    break;
                case "4":
                    time = "Giờ";
                    flag = false;
                    break;
                default:
                    System.err.println("Bạn chọn sai rồi!!");
                    break;
            }
        } while (flag);

        String standard;
        do {
            System.out.print("Nhập loại House: ");
            standard = sc.nextLine();
            if (Validate.validateServiceName(standard)) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Nhập sai định dạng ([A-Z]xxxx)!!!!)");
            }
        } while (!Validate.validateServiceName(standard));

        int floors;
        do {
            System.out.print("Nhập số tầng House: ");
            floors = Integer.parseInt(sc.nextLine());
            if (floors > 0) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Số tầng phải lớn hơn 0!!");
            }
        } while (floors < 0);
        House house = new House(idHouse, nameHouse, area, price, amount, time, standard, floors);
        houseRepository.addNewHouse(house);
        System.out.println("Thêm thành công House!!");
    }
}
