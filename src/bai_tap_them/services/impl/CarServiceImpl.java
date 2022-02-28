package bai_tap_them.services.impl;

import bai_tap_them.models.Car;
import bai_tap_them.models.Manufacturer;
import bai_tap_them.services.Services;
import lam_thu_bai_tap.manager_student.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl  implements Services {
    ArrayList<Car> carArrayList = new ArrayList<Car>();
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
        System.out.println("Seat: ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Car type: ");
        String carType = scanner.nextLine();
        carArrayList.add(new Car(licensePlate,carManufacturer,yearOfManufacture,owner,seat,carType));

    }

    @Override
    public void display() {
        for (int i = 0; i <carArrayList.size() ; i++) {
            System.out.println(carArrayList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("license plate delete :");
        String licensePlateDelete = scanner.nextLine();
        for (int i = 0; i <carArrayList.size() ; i++) {
            if(carArrayList.get(i).getLicensePlate().equals( licensePlateDelete)){
                carArrayList.remove(carArrayList.get(i));
            }
        }
    }
}
