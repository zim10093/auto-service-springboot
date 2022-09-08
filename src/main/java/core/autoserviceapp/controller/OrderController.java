package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.AddGoodsToOrderRequestDto;
import core.autoserviceapp.model.dto.request.ChangeOrderStatusDto;
import core.autoserviceapp.model.dto.request.OrderRequestDto;
import core.autoserviceapp.model.dto.response.OrderCostResponseDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
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
    @GetMapping("/{id}")
    public OrderCostResponseDto getOrderCost(@PathVariable long id) {
        return null;
        //TODO
    }

    @PostMapping
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto dto) {
        return null;
        //TODO
    }

    @PostMapping("/{id}")
    public OrderResponseDto addGoodsToOrder(@PathVariable long id,
                                            @RequestBody AddGoodsToOrderRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public OrderResponseDto updateOrder(@PathVariable long id, @RequestBody OrderRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}/status")
    public OrderResponseDto updateOrderStatus(@PathVariable long id, ChangeOrderStatusDto dto) {
        return null;
        //TODO
    }
}
