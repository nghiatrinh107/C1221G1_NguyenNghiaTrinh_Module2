package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonController {
    Scanner scanner =new Scanner(System.in);
    private static List<String> genders = new ArrayList();
    static {
        genders.add(new String("MALE"));
        genders.add(new String("FEMALE"));
    }

    public void addNewPerson(){
        System.out.println("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Birthday: ");
        String birthday = scanner.nextLine();
        for (int i = 0; i <genders.size() ; i++) {
            System.out.println(i + " " +genders.get(i));
        }
        System.out.println("Gender: ");
        int indexGender = Integer.parseInt(scanner.nextLine());
        String gender = genders.get(indexGender);
        System.out.println("Identity Card");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Phone");
        String phone = scanner.nextLine();
    }
}
