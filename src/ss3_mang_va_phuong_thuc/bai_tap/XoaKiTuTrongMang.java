package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;

public class XoaKiTuTrongMang {
    public static void main(String[] args) {
        int[] number = {10,4,3,7,8,6,7,7,5,3};
        int x = 3;
        for (int i = 0; i <number.length ; i++) {
            if (number[number.length-1] == x){
                number[number.length-1]=0;
            }
            if(number[i] == x ){
                number[i] = number[i+1];
                for (int j = i; j <number.length-1 ; j++) {
                    number[j] = number[j+1];
                }
                number[number.length-1]=0;
                i--;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
