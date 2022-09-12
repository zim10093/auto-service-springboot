package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Car;
import core.autoserviceapp.model.dto.request.CarRequestDto;
import core.autoserviceapp.model.dto.response.CarResponseDto;
import core.autoserviceapp.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
    private final CarService carService;
    private final ToModelMapper<CarRequestDto, Car> toCarMapper;
    private final ToDtoMapper<CarResponseDto, Car> toCarDtoMapper;

    @PostMapping
    public CarResponseDto createCar(@RequestBody CarRequestDto dto) {
        return toCarDtoMapper.toDto(carService.save(toCarMapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public CarResponseDto updateCar(@PathVariable long id, @RequestBody CarRequestDto dto) {
        return toCarDtoMapper.toDto(carService.update(id,toCarMapper.toModel(dto)));
    }

    @GetMapping("{id}")
    public CarResponseDto getById(@PathVariable long id) {
        return toCarDtoMapper.toDto(carService.getById(id));
    }
}
