package ss19_string_and_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class ClassNameValidation {
    public static boolean classNameValidation(String className) {
        String regex = "^([ACP])\\d{4}([GHIKLM])$";
        return className.matches(regex);
    }
    public static void main(String[] args) {
        ClassNameValidation classNameValidation = new ClassNameValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Class name: ");
        String className = scanner.nextLine();

        if (classNameValidation(className)){
            System.out.println(className+ " is valid");
        }else {
            System.out.println(className+ " is invalid");
        }

    }
}
