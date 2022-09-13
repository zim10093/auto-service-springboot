package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.CarOwner;
import core.autoserviceapp.model.dto.request.CarOwnerRequestDto;
import core.autoserviceapp.service.CarService;
import core.autoserviceapp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarOwnerRequestMapper implements ToModelMapper<CarOwnerRequestDto, CarOwner> {
    private final CarService carService;
    private final OrderService orderService;

    @Override
    public CarOwner toModel(CarOwnerRequestDto dto) {
        CarOwner carOwner = new CarOwner();
        carOwner.setName(dto.getName());
        carOwner.setCars(carService.findAllByIds(dto.getCarIds()));
        carOwner.setOrders(orderService.findAllById(dto.getOrderIds()));
        return carOwner;
    }
}
