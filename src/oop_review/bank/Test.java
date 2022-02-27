package oop_review.bank;

import java.util.Scanner;

public class Test {
    private static Account[] accounts = new Account[4];

    static {
        accounts[0] = new Account(1, "trinh", 50000);
        accounts[1] = new Account(2, "binh", 60000);
        accounts[2] = new Account(3, "hinh", 20000);
        accounts[3] = new Account(4, "vinh", 800000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("nhập số tài khoản");
        int soTaiKhoan = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("Main Menu:\n" +
                    "1. thông tin khách hàng\n" +
                    "2. Nạp tiền\n" +
                    "3. rút tiền\n" +
                    "4. đáo hạn\n" +
                    "5. chuyển tiền\n" +
                    "6. exit\n");
            System.out.println("nhập số để chọn: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getSoTaiKhoan() == soTaiKhoan) {
                            System.out.println(accounts[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getSoTaiKhoan() == soTaiKhoan) {
                            accounts[i].napTien();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getSoTaiKhoan() == soTaiKhoan) {
                            accounts[i].rutTien();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getSoTaiKhoan() == soTaiKhoan) {
                            accounts[i].daoHan();
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < accounts.length; i++) {
                        System.out.println("nhập số tài khoản bạn muốn: ");
                        int soTaiKhoanChuyen = Integer.parseInt(scanner.nextLine());
                        if (accounts[i].getSoTaiKhoan() == soTaiKhoan) {
                            accounts[i].chuyenTien();
                        }
                        for (int j = 0; j < accounts.length; j++) {
                            if (accounts[j].getSoTaiKhoan() == soTaiKhoanChuyen){
                                accounts[j].napTien();
                            }
                        }
                    }
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("chọn: 0, 1, 2 , 3 , 4 , 5");
            }
        } while (flag);
    }
}

