package models.facility;

public class Villa extends Facility {
    private String kindOfRoom;
    private int floor;

    public Villa() {
    }

    public Villa(String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle, String kindOfRoom, int floor) {
        super(hotelService, roomArea, rate, maximumCapacity, rentStyle);
        this.kindOfRoom = kindOfRoom;
        this.floor = floor;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "kindOfRoom='" + kindOfRoom + '\'' +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
