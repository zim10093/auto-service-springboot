package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Car;
import core.autoserviceapp.model.dto.response.CarResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CarResponseMapper implements ToDtoMapper<CarResponseDto, Car> {
    @Override
    public CarResponseDto toDto(Car car) {
        CarResponseDto dto = new CarResponseDto();
        dto.setId(car.getId());
        dto.setManufacturer(car.getManufacturer());
        dto.setModel(car.getModel());
        dto.setYear(car.getYear());
        dto.setLicenseNumber(car.getLicenseNumber());
        dto.setCarOwnerId(car.getCarOwner().getId());
        return dto;
    }
}
