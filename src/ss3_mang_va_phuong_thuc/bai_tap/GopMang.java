package ss3_mang_va_phuong_thuc.bai_tap;


import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {6,7,8,9};
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i <array1.length ; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i <array2.length ; i++) {
            array[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
