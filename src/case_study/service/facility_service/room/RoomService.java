package case_study.service.facility_service.room;

import case_study.model.facility.Facility;
import case_study.model.facility.Room;
import case_study.repository.facility_repository.FacilityRepository;
import case_study.repository.facility_repository.room.RoomRepository;
import case_study.utils.validate.Validate;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RoomService implements IRoomService {
    private RoomRepository roomRepository = new RoomRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayRoomList() {
        LinkedHashMap<Room, Integer> roomList = roomRepository.getRoomList();
        for (Facility r : roomList.keySet()) {
            if (r instanceof Room) {
                System.out.println(r);
            }
        }
    }

    @Override
    public void addNewRoom() {
        String idRoom;
        boolean checkId = true;
        do {
            System.out.print("Nhập id Room: ");
            idRoom = sc.nextLine();
            boolean check = facilityRepository.checkById(idRoom);
            if (Validate.validateRoomId(idRoom)) {
                if (check) {
                    System.err.println("Mã đã tồn tại\n" +
                            "Vui lòng nhập lại!!!");
                } else {
                    System.out.println("Thêm thành công!!");
                    checkId = false;
                }
            } else {
                System.err.println("Nhập sai định dạng (SVRO-XXXX)!!!!\n" +
                        "Vui lòng nhập lại");
            }
        } while (checkId);

        String nameRoom;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            nameRoom = sc.nextLine();
            if (Validate.validateServiceName(nameRoom)) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Nhập sai định dạng ([A-Z]xxxx)!!!!");
            }
        } while (!Validate.validateServiceName(nameRoom));

        double area;
        do {
            System.out.print("Nhập diện tích Room: ");
            area = Double.parseDouble(sc.nextLine());
            if (area > 30) {
                System.out.println("Thêm thành công!!");
            } else {
                System.err.println("Diện tích phải lớn hơn 30!!!");
            }
        } while (area <= 30);

        double price;
        do {
            System.out.print("Nhập giá Room: ");
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
            System.out.print("Chọn thời gian sử dụng Room: \n" +
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
        System.out.println("Nhập dịch vụ free: ");
        String service = sc.nextLine();
        Room room = new Room(idRoom, nameRoom, area, price, amount, time, service);
        roomRepository.addNewRoom(room);
        System.out.println("Thêm thành công!!");
    }
}
