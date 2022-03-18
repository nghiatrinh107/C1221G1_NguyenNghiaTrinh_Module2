package libs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeLib {
    public static List<String> degrees = new ArrayList<>();
    static {
        degrees.add(new String("INTERMEDIATE"));
        degrees.add(new String("ASSOCIATE"));
        degrees.add(new String("UNIVERSITY"));
        degrees.add(new String("POSTGRADUATE"));
    }
    public static List<String> positions = new ArrayList<>();
    static {
        positions.add(new String("RECEPTIONIST"));
        positions.add(new String("WAITER"));
        positions.add(new String("SPECIALIST"));
        positions.add(new String("SUPERVISOR"));
        positions.add(new String("MANAGER"));
        positions.add(new String("DIRECTOR"));
    }

    public static void display(List<String> list){
        int index = 0;
        for (String element:list             ) {
            System.out.printf("[%d] - %s\n",index++,element);
        }
    }
//    public static String getElementByIndex(List<String> list,int index){
//
//    }
}
