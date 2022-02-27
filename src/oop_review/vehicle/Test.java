package oop_review.vehicle;

import java.util.Scanner;

public class Test {
    static VehicleManager vehicleManager = new VehicleManager();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Main Menu:\n"+
                    "1. add\n"+
                    "2. display\n"+
                    "0. exit\n");
            System.out.print("choose: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1 :
                    vehicleManager.add();
                    break;
                case 2:
                    System.out.println("display student");
                    vehicleManager.showIsVehicle();
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("chọn: 0, 1, 2");
            }
        }while (flag);

    }
}
