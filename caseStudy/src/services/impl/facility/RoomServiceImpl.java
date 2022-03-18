package services.impl.facility;

import models.facility.House;
import models.facility.Room;
import services.RoomService;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements RoomService {
    private static List<Room> roomList = new ArrayList<>();
    static final String ROOM_CSV = "src\\data\\room.csv";

    static {
        roomList = ReadAndWrite.readRoomListFromCSV(ROOM_CSV);
    }
    public RoomServiceImpl() {
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        RoomServiceImpl.roomList = roomList;
    }

    @Override
    public void display() {
        for (int i = 0; i <roomList.size() ; i++) {
            System.out.println(roomList.get(i));
        }
    }

    @Override
    public void add(Room room) {
        roomList.add(room);
        ReadAndWrite.writeListFacilityToCSV(ROOM_CSV,roomList);
    }

    @Override
    public void edit(int id) {

    }
}
