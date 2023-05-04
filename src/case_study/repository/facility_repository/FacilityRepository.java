package case_study.repository.facility_repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.utils.facility_write_and_read.FacilityWriteAndRead;
import java.util.LinkedHashMap;

public class FacilityRepository implements IFacilityRepository {
    private static final String PATH_FACILITY_FILE = "src/case_study/data/facility/facility.csv";
    public static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        House house = new House("SVHO-0001", "PenHouse", 35, 100, 10, "Ngày", "VIP", 4);
        House house1 = new House("SVHO-0002", "SkyHouse", 40, 150, 15, "Ngày", "SVIP", 7);
        House house2 = new House("SVHO-0003", "PinkHouse", 30, 80, 8, "Ngày", "VIP", 3);
        House house3 = new House("SVHO-0004", "SunHouse", 35, 120, 12, "Ngày", "SVIP", 5);
        House house4 = new House("SVHO-0005", "VinaHouse", 50, 200, 20, "Ngày", "SSVIP", 7);
        Villa villa = new Villa("SVVL-0001", "Veres", 50, 150, 12, "Ngày", "Vip", 30, 5);
        Villa villa1 = new Villa("SVVL-0002", "Ryoma", 55, 180, 15, "Ngày", "Vip", 30, 5);
        Villa villa2 = new Villa("SVVL-0003", "Tulen", 60, 250, 18, "Ngày", "Vip", 40, 7);
        Villa villa3 = new Villa("SVVL-0004", "Zephys", 40, 130, 10, "Ngày", "Vip", 30, 5);
        Villa villa4 = new Villa("SVVL-0005", "Flash", 35, 120, 8, "Ngày", "Vip", 30, 5);
        Room room = new Room("SVRO-0001", "Yasuo", 30, 50, 5, "Ngày", "Bilard");
        Room room1 = new Room("SVRO-0002", "Zed", 35, 80, 7, "Ngày", "Gym");
        Room room2 = new Room("SVRO-0003", "Jarvan", 35, 80, 7, "Ngày", "Massage");
        Room room3 = new Room("SVRO-0004", "LeeSin", 30, 50, 5, "Ngày", "Buffet");
        Room room4 = new Room("SVRO-0005", "Riven", 30, 50, 5, "Ngày", "Gold");
        linkedHashMap.put(house, 0);
        linkedHashMap.put(house1, 0);
        linkedHashMap.put(house2, 0);
        linkedHashMap.put(house3, 0);
        linkedHashMap.put(house4, 0);
        linkedHashMap.put(villa, 0);
        linkedHashMap.put(villa1, 0);
        linkedHashMap.put(villa2, 0);
        linkedHashMap.put(villa3, 0);
        linkedHashMap.put(villa4, 0);
        linkedHashMap.put(room, 0);
        linkedHashMap.put(room1, 0);
        linkedHashMap.put(room2, 0);
        linkedHashMap.put(room3, 0);
        linkedHashMap.put(room4, 4);
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayFacilityList() {
        if (FacilityWriteAndRead.readFromFile(PATH_FACILITY_FILE).size() == 0) {
            FacilityWriteAndRead.writeToFile(linkedHashMap, PATH_FACILITY_FILE);
            return linkedHashMap;
        }
        return FacilityWriteAndRead.readFromFile(PATH_FACILITY_FILE);
    }

    @Override
    public void addNewFacility() {
    }

    @Override
    public boolean checkById(String id) {
        for (Facility f : linkedHashMap.keySet()) {
            if (f.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void updateBooking(String idService) {
        for (Facility f : linkedHashMap.keySet()) {
            if (f.getId().equals(idService)) {
                linkedHashMap.put(f, linkedHashMap.get(f) + 1);
                break;
            }
        }
    }

    public void displayFix() {
        for (Facility f : linkedHashMap.keySet()) {
            if (linkedHashMap.get(f) == 5) {
                System.out.println(f);
            }
        }
    }
}
