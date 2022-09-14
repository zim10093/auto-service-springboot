package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Car;
import core.autoserviceapp.model.dto.request.CarRequestDto;
import core.autoserviceapp.service.CarOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarRequestMapper implements ToModelMapper<CarRequestDto, Car> {
    private final CarOwnerService carOwnerService;

    @Override
    public Car toModel(CarRequestDto dto) {
        Car car = new Car();
        car.setManufacturer(dto.getManufacturer());
        car.setModel(dto.getModel());
        car.setYear(dto.getYear());
        car.setLicenseNumber(dto.getLicenseNumber());
        car.setCarOwner(carOwnerService.getById(dto.getCarOwnerId()));
        return car;
    }
}
