package ss2_vong_lap_va_mang.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 0;
        System.out.println("Nhập số tiền gửi: ");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tháng gửi: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lãi suất:");
        interestRate = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i <month ; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
