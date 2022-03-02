package ss12_map_tree.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static ProductManager product = new ProductManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. add \n" +
                    "2. edit\n" +
                    "3. delete \n" +
                    "4. display \n" +
                    "5. search \n" +
                    "6. sort\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    System.out.println("edit Name or edit value: \n" +
                            "1. edit name \n" +
                            "2. edit value");
                    System.out.print("choose: ");
                    int edit = Integer.parseInt(scanner.nextLine());
                    switch (edit) {
                        case 1:
                            product.editName();
                            break;
                        case 2:
                            product.editValue();
                            break;
                        default:
                            System.out.println("choose: 1, 2");
                    }
                    break;
                case 3:
                    product.deleteProduct();
                    break;
                case 4:
                    product.displayProduct();
                    break;
                case 5:
                    product.search();
                    break;
                case 6:
                    System.out.println("sort up or sort down \n" +
                            "1 sort up \n" +
                            "2 sort down");
                    System.out.print("choose: ");
                    int sort = Integer.parseInt(scanner.nextLine());
                    switch (sort) {
                        case 1:
                            product.sortUp();
                            break;
                        case 2:
                            product.sortDown();
                            break;
                        default:
                            System.out.println("choose: 1, 2");
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("choose:0, 1, 2, 3, 4, 5, 6");
            }
        } while (flag);
    }
}
