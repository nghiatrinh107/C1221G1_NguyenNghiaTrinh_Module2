package ss17_io_binary_file_serialization.bai_tap.services;

import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.util.ReadAndWriteProductFile;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IService {
    List<Product> productList = new ArrayList<>();

    @Override
    public void create(Product product) {
        productList.add(product);
        ReadAndWriteProductFile.writeProductFile(productList);
    }

    @Override
    public void read() {
        System.out.println(ReadAndWriteProductFile.readProDuctFile());
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search(int id) {
        this.read();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println(productList.get(i));
            }else {
                System.out.println("id is not exist");
            }
        }
    }
}
