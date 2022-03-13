package ss19_string_and_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class PhoneValidation {
    public static boolean phoneValidation(String phoneNumber) {
        String regex = "^\\d{2}-[0]\\d{9}$";
        return phoneNumber.matches(regex);
    }
    public static void main(String[] args) {
        PhoneValidation phoneValidation = new PhoneValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Phone number: ");
        String phoneNumber = scanner.nextLine();

        if (phoneValidation(phoneNumber)) {
            System.out.println(phoneNumber + " is valid");
        } else {
            System.out.println(phoneNumber + " is invalid");
        }
    }
}
