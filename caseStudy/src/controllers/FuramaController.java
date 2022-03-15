package controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.println("Employee Management  :\n" +
                            "1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Return main menu\n");
                    System.out.print("choose: ");
                    int chooseEmployee = Integer.parseInt(scanner.nextLine());
                    switch (chooseEmployee) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3, 4");
                    }
                    break;
                case 2:
                    System.out.println("Customer Management   :\n" +
                            "1. Display list customers\n" +
                            "2. Add new customer\n" +
                            "3. Edit customer\n" +
                            "4. Return main menu\n");
                    System.out.print("choose: ");
                    int chooseCustomer = Integer.parseInt(scanner.nextLine());
                    switch (chooseCustomer) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3, 4");
                    }
                    break;
                case 3:
                    System.out.println("Facility Management    :\n" +
                            "1. Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintenance\n" +
                            "4. Return main menu\n");
                    System.out.print("choose: ");
                    int chooseFacility = Integer.parseInt(scanner.nextLine());
                    switch (chooseFacility) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3, 4");
                    }
                    break;
                case 4:
                    System.out.println("Facility Management    :\n" +
                            "1. Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Create new contracts\n" +
                            "4. Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu\n");
                    System.out.print("choose: ");
                    int chooseBooking = Integer.parseInt(scanner.nextLine());
                    switch (chooseBooking) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                           break;
                        default:
                            System.out.println("choose: 1, 2, 3, 4, 5, 6");
                    }
                    break;
                case 5:
                    System.out.println("Facility Management    :\n" +
                            "1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu\n");
                    System.out.print("choose: ");
                    int choosePromotion  = Integer.parseInt(scanner.nextLine());
                    switch (choosePromotion) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("choose: 1, 2, 3, 4, 5, 6");
            }
        } while (flag);
    }
}
