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

        ManufacturerSevice.DisplayManufacturerName();
        String manufacturer = scanner.nextLine();
        Manufacturer carManufacturer =  ManufacturerSevice.getManufacturerArrayList(manufacturer);
        System.out.println("year of manufacture: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("owner: ");
        String owner = scanner.nextLine();
        System.out.println("Cubic capacity: ");
        int cubicCapacity = Integer.parseInt(scanner.nextLine());
        motorcycleArrayList.add(new Motorcycle(licensePlate,carManufacturer,yearOfManufacture,owner,cubicCapacity));
    }

    @Override
    public void display() {
        for (int i = 0; i <motorcycleArrayList.size() ; i++) {
            System.out.println(motorcycleArrayList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("license plate delete :");
        String licensePlateDelete = scanner.nextLine();
        for (int i = 0; i <motorcycleArrayList.size() ; i++) {
            if(motorcycleArrayList.get(i).getLicensePlate().equals(licensePlateDelete)){
                motorcycleArrayList.remove(motorcycleArrayList.get(i));
            }
        }
    }
}
