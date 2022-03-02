package ss10_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.HashMap;
import java.util.Map;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Under thE weather ";

        String[] arr = str.toLowerCase().split("");

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

