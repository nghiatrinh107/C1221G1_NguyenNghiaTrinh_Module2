package services;

import models.facility.Room;

public interface RoomService extends Service<Room> {
    @Override
    void add(Room room);
}
