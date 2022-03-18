package services;

import models.facility.Villa;

public interface VillaService extends Service<Villa> {
    @Override
    void add(Villa villa);
}
