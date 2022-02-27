package bai_tap_them.services.impl;

import bai_tap_them.models.Truck;
import bai_tap_them.services.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements Services {
    ArrayList<Truck> truckArrayList =new ArrayList<Truck>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.println("vehicles name: ");
        String vehiclesName = scanner.nextLine();
        System.out.println("year of manufacture: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("owner: ");
        String owner = scanner.nextLine();
        System.out.println("weight: ");
        int weight =Integer.parseInt(scanner.nextLine());
        truckArrayList.add(new Truck(licensePlate,vehiclesName,yearOfManufacture,owner,weight));
    }

    @Override
    public void display() {
        for (int i = 0; i <truckArrayList.size() ; i++) {
            System.out.println(truckArrayList.get(i));
        }
    }

    @Override
    public void delete() {
        System.out.println("nhập biển số cần xóa: ");
        String licensePlate = scanner.nextLine();
        for (int i = 0; i <truckArrayList.size() ; i++) {
            System.out.println(truckArrayList.get(i));
        }
    }
}
