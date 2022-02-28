package bai_tap_them.models;

public class Motorcycle extends Vehicles{
    private int cubicCapacity;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, Manufacturer manufacturer, int yearOfManufacture, String owner, int cubicCapacity) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.cubicCapacity = cubicCapacity;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString()+
                "cubicCapacity=" + cubicCapacity +
                '}';
    }
}
