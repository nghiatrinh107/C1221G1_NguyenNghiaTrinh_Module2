package oop_review.bank;

import java.util.Scanner;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double tien;
    private final double LAISUAT = 0.035;
    Scanner scanner = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTaiKhoan = soTaiKhoan;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double tien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.tien = tien;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", tien=" + tien +
                '}';
    }

    public double napTien() {
        System.out.println("số tiền muốn nạp: ");
        double napTien = Double.parseDouble(scanner.nextLine());
        if (napTien > 0) {
            setTien(getTien() + napTien);
        } else {
            System.out.println("số tiền nộp không hợp lệ: ");
        }
        return getTien();
    }
    public double rutTien(){
        final double PHI = 1;
        System.out.println("Số tiền muốn rút: ");
        double rutTien = Double.parseDouble(scanner.nextLine());
        if (getTien()>(rutTien+PHI)){
            setTien(getTien()-rutTien-PHI);
        }else {
            System.out.println("số tiền nhập không hợp lệ");
        }
        return getTien();
    }
    public double daoHan(){
        setTien(getTien()+getTien()*LAISUAT);
        return getTien();
    }
    public double chuyenTien(){
        System.out.println("sô tiền cần chuyển");
        rutTien();
        return getTien();
    }
}
