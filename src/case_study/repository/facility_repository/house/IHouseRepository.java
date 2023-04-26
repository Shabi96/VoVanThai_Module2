package case_study.repository.facility_repository.house;

import case_study.model.facility.House;

import java.util.List;

public interface IHouseRepository {
    List<House> getHouseList();
    void addNewHouse(House house);
}
