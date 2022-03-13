package ss17_io_binary_file_serialization.bai_tap.view;

import ss17_io_binary_file_serialization.bai_tap.controllers.ProductController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();
            do {
                System.out.println("MENU");
                System.out.println(
                        "1. Thêm sản phẩm\n" +
                                "2. Hiển thị sản phẩm\n" +
                                "3. Tìm kiếm sản xuất\n" +
                                "4. quay về menu"
                );
                System.out.println("nhập lựa chọn");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        productController.addNewProduct();
                        break;
                    case 2:
                        productController.displayProduct();
                        break;
                    case 3:
                        productController.searchProduct();
                        break;
                    case 4:
                        break;
                    default:
                        System.err.println("wrong choice !");
                }
            } while (choice != 5);
        }
}
