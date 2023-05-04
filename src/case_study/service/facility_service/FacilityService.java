package case_study.service.facility_service;

import case_study.model.facility.Facility;
import case_study.repository.facility_repository.FacilityRepository;
import java.util.LinkedHashMap;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayFacilityList() {
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = facilityRepository.displayFacilityList();
        for (Facility f: facilityIntegerLinkedHashMap.keySet()) {
            System.out.println(f);
        }
    }

    @Override
    public void addNewFacility() {
        facilityRepository.addNewFacility();
    }
}
