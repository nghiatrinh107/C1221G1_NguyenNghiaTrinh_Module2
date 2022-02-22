package lam_thu_bai_tap.manager_student;

import java.util.Scanner;

public class TestStudentManager {
    static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Main Menu:\n"+
                    "1. add\n"+
                    "2. display\n"+
                    "3. edit\n"+
                    "4. delete\n"+
                    "5. exit\n");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1 :
                    break;
                case 2:
                    System.out.println("display student");
                    studentManager.showisStudent();
            }
        }while (flag);
    }
}
