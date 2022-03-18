package utils;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import models.person.Customer;
import models.person.Employee;
import models.person.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> readEmployeeListFromCSV(String filePath) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                        Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public static List<Customer> readCustomerListFromCSV(String filePath) {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Customer customer = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                        Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public static List<Room> readRoomListFromCSV(String filePath) {
        List<Room> roomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6]);
                roomList.add(room);
            }
        }
        return roomList;
    }

    public static List<House> readHouseListFromCSV(String filePath) {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                houseList.add(house);
            }
        }
        return houseList;
    }

    public static List<Villa> readVillaListFromCSV(String filePath) {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
                villaList.add(villa);
            }
        }
        return villaList;
    }

    public static void writeListPersonToCSV(String filePath, List<? extends Person> personList) {
        List<String> stringList = new ArrayList<>();
        for (Person person : personList) {
            stringList.add(person.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListFacilityToCSV(String filePath, List<? extends Facility> facilityList) {
        List<String> stringList = new ArrayList<>();
        for (Facility facility : facilityList) {
            stringList.add(facility.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }


}
