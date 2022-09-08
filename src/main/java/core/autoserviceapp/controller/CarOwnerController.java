package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.CarOwnerRequestDto;
import core.autoserviceapp.model.dto.response.CarOwnerResponseDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import java.util.List;
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
    @GetMapping("/{id}/orders")
    public List<OrderResponseDto> getOrders(@PathVariable long id) {
        return null;
        //TODO
    }

    @PostMapping
    public CarOwnerResponseDto createCarOwner(@RequestBody CarOwnerResponseDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public CarOwnerResponseDto updateCarOwner(@PathVariable long id,
                                              @RequestBody CarOwnerRequestDto dto) {
        return null;
        //TODO
    }
}
