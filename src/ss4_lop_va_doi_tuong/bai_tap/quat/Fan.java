package ss4_lop_va_doi_tuong.bai_tap.quat;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String fan = "";
        if (this.isOn()) {
            fan += ("Fan is on\n");
            fan += ("Speed: " + this.speed + "\n");
        } else {
            fan += ("Fan is off\n");
        }
        fan += ("Color: " + this.color + "\n");
        fan += ("Radius: " + this.radius + "\n");
        return fan;

    }

}
