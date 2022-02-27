package oop_review.vehicle;

import java.util.Scanner;

public class VehicleManager {
    private static Vehicle[] vehicles = new Vehicle[100];
    static Scanner scanner = new Scanner(System.in);

    public void showIsVehicle() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.println("owner is: ");
        String owner = scanner.nextLine();
        System.out.println("cubic capacity :");
        int cubicCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("value: ");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("color: ");
        String color = scanner.nextLine();
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = new Vehicle(owner, cubicCapacity, value, color);
                break;
            }
        }
    }
}
