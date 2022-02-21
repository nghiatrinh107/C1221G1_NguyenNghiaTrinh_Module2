package ss4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double numberA, numberB, numberC, delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getDiscriminant() {
        return delta = this.numberB * this.numberB - (4 * this.numberA * numberC);
    }

    public double getRoot1() {
        double result;
        return result = (-this.numberB + Math.pow(delta, 0.5)) / (2 * this.numberA);
    }
    public double getRoot2() {
        double result;
        return result = (-this.numberB - Math.pow(delta, 0.5)) / (2 * this.numberA);
    }
}
