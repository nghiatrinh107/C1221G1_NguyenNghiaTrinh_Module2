package ss17_io_binary_file_serialization.bai_tap.controllers;

import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.services.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    private int id, price;
    private String productName, manufacturer;
    Scanner scanner = new Scanner(System.in);
    ProductServiceImpl productServiceImpl = new ProductServiceImpl();

    public void addNewProduct() {
        System.out.print("enter id product");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("enter name product");
        productName = scanner.nextLine();
        System.out.print("enter manufacturer.csv");
        manufacturer = scanner.nextLine();
        System.out.print("enter price");
        price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, productName, manufacturer, price);
        productServiceImpl.create(product);
    }

    public void displayProduct() {
        productServiceImpl.read();
    }

    public void searchProduct() {
        System.out.println("enter id");
        id = Integer.parseInt(scanner.nextLine());
        productServiceImpl.search(id);
    }
}
