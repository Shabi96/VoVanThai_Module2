package case_study.repository.facility_repository.villa;

import case_study.model.facility.Villa;

import java.util.List;

public interface IVillaRepository {
    List<Villa> getVillaList();
    void addNewVilla(Villa villa);
}
