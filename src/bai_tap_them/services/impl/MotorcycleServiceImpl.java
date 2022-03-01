package bai_tap_them.services.impl;

import bai_tap_them.models.Manufacturer;
import bai_tap_them.models.Motorcycle;
import bai_tap_them.services.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleServiceImpl implements Services {
    ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<Motorcycle>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.println("manufacturer: ");
        ManufacturerSevice.displayManufacturerName();
        String manufacturer = scanner.nextLine();
        Manufacturer motorcycleManufacturer = ManufacturerSevice.getManufacturerArrayList(manufacturer);
        System.out.println("year of manufacture: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("owner: ");
        String owner = scanner.nextLine();
        System.out.println("Cubic capacity: ");
        int cubicCapacity = Integer.parseInt(scanner.nextLine());
        motorcycleArrayList.add(new Motorcycle(licensePlate, motorcycleManufacturer, yearOfManufacture, owner, cubicCapacity));
    }

    @Override
    public void display() {
        for (int i = 0; i < motorcycleArrayList.size(); i++) {
            System.out.println(motorcycleArrayList.get(i));
        }
    }

    @Override
    public void delete(String licensePlateDelete) {
        for (int i = 0; i < motorcycleArrayList.size(); i++) {
            if (motorcycleArrayList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                motorcycleArrayList.remove(motorcycleArrayList.get(i));
            }
        }
        System.out.println("đã xóa thành công");
    }
}
