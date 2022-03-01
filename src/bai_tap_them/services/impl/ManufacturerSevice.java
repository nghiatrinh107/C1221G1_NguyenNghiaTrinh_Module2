package bai_tap_them.services.impl;

import bai_tap_them.models.Manufacturer;

import java.util.ArrayList;

public class ManufacturerSevice {
    private static ArrayList<Manufacturer> manufacturerArrayList = new ArrayList<>();
    static {
        manufacturerArrayList.add(new Manufacturer("HSX-001","Yamaha","Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-002","Honda","Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-003","Dongfeng","Trung Quốc"));
        manufacturerArrayList.add(new Manufacturer("HSX-004","Huynda","Hàn Quốc"));
        manufacturerArrayList.add(new Manufacturer("HSX-005","Ford","Mỹ"));
        manufacturerArrayList.add(new Manufacturer("HSX-006","Toyota","Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-007","Hino","Nhật Bản"));
    }
    public static void displayManufacturerName(){
        for (int i = 0; i < manufacturerArrayList.size(); i++) {
            System.out.print(manufacturerArrayList.get(i).getCode()+": "+manufacturerArrayList.get(i).getManufacturer()+ "\n");
        }
    }

    public static Manufacturer getManufacturerArrayList(String code) {
        for (int i = 0; i < manufacturerArrayList.size(); i++) {
            if (manufacturerArrayList.get(i).getCode().equals(code)){
                return manufacturerArrayList.get(i);
            }
        }
        return manufacturerArrayList.get(0);
    }
}
