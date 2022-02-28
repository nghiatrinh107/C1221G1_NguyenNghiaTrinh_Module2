package bai_tap_them.models;

import oop_review.vehicle.Vehicle;

public class Truck extends Vehicles{
    private int weight;

    public Truck() {
    }

    public Truck(String licensePlate, Manufacturer manufacturer, int yearOfManufacture, String owner, int weight) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString()+
                ", weight=" + weight +
                "} " ;
    }
}
