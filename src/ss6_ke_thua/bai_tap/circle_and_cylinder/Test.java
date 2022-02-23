package ss6_ke_thua.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập chiều cao: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập màu sắc: ");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius,color);
        Circle cylinder1 = new Cylinder(radius,height);
        Cylinder cylinder = new Cylinder(radius,height,color);
        System.out.println("nhập bán kính: ");
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }
}
