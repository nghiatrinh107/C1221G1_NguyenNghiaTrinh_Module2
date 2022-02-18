package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoMotCot {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[][] array;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size row:");
            size1 = scanner.nextInt();
            System.out.print("Enter a size col:");
            size2 = scanner.nextInt();
            if (size1 > 20 || size2 >20)
                System.out.println("Size should not exceed 20");
        } while (size1 > 20 || size2 >20);
        array = new int[size1][size2];
        for (int i = 0; i <size1 ; i++) {
            for (int j = 0; j <size2 ; j++) {
                System.out.print("Enter element" + (j + 1) + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Nhập cột cần tính");
        int col= scanner.nextInt();
        for (int i = 0; i <array.length ; i++) {
                sum += array[i][col];
            }
        System.out.println(sum);
    }
}
