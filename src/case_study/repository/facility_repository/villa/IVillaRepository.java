package case_study.repository.facility_repository.villa;

import case_study.model.facility.Villa;
import java.util.LinkedHashMap;

public interface IVillaRepository {
    LinkedHashMap<Villa, Integer> getVillaList();
    void addNewVilla(Villa villa);
}
