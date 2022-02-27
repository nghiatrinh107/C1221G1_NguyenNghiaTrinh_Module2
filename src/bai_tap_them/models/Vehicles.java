package bai_tap_them.models;

public abstract class Vehicles {
    private String licensePlate,vehiclesName,Owner;
    private int yearOfManufacture;

    public Vehicles() {
    }

    public Vehicles(String licensePlate, String vehiclesName, int yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.vehiclesName = vehiclesName;
        this.yearOfManufacture = yearOfManufacture;
        this.Owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehiclesName() {
        return vehiclesName;
    }

    public void setVehiclesName(String vehiclesName) {
        this.vehiclesName = vehiclesName;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehiclesName='" + vehiclesName + '\'' +
                ", Owner='" + Owner + '\'' +
                ", yearOfManufacture=" + yearOfManufacture;
    }
}
