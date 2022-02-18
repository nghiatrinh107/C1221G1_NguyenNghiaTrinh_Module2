package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "qwertqweqqrte";
        int count = 0;
        System.out.println("Nhập kí tự cần đếm: ");
        char kyTu = scanner.nextLine().charAt(0);
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println("kí tự " + kyTu + " xuất hiện " + count +" lần");
    }

}
