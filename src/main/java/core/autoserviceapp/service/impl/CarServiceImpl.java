package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Car;
import core.autoserviceapp.repository.CarRepository;
import core.autoserviceapp.service.CarService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public Car getById(Long id) {
        return carRepository.getReferenceById(id);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car update(Long id, Car car) {
        car.setId(id);
        return carRepository.save(car);
    }

    @Override
    public List<Car> findAllByIds(Iterable<Long> ids) {
        return carRepository.findAllById(ids);
    }
}
