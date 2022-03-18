package services;

import models.facility.House;

public interface HouseService extends Service<House> {
    @Override
    void add(House house);
}
