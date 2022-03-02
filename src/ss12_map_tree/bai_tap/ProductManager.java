package ss12_map_tree.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private static ArrayList<Product> productArrayList = new ArrayList<>();
    static {
        productArrayList.add(new Product(1,"may 1",500));
        productArrayList.add(new Product(2,"may 2",300));
        productArrayList.add(new Product(3,"may 4",600));
        productArrayList.add(new Product(4,"may 3",800));
    }
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name Product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("enter value: ");
        int value = Integer.parseInt(scanner.nextLine());
        productArrayList.add(new Product(id, nameProduct, value));
    }

    public void displayProduct() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i));
        }
    }

    public void editName() {
        System.out.println("id edit: ");
        int idEditName = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == idEditName){
                System.out.println(productArrayList.get(i));
                System.out.println("edit Name");
                String newName = scanner.nextLine();
                productArrayList.get(i).setNameProduct(newName);
            }
        }
    }
    public void editValue() {
        System.out.println("id edit: ");
        int idEditName = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == idEditName){
                System.out.println(productArrayList.get(i));
                System.out.println("edit Value");
                String newValue = scanner.nextLine();
                productArrayList.get(i).setNameProduct(newValue);
            }
        }
    }
    public void deleteProduct(){
        System.out.println("id edit");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <productArrayList.size() ; i++) {
            if(productArrayList.get(i).getId() == idDelete){
                productArrayList.remove(productArrayList.get(i));
            }
        }
    }
    public void search(){
        System.out.println("search name: ");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i <productArrayList.size() ; i++) {
            if(productArrayList.get(i).getNameProduct().equals(nameSearch)){
                System.out.println(productArrayList.get(i));
            }
        }
    }
    public void sortUp(){
        productArrayList.sort(new SortUp());
        System.out.println(productArrayList);
    }
    public void sortDown(){
        productArrayList.sort(new SortDown());
        System.out.println(productArrayList);
    }
}
