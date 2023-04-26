package case_study.repository.facility_repository.room;

import case_study.model.facility.Room;

import java.util.List;

public interface IRoomRepository {
    List<Room> getRoomList();
    void addNewRoom(Room room);
}
