package models.facility;

public class Villa extends Facility {
    private String kindOfRoom;
    private int floor;

    public Villa() {
    }

    public Villa(int idFacility,String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle, String kindOfRoom, int floor) {
        super(idFacility,hotelService, roomArea, rate, maximumCapacity, rentStyle);
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
        return "Villa{ "+ super.toString() +
                ", kindOfRoom=" + kindOfRoom +
                ", floor=" + floor +
                "} " ;
    }
}
