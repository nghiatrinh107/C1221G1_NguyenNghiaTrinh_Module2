package models.facility;

public class Room extends Facility {
        private String complimentary;

    public Room() {
    }

    public Room(String idFacility,String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle, String complimentary) {
        super(idFacility,hotelService, roomArea, rate, maximumCapacity, rentStyle);
        this.complimentary = complimentary;
    }

    public String getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(String complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                ", complimentary=" + complimentary +
                "} " ;
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV()+","+complimentary;
    }
}
