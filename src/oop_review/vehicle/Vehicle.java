package oop_review.vehicle;

public class Vehicle {
    private int cubicCapacity;
    private double valueVehicle;
    private String owner,color;

    public Vehicle() {
    }

    public Vehicle(String owner,int cubicCapacity, double valueVehicle, String color) {
        this.cubicCapacity = cubicCapacity;
        this.valueVehicle = valueVehicle;
        this.owner = owner;
        this.color = color;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public double getValueVehicle() {
        return valueVehicle;
    }

    public void setValueVehicle(double valueVehicle) {
        this.valueVehicle = valueVehicle;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double payTaxes(){
        if (getCubicCapacity() < 100) {
            return getValueVehicle() * 1 / 100;
        } else if (getCubicCapacity() <= 200) {
            return getValueVehicle() * 3 / 100;
        } else {
            return getValueVehicle() * 5 / 100;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", owner= " + owner  +
                ", cubicCapacity=" + cubicCapacity +
                ", valueVehicle=" + valueVehicle +
                ", color= " + color +
                ", payTaxes= "+ payTaxes()+
                '}';
    }
}
