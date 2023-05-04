package case_study.repository.facility_repository.house;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.utils.facility_write_and_read.FacilityWriteAndRead;
import case_study.utils.facility_write_and_read.HouseWriteAndRead;
import java.util.LinkedHashMap;

public class HouseRepository implements IHouseRepository {
    private final String PATH_HOUSE_FILE = "src/case_study/data/facility/house.csv";
    private final String PATH_FACILITY_FILE = "src/case_study/data/facility/facility.csv";
    public LinkedHashMap<House, Integer> houseLinkedHashMap = HouseWriteAndRead.readFromFile(PATH_HOUSE_FILE);
    public LinkedHashMap<Facility, Integer> facilityLinkedHashMap = FacilityWriteAndRead.readFromFile(PATH_FACILITY_FILE);

    @Override
    public LinkedHashMap<House, Integer> getHouseList() {
        houseLinkedHashMap.clear();
        for (Facility h : facilityLinkedHashMap.keySet()) {
            if (h instanceof House) {
                houseLinkedHashMap.put((House) h, 0);
            }
        }
        HouseWriteAndRead.writeToFile(houseLinkedHashMap, PATH_HOUSE_FILE);
        return houseLinkedHashMap;
    }

    @Override
    public void addNewHouse(House house) {
        facilityLinkedHashMap.put(house, 0);
        HouseWriteAndRead.writeToFile(houseLinkedHashMap, PATH_HOUSE_FILE);
        FacilityWriteAndRead.writeToFile(facilityLinkedHashMap, PATH_FACILITY_FILE);
    }
}
