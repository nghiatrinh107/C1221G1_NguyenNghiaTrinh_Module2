package ss2_vong_lap_va_mang.bai_tap;

import java.util.Scanner;

public class HaiMuoiSoNguyenTo {
    public static void main(String[] args) {
        int numberCheck = 2;
        int count = 0;
        StringBuilder result = new StringBuilder();
        while (count <20){
            boolean flag =true;
            if (numberCheck < 2){
                flag = false;
            }else {
                for (int i = 2; i < numberCheck; i++) {
                    if (numberCheck % i == 0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                count++;
                String numbers = Integer.toString(numberCheck);
                result.append(numbers);
                result.append(" ");
            }
            numberCheck++;
        }
        System.out.println(result);
    }
}
