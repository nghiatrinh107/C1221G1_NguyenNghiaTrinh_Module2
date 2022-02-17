package ss2_vong_lap_va_mang.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2){
            System.out.println(number + "không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");

        }
    }
}
