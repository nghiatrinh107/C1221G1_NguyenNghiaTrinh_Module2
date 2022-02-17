package ss2_vong_lap_va_mang.bai_tap;

public class TramSoNguyenTo {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < 100 ; i++) {
            int j = 2 ;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if(check){
                String number = Integer.toString(i);
                result.append(number + " ");
            }
        }
        System.out.println(result);
    }

}
