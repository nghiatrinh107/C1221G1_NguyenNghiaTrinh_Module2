package ss12_map_tree.bai_tap;

public class Product {
    private int id;
    private String nameProduct;
    private int value;

    public Product() {
    }

    public Product(int id, String nameProduct, int value) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", value=" + value +
                '}'+ "\n";
    }
}
