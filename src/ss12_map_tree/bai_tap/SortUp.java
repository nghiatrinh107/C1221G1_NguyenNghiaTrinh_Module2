package ss12_map_tree.bai_tap;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getValue() -o2.getValue());
    }
}
