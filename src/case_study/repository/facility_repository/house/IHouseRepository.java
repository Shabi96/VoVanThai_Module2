package case_study.repository.facility_repository.house;

import case_study.model.facility.House;

import java.util.LinkedHashMap;
import java.util.List;

public interface IHouseRepository {
    LinkedHashMap<House, Integer> getHouseList();
    void addNewHouse(House house);
}
