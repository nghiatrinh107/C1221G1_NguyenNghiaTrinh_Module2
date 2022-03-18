package utils;

import java.util.Scanner;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);
//    public static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
//    public static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";
//    public static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
//    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
//    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    public static final String REGEX_AREA = "^([3-9]\\d(\.\d+)?|[1-9]\\d{2,})$";
//    public static final String REGEX_RATE = "^\\+?\\d*$";

    public static String regexString(String temp, String regex, String error) {
        boolean check = false;
        do {
            if (temp.matches(regex)) {
                check = true;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (!check);
        return temp;
    }
}
