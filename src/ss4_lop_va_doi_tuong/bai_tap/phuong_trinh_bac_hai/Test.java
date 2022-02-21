package ss4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A * x^2 + B*x + C = 0 (A != 0)");
        System.out.print("enter the number A:");
        double numberA = Double.parseDouble(scanner.nextLine());
        System.out.print("enter the number B:");
        double numberB = Double.parseDouble(scanner.nextLine());
        System.out.print("enter the number C:");
        double numberC = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm chung x1 = x2 = " + -(numberB / (2 * numberA)));
        }else if(quadraticEquation.getDiscriminant() > 0){
            System.out.println("Phương trình có hai nghiệm là x1 = " + quadraticEquation.getRoot1() +" và x2 = " + quadraticEquation.getRoot2());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
