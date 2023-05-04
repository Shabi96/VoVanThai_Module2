package case_study.service.facility_service.villa;

import case_study.model.facility.Villa;
import case_study.repository.facility_repository.FacilityRepository;
import case_study.repository.facility_repository.villa.VillaRepository;
import case_study.utils.validate.Validate;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner sc = new Scanner(System.in);
    private VillaRepository villaRepository = new VillaRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayVillaList() {
        LinkedHashMap<Villa, Integer> villaList = villaRepository.getVillaList();
        for (Villa v : villaList.keySet()) {
            System.out.println(v);
        }
    }

    @Override
    public void addNewVilla() {
        String idVilla;
        boolean checkId = true;
        do {
            System.out.print("Nhập id Villa: ");
            idVilla = sc.nextLine();
            boolean check = facilityRepository.checkById(idVilla);
            if (Validate.validateVillaId(idVilla)) {
                if (check) {
                    System.err.println("Mã đã tồn tại\n" +
                            "Vui lòng nhập lại!!");
                } else {
                    System.out.println("Thêm thành công!!");
                    checkId = false;
                }
            } else {
                System.err.println("Nhập sai định dạng (SVVL-YYYY)!!!!\n" +
                        "Vui lòng nhập lại");
            }
        } while (checkId);

        String nameVilla;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            nameVilla = sc.nextLine();
            if (Validate.validateServiceName(nameVilla)) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Nhập sai định dạng ([A-Z]xxxx)!!!!");
            }
        } while (!Validate.validateServiceName(nameVilla));

        double area;
        do {
            System.out.print("Nhập diện tích Villa: ");
            area = Double.parseDouble(sc.nextLine());
            if (area > 30) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Diện tích phải lớn hơn 30!!!");
            }
        } while (area <= 30);

        double price;
        do {
            System.out.print("Nhập giá Villa: ");
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
            System.out.print("Chọn thời gian sử dụng Villa: \n" +
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
        System.out.print("Nhập loại Villa: ");
        String standard = sc.nextLine();
        System.out.print("Nhập diện tích hồ bơi Villa: ");
        double poolArea;
        do {
            System.out.print("Nhập diện tích hồ bơi: ");
            poolArea = Double.parseDouble(sc.nextLine());
            if (poolArea > 30) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Diện tích phải lớn hơn 30!!!");
            }
        } while (poolArea <= 30);
        int floors;
        do {
            System.out.print("Nhập số tầng Villa: ");
            floors = Integer.parseInt(sc.nextLine());
            if (floors > 0) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Số tầng phải lớn hơn 0!!");
            }
        } while (floors < 0);
        Villa villa = new Villa(idVilla, nameVilla, area, price, amount, time, standard, poolArea, floors);
        villaRepository.addNewVilla(villa);
        System.out.println("Thêm thành công!!");
    }
}
