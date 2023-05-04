package case_study.repository.facility_repository.room;

import case_study.model.facility.Room;

import java.util.LinkedHashMap;
import java.util.List;

public interface IRoomRepository {
    LinkedHashMap<Room, Integer> getRoomList();
    void addNewRoom(Room room);
}
