package ss12_map_tree.bai_tap;

import java.util.Comparator;

public class SortDown implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getValue() -o1.getValue());
    }
}
