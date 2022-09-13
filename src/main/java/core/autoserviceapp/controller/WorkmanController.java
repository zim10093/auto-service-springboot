package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.WorkmanRequestDto;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import core.autoserviceapp.model.dto.response.WorkmanResponseDto;
import core.autoserviceapp.model.dto.response.WorkmanSalaryResponseDto;
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
@RequestMapping("/workmans")
@RequiredArgsConstructor
public class WorkmanController {
    @GetMapping("/{id}/orders")
    public List<OrderResponseDto> getOrders(@PathVariable Long id) {
        return null;
        //TODO
    }

    @GetMapping("/{id}/salary-calculation")
    public WorkmanSalaryResponseDto calculateSalary(@PathVariable Long id) {
        return null;
        //TODO
    }

    @PostMapping
    public WorkmanResponseDto createWorkman(@RequestBody WorkmanRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public WorkmanResponseDto updateWorkman(@PathVariable Long id,
                                            @RequestBody WorkmanRequestDto dto) {
        return null;
        //TODO
    }
}
