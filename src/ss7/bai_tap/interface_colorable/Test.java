package ss7.bai_tap.interface_colorable;


public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(2);
        shapes[2] = new Rectangle(2, 4);
        shapes[3] = new Square(2);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println(shape);
        }
    }
}
