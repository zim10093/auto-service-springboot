package core.autoserviceapp.service;

import core.autoserviceapp.model.Car;

public interface CarService {
    Car getById(Long id);

    Car save(Car car);

    Car update(Long id, Car car);
}
