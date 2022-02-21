package ss4_lop_va_doi_tuong.bai_tap.quat;

public class Test {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan(Fan.FAST, true, "yellow", 10);
        Fan fan2 = new Fan(2, false, "blue", 5);
        System.out.println(fan);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
