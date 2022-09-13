package core.autoserviceapp.service;

import core.autoserviceapp.model.CarOwner;

public interface CarOwnerService {
    CarOwner save(CarOwner carOwner);

    CarOwner update(Long id, CarOwner carOwner);

    CarOwner getById(Long id);
}
