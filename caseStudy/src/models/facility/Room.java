package models.facility;

public class Room extends Facility {
        private String Complimentary;

    public Room() {
    }

    public Room(String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle, String complimentary) {
        super(hotelService, roomArea, rate, maximumCapacity, rentStyle);
        Complimentary = complimentary;
    }

    public String getComplimentary() {
        return Complimentary;
    }

    public void setComplimentary(String complimentary) {
        Complimentary = complimentary;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Complimentary='" + Complimentary + '\'' +
                "} " + super.toString();
    }
}
