package services.impl.facility;

import models.facility.House;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl implements services.HouseService {
    private static List<House> houseList = new ArrayList<>();
    static final String HOUSE_CSV = "src\\data\\house.csv";

    static {
        houseList = ReadAndWrite.readHouseListFromCSV(HOUSE_CSV);
    }
    public HouseServiceImpl() {
    }

    public  List<House> getHouseList() {
        return houseList;
    }

    public  void setHouseList(List<House> houseList) {
        HouseServiceImpl.houseList = houseList;
    }

    @Override
    public void display() {
        for (int i = 0; i <houseList.size() ; i++) {
            System.out.println(houseList.get(i));
        }
    }

    @Override
    public void add(House house) {
        houseList.add(house);
        ReadAndWrite.writeListFacilityToCSV(HOUSE_CSV,houseList);
    }


}
