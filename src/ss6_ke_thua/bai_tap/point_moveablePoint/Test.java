package ss6_ke_thua.bai_tap.point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2);
        System.out.println(movablePoint);
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
