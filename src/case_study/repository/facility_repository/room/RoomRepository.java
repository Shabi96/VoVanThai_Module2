package case_study.repository.facility_repository.room;

import case_study.model.facility.Facility;
import case_study.model.facility.Room;
import case_study.repository.facility_repository.FacilityRepository;
import case_study.utils.facility_write_and_read.FacilityWriteAndRead;
import case_study.utils.facility_write_and_read.RoomWriteAndRead;
import java.util.LinkedHashMap;

public class RoomRepository implements IRoomRepository {
    private static final String PATH_ROOM_FILE = "src/case_study/data/facility/room.csv";
    private final String PATH_FACILITY_FILE = "src/case_study/data/facility/facility.csv";
    private LinkedHashMap<Facility, Integer> facilityLinkedHashMap = FacilityWriteAndRead.readFromFile(PATH_FACILITY_FILE);
    private LinkedHashMap<Room, Integer> roomList = RoomWriteAndRead.readFromFile(PATH_ROOM_FILE);

    @Override
    public LinkedHashMap<Room, Integer> getRoomList() {
        roomList.clear();
        for (Facility r : facilityLinkedHashMap.keySet()) {
            if (r instanceof Room) {
                roomList.put((Room) r, 0);
            }
        }
        RoomWriteAndRead.writeToFile(roomList, PATH_ROOM_FILE);
        return roomList;
    }

    @Override
    public void addNewRoom(Room room) {
        roomList.put(room, 0);
        RoomWriteAndRead.writeToFile(roomList, PATH_ROOM_FILE);
        FacilityWriteAndRead.writeToFile(facilityLinkedHashMap, PATH_FACILITY_FILE);
    }
}
