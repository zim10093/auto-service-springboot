package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Car;
import core.autoserviceapp.model.CarOwner;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.dto.response.CarOwnerResponseDto;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class CarOwnerResponseMapper implements ToDtoMapper<CarOwnerResponseDto, CarOwner> {
    @Override
    public CarOwnerResponseDto toDto(CarOwner carOwner) {
        CarOwnerResponseDto dto = new CarOwnerResponseDto();
        dto.setId(carOwner.getId());
        dto.setName(carOwner.getName());
        dto.setCarIds(carOwner.getCars().stream()
                .map(Car::getId)
                .collect(Collectors.toList()));
        dto.setOrdersIds(carOwner.getOrders().stream()
                .map(Order::getId)
                .collect(Collectors.toList()));
        return dto;
    }
}
