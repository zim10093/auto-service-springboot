package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.CarRequestDto;
import core.autoserviceapp.model.dto.response.CarResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    @PostMapping
    public CarResponseDto createCar(@RequestBody CarRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public CarResponseDto updateCar(@PathVariable long id, @RequestBody CarRequestDto dto) {
        return null;
        //TODO
    }
}
