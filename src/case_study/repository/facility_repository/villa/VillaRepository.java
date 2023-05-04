package case_study.repository.facility_repository.villa;

import case_study.model.facility.Facility;
import case_study.model.facility.Villa;
import case_study.utils.facility_write_and_read.FacilityWriteAndRead;
import case_study.utils.facility_write_and_read.VillaWriteAndRead;
import java.util.LinkedHashMap;

public class VillaRepository implements IVillaRepository {
    private static final String PATH_VILLA_FILE = "src/case_study/data/facility/villa.csv";
    private final String PATH_FACILITY_FILE = "src/case_study/data/facility/facility.csv";
    public static LinkedHashMap<Villa, Integer> villaList = new LinkedHashMap<>();
    public LinkedHashMap<Facility, Integer> facilityLinkedHashMap = FacilityWriteAndRead.readFromFile(PATH_FACILITY_FILE);

    @Override
    public LinkedHashMap<Villa, Integer> getVillaList() {
        villaList.clear();
        for (Facility v : facilityLinkedHashMap.keySet()) {
            if(v instanceof Villa) {
                villaList.put((Villa) v, 0);
            }
        }
        VillaWriteAndRead.writeToFile(villaList, PATH_VILLA_FILE);
        return villaList;
    }

    @Override
    public void addNewVilla(Villa villa) {
        villaList.put(villa, 0);
        VillaWriteAndRead.writeToFile(villaList, PATH_VILLA_FILE);
        FacilityWriteAndRead.writeToFile(facilityLinkedHashMap, PATH_FACILITY_FILE);
    }

}
