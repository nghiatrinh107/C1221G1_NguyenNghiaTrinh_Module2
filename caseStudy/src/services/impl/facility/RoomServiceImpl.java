package services.impl.facility;

import models.facility.House;
import models.facility.Room;
import services.RoomService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements RoomService {
    private static List<Room> roomList = new ArrayList<>();

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
    }

    @Override
    public void edit(int id) {

    }
}
