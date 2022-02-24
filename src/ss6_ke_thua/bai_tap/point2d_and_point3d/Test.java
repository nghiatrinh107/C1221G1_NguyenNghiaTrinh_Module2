package ss6_ke_thua.bai_tap.point2d_and_point3d;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x:");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập y:");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập z:");
        float z = Float.parseFloat(scanner.nextLine());
        Point2D point2D = new Point2D(x,y);
        Point3D point3D = new Point3D(x,y,z);
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
