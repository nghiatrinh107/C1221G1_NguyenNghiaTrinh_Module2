package bai_tap_them.controllers;

import bai_tap_them.services.Services;
import bai_tap_them.services.impl.CarServiceImpl;
import bai_tap_them.services.impl.MotorcycleServiceImpl;
import bai_tap_them.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class VehiclesController {
    static Services truck = new TruckServiceImpl();
    static Services car = new CarServiceImpl();
    static Services motorcycle = new MotorcycleServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. display vehicles\n" +
                    "2. add vehicles\n" +
                    "4. delete vehicles\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1 :
                    System.out.println("Display vehicles :\n" +
                            "1. Truck\n" +
                            "2. Car\n" +
                            "3. Motorcycle\n");
                    System.out.print("choose: ");
                    int chooseVehicles = Integer.parseInt(scanner.nextLine());
                    switch (chooseVehicles){
                        case 1 :
                            truck.display();
                            break;
                        case 2 :
                            car.display();
                            break;
                        case 3:
                            motorcycle.display();
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 2: System.out.println("Add vehicles :\n" +
                        "1. Truck\n" +
                        "2. Car\n" +
                        "3. Motorcycle\n");
                    System.out.print("choose: ");
                    int chooseVehiclesAdd = Integer.parseInt(scanner.nextLine());
                    switch (chooseVehiclesAdd){
                        case 1 :
                            truck.add();
                            break;
                        case 2 :
                            car.add();
                            break;
                        case 3:
                            motorcycle.add();
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 3:System.out.println("Add vehicles :\n" +
                        "1. Truck\n" +
                        "2. Car\n" +
                        "3. Motorcycle\n");
                    System.out.print("choose: ");
                    int chooseVehiclesDelete = Integer.parseInt(scanner.nextLine());
                    switch (chooseVehiclesDelete){
                        case 1 :
                            truck.delete();
                            break;
                        case 2 :
                            car.delete();
                            break;
                        case 3:
                            motorcycle.delete();
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("choose:0, 1, 2, 3, 4");
            }
        }while (flag);
    }
}