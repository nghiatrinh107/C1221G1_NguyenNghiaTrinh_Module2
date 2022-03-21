package controllers;

import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.impl.facility.FacilityServiceImpl;
import services.impl.facility.HouseServiceImpl;
import services.impl.facility.RoomServiceImpl;
import services.impl.facility.VillaServiceImpl;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityController {
    private String idFacility;
    private String hotelService;
    private Double roomArea;
    private int rate;
    private int maximumCapacity;
    private String rentStyle;
    private int choice = -1;
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    HouseServiceImpl houseService = new HouseServiceImpl();
    RoomServiceImpl roomService = new RoomServiceImpl();
    VillaServiceImpl villaService = new VillaServiceImpl();
    public static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
    public static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";
    public static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_RATE = "^\\+?\\d*$";
    Scanner scanner = new Scanner(System.in);

    public void addFacility() {
        System.out.println("Hotel Service: capital first letter)");
        hotelService = inputName();
        System.out.println("Room Area: Area > 30");
        roomArea = Double.parseDouble(inputArea());
        System.out.println("Rate: ");
        rate = Integer.parseInt(inputRate());
        System.out.println("Maximum Capacity");
        maximumCapacity = Integer.parseInt(scanner.nextLine());
        do {
            for (int i = 0; i < rentStyles.size(); i++) {
                System.out.println(i + " " + rentStyles.get(i));
            }
            System.out.println("rentStyle");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice > rentStyles.size());
        rentStyle = rentStyles.get(choice);
    }

    public void addNewVilla() {
        idFacility = inputIdVilla();
        addFacility();
        System.out.println("kindOfRoom: capital first letter ");
        String kindOfRoom = inputName();
        System.out.println("floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility, hotelService, roomArea, rate, maximumCapacity, rentStyle, kindOfRoom, floor);
        facilityService.add(villa);
        villaService.add(villa);
        System.out.println("Add Complete !");
    }

    public void addNewHouse() {
        idFacility = inputIdHouse();
        addFacility();
        System.out.println("Kind Of House: capital first letter ");
        String kindOfHouse = inputName();
        System.out.println("Swimming Pool: area > 30 ");
        double swimmingPool = Double.parseDouble(inputArea());
        System.out.println("floor: ");
        int floor = Integer.parseInt(inputRate());
        House house = new House(idFacility, hotelService, roomArea, rate, maximumCapacity, rentStyle, kindOfHouse, swimmingPool, floor);
        facilityService.add(house);
        houseService.add(house);
        System.out.println("Add Complete !");
    }

    public void addNewRoom() {
        inputIdRoom();
        addFacility();
        System.out.println("complimentary: ");
        String complimentary = scanner.nextLine();
        Room room = new Room(idFacility, hotelService, roomArea, rate, maximumCapacity, rentStyle, complimentary);
        facilityService.add(room);
        roomService.add(room);
        System.out.println("Add Complete !");
    }

    public void addNewFacility() {

        System.out.println("Add new facility:\n" +
                "1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room \n" +
                "4. Back to menu\n");
        System.out.print("choose: ");
        int chooseMenu = Integer.parseInt(scanner.nextLine());
        switch (chooseMenu) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                break;
            default:
                System.out.println("choose: 1, 2, 3, 4");
        }
    }

    public void display() {
        houseService.display();
        roomService.display();
        villaService.display();
    }

    private String inputIdVilla() {
        System.out.println("Id (SVVL-xxx)");
        return RegexData.regexString(scanner.nextLine(), REGEX_ID_VILLA, "Fail! ID Format: SVVL-xxxx");
    }

    private String inputIdHouse() {
        System.out.println("Id (SVHO-xxx)");
        return RegexData.regexString(scanner.nextLine(), REGEX_ID_HOUSE, "Fail! ID Format: SVHO-xxxx");
    }

    private String inputIdRoom() {
        System.out.println("Id (SVRO-xxx)");
        return RegexData.regexString(scanner.nextLine(), REGEX_ID_ROOM, "Fail! ID Format: SVRO-xxxx");
    }

    private String inputName() {
        return RegexData.regexString(scanner.nextLine(), REGEX_NAME, "Fail! Format: Xxxx Xxxx");
    }

    private String inputArea() {
        return RegexData.regexString(scanner.nextLine(), REGEX_AREA, "Fail! Area > 30 ");
    }

    private String inputRate() {
        return RegexData.regexString(scanner.nextLine(), REGEX_RATE, "Fail! Rate > 0 ");
    }

    private static List<String> rentStyles = new ArrayList();

    static {
        rentStyles.add(new String("hour"));
        rentStyles.add(new String("day"));
        rentStyles.add(new String("month"));
        rentStyles.add(new String("year"));
    }
}

