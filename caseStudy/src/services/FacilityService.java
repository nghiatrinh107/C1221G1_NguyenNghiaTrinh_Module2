package services;

import models.facility.Facility;

public interface FacilityService extends Service<Facility> {
    @Override
    void add(Facility facility);
}
