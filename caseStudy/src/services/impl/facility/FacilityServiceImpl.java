package services.impl.facility;

import models.facility.Facility;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    protected int idFacility;
    protected String hotelService;
    private double roomArea;
    private int rate;
    private int maximumCapacity;
    private String rentStyle;
    private static Map<Facility, Integer > facilityMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityMap;
    }

    public static void setFacilityIntegerMap(Map<Facility, Integer> facilityIntegerMap) {
        FacilityServiceImpl.facilityMap = facilityIntegerMap;
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element:facilityMap.entrySet()) {
            System.out.println("Service " + element.getKey() + "Times of used" +element.getValue());
        }
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public void edit(int id) {

    }
}
