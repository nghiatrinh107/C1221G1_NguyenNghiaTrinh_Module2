package bai_tap_them.models;

public class Car  extends Vehicles{
    private int seat;
    private String carType;

    public Car() {
    }

    public Car(String licensePlate, Manufacturer manufacturer, int yearOfManufacture, String owner, int seat, String carType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.seat = seat;
        this.carType = carType;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+
                "seat=" + seat +
                ", carType='" + carType +
                "} " ;
    }
}
