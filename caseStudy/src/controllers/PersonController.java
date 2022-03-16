package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonController {
    protected int id;
    protected String fullName;
    protected String birthday;
    protected String gender;
    protected int identityCard;
    protected String email;
    protected String phone;
    Scanner scanner =new Scanner(System.in);
    private static List<String> genders = new ArrayList();
    static {
        genders.add(new String("MALE"));
        genders.add(new String("FEMALE"));
    }

    public void addNewPerson(){
        System.out.println("Id: ");
         id = Integer.parseInt(scanner.nextLine());
        System.out.println("Full name: ");
         fullName = scanner.nextLine();
        System.out.println("Birthday: ");
         birthday = scanner.nextLine();
        for (int i = 0; i <genders.size() ; i++) {
            System.out.println(i + " " +genders.get(i));
        }
        System.out.println("Gender: ");
        int indexGender = Integer.parseInt(scanner.nextLine());
         gender = genders.get(indexGender);
        System.out.println("Identity Card");
        identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Email");
        email = scanner.nextLine();
        System.out.println("Phone");
        phone = scanner.nextLine();
    }
}
