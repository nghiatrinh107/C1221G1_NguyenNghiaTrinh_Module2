package ss7.bai_tap.interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(2);
        shapes[1]=new Rectangle(2,4);
        shapes[2]=new Square(2);
        System.out.println("Pre-sorted:");
        for (Shape shape:shapes){
            System.out.println(shape);
        }
        for (Shape shape:shapes){
            shape.resize((Math.random()*((100 - 1)+1) +1));
        }
        System.out.println("After-sorted:");
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
}
