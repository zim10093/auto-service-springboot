package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.CarOwner;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.dto.request.CarOwnerRequestDto;
import core.autoserviceapp.model.dto.response.CarOwnerResponseDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import core.autoserviceapp.service.CarOwnerService;
import core.autoserviceapp.service.OrderService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car-owners")
@RequiredArgsConstructor
public class CarOwnerController {
    private final ToModelMapper<CarOwnerRequestDto, CarOwner> toCarOwnerMapper;
    private final ToDtoMapper<CarOwnerResponseDto, CarOwner> toCarOwnerDtoMapper;
    private final ToDtoMapper<OrderResponseDto, Order> toOrderDtoMapper;
    private final CarOwnerService carOwnerService;
    private final OrderService orderService;

    @GetMapping("/{id}/orders")
    public List<OrderResponseDto> getOrders(@PathVariable Long id) {
        return orderService.findAllByCarOwnerId(id).stream()
                .map(toOrderDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public CarOwnerResponseDto createCarOwner(@RequestBody CarOwnerRequestDto dto) {
        return toCarOwnerDtoMapper.toDto(carOwnerService.save(toCarOwnerMapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public CarOwnerResponseDto updateCarOwner(@PathVariable Long id,
                                              @RequestBody CarOwnerRequestDto dto) {
        return toCarOwnerDtoMapper.toDto(carOwnerService.update(id, toCarOwnerMapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public CarOwnerResponseDto getById(@PathVariable Long id) {
        return toCarOwnerDtoMapper.toDto(carOwnerService.getById(id));
    }
}
