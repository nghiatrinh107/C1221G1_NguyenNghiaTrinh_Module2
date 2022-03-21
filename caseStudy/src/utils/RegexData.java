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

    private static final String POSITIVE_INTEGERS_REGEX = "^\\+*\\d+$";
//    private static final String POSITION_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
//    private static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
//    private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|202[12])$";
//    private static final String DATE_REGEX = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
//    private static final String EMPLOYEE_ID_REGEX = "^E\\d{5}$";
//    private static final String CUSTOMER_ID_REGEX = "^C\\d{5}$";
//    private static final String SALARY_REGEX = "\\d{7,}(\\.\\d+)*$";
//    private static final String GENDER_REGEX = "^[a-zA-Z]+$";
//    private static final String ID_REGEX = "^\\d{9}|\\d{12}$";
//    private static final String TELEPHONE_NUMBER_REGEX = "^[01]\\d{9}$";
//    private static final String EMAIL_ADDRESS_REGEX = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+){2,}(\\.\\w{2,3})?";
//    private static final String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
//    private static final String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
//    private static final String AREA_REGEX = "^([3-9]\\d+(.\\d+)?)|[1-9](\\d){2,}(.\\d+)?$";
//    private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
//    private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
//    private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
//    private static final String STANDARD_NAME_REGEX = "^[A-Z]\\w+$";
//    private static final String MAXIMUM_PEOPLE_REGEX = "^([1-9]|(1\\d))$";
//    private static final String BOOKING_CODE_REGEX = "^B\\d{6}$";

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
