package services.impl.facility;

import models.facility.Room;
import models.facility.Villa;
import services.VillaService;

import java.util.ArrayList;
import java.util.List;

public class VillaServiceImpl implements VillaService {
    private static List<Villa> villaList = new ArrayList<>();

    public  List<Villa> getVillaList() {
        return villaList;
    }

    public  void setVillaList(List<Villa> villaList) {
        VillaServiceImpl.villaList = villaList;
    }

    @Override
    public void display() {
        for (int i = 0; i <villaList.size() ; i++) {
            System.out.println(villaList.get(i));
        }
    }

    @Override
    public void add(Villa villa) {
        villaList.add(villa);
    }

    @Override
    public void edit(int id) {

    }
}
