package ss5_access_modifier_static_method_static_property.bai_tap.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Enter the radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        Circle circle1 = new Circle(radius);
        System.out.println("radius is: " + circle1.getRadius());
        System.out.println("Area is: " + circle1.getArea());
    }
}
