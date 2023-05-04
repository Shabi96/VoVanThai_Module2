package case_study.repository.facility_repository;

import case_study.model.facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> displayFacilityList();
    void addNewFacility();
    boolean checkById(String id);
}
