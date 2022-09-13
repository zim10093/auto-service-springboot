package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.Workman;
import core.autoserviceapp.model.dto.request.WorkmanRequestDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import core.autoserviceapp.model.dto.response.WorkmanResponseDto;
import core.autoserviceapp.model.dto.response.WorkmanSalaryResponseDto;
import core.autoserviceapp.service.OrderService;
import core.autoserviceapp.service.WorkmanService;
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
@RequestMapping("/workmans")
@RequiredArgsConstructor
public class WorkmanController {
    private final WorkmanService workmanService;
    private final OrderService orderService;
    private final ToModelMapper<WorkmanRequestDto, Workman> toWorkmanMapper;
    private final ToDtoMapper<WorkmanResponseDto, Workman> toWorkmanDtoMapper;
    private final ToDtoMapper<OrderResponseDto, Order> toOrderDtoMapper;

    @GetMapping("/{id}/orders")
    public List<OrderResponseDto> getOrders(@PathVariable Long id) {
        return orderService.findAllByWokrmanId(id).stream()
                .map(toOrderDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/salary-calculation")
    public WorkmanSalaryResponseDto calculateSalary(@PathVariable Long id) {
        return null;
        //TODO
    }

    @PostMapping
    public WorkmanResponseDto createWorkman(@RequestBody WorkmanRequestDto dto) {
        return toWorkmanDtoMapper.toDto(workmanService.save(toWorkmanMapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public WorkmanResponseDto updateWorkman(@PathVariable Long id,
                                            @RequestBody WorkmanRequestDto dto) {
        return toWorkmanDtoMapper.toDto(workmanService.update(id, toWorkmanMapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public WorkmanResponseDto getById(@PathVariable Long id) {
        return toWorkmanDtoMapper.toDto(workmanService.getById(id));
    }
}
