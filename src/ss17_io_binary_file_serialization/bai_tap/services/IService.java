package ss17_io_binary_file_serialization.bai_tap.services;

import ss17_io_binary_file_serialization.bai_tap.models.Product;

public interface IService {
    void create(Product product);
    void read();
    void edit();
    void delete();
    void search(int id);
}
