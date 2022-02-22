package ss2_vong_lap_va_mang.bai_tap;

import java.util.Scanner;

public class MenuHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông dưới");
            System.out.println("3. Hình tam giác vuông trên");
            System.out.println("4. Hinh tam giác cân");
            System.out.println("5. Hình tam giác vuông bên phải  trên ");
            System.out.println("6. Hình tam giác vuông bên phải dưới");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 6; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int q = 1; q <= i * 2 - 1; q++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (j <= i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();

                    }
                    break;
                case 6:
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 0; j < 6; j++) {
                            if (j <= i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không chọn");
            }
        }
    }
}
