package bai_tap_them.services.impl;

import bai_tap_them.models.Car;
import bai_tap_them.services.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl  implements Services {
    ArrayList<Car> carArrayList = new ArrayList<Car>();
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
        System.out.println("Seat: ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Car type: ");
        String carType = scanner.nextLine();
        carArrayList.add(new Car(licensePlate,vehiclesName,yearOfManufacture,owner,seat,carType));

    }

    @Override
    public void display() {
        for (int i = 0; i <carArrayList.size() ; i++) {
            System.out.println(carArrayList.get(i));
        }
    }

    @Override
    public void delete() {

    }
}
