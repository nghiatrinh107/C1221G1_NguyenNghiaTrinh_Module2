package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiGia = 23000;
        System.out.println("Nhập số tiền USD");
        int tienUSD = Integer.parseInt(scanner.nextLine());
        int tienVN = tienUSD * tiGia;
        System.out.println("Số tiền VND là :  " + tienVN);
    }
}
