package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.OrderStatus;
import core.autoserviceapp.model.dto.request.AddGoodsToOrderRequestDto;
import core.autoserviceapp.model.dto.request.ChangeOrderStatusDto;
import core.autoserviceapp.model.dto.request.OrderRequestDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import core.autoserviceapp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ToModelMapper<OrderRequestDto, Order> toOrderMapper;
    private final ToDtoMapper<OrderResponseDto, Order> toOrderDtoMapper;
    private final ToModelMapper<ChangeOrderStatusDto, OrderStatus> toOrderStatusMapper;

    @GetMapping("/{id}")
    public OrderResponseDto getOrderCost(@PathVariable Long id) {
        return toOrderDtoMapper.toDto(orderService.getOrderCost(id));
    }

    @PostMapping
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto dto) {
        return toOrderDtoMapper.toDto(orderService.save(toOrderMapper.toModel(dto)));
    }

    @PostMapping("/{id}")
    public OrderResponseDto addGoodsToOrder(@PathVariable Long id,
                                            @RequestBody AddGoodsToOrderRequestDto dto) {
        return toOrderDtoMapper.toDto(orderService.addGoodsToOrder(id, dto.getGoodsId()));
    }

    @PutMapping("/{id}")
    public OrderResponseDto updateOrder(@PathVariable Long id, @RequestBody OrderRequestDto dto) {
        return toOrderDtoMapper.toDto(orderService.update(id, toOrderMapper.toModel(dto)));
    }

    @PutMapping("/{id}/status")
    public OrderResponseDto updateOrderStatus(@PathVariable Long id, ChangeOrderStatusDto dto) {
        return toOrderDtoMapper.toDto(orderService.changeStatus(id,
                toOrderStatusMapper.toModel(dto)));
    }
}
