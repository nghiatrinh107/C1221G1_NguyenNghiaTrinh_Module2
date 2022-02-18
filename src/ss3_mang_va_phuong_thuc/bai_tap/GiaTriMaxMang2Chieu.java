package ss3_mang_va_phuong_thuc.bai_tap;

public class GiaTriMaxMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 6, 7, 8},
                {7, 4, 666, 11},
                {10, 1, 5, 33, 888},

        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The largest property value in the list is " + max);
    }
}
