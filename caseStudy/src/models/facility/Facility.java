package models.facility;

public abstract class Facility {
    private String hotelService;
    private double roomArea;
    private int rate;
    private int maximumCapacity;
    private String rentStyle;

    public Facility() {
    }

    public Facility(String hotelService, double roomArea, int rate, int maximumCapacity, String rentStyle) {
        this.hotelService = hotelService;
        this.roomArea = roomArea;
        this.rate = rate;
        this.maximumCapacity = maximumCapacity;
        this.rentStyle = rentStyle;
    }

    public String getHotelService() {
        return hotelService;
    }

    public void setHotelService(String hotelService) {
        this.hotelService = hotelService;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "hotelService='" + hotelService + '\'' +
                ", roomArea=" + roomArea +
                ", rate=" + rate +
                ", maximumCapacity=" + maximumCapacity +
                ", rentStyle='" + rentStyle + '\'' +
                '}';
    }
}
