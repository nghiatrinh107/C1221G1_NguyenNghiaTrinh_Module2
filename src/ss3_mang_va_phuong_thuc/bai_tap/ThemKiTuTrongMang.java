package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemKiTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {10,4,3,7,8,6,7,7,5,3,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí muốn chèn vào");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cần thây đổi");
        int number = Integer.parseInt(scanner.nextLine());
        if(index <= -1 || index >= arr.length-1) {
            System.out.println("Không thể chèn phần tử vào mảng");
        }else {
            for (int i = 1; i <arr.length-index ; i++) {
                    arr[arr.length-i] = arr[(arr.length -i-1)];
            }
            arr[index]=number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
