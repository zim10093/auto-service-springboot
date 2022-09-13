package core.autoserviceapp.service;

import core.autoserviceapp.model.Car;
import java.util.List;

public interface CarService {
    Car getById(Long id);

    Car save(Car car);

    Car update(Long id, Car car);

    List<Car> findAllByIds(Iterable<Long> ids);
}
