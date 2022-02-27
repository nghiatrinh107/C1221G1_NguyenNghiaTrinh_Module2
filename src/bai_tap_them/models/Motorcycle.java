package bai_tap_them.models;

public class Motorcycle extends Vehicles{
    private int cubicCapacity;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, String vehiclesName, int yearOfManufacture, String owner, int cubicCapacity) {
        super(licensePlate, vehiclesName, yearOfManufacture, owner);
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
                "cubicCapacity=" + cubicCapacity +
                '}';
    }
}
