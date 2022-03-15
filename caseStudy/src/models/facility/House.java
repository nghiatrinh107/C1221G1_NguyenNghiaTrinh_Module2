package models.facility;

public class House extends Facility {
    private String kindOfRoom;
    private double swimmingPool;
    private int floor;

    public House() {
    }

    public House(String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle, String kindOfRoom, double swimmingPool, int floor) {
        super(hotelService, roomArea, rate, maximumCapacity, rentStyle);
        this.kindOfRoom = kindOfRoom;
        this.swimmingPool = swimmingPool;
        this.floor = floor;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(double swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "kindOfRoom='" + kindOfRoom + '\'' +
                ", swimmingPool=" + swimmingPool +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
