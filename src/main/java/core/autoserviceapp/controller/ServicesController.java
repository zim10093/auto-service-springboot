package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.ServiceRequestDto;
import core.autoserviceapp.model.dto.response.ServiceResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
@RequiredArgsConstructor
public class ServicesController {
    @PostMapping
    public ServiceResponseDto createService(@RequestBody ServiceRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public ServiceResponseDto updateService(@PathVariable long id,
                                            @RequestBody ServiceRequestDto dto) {
        return null;
        //TODO
    }
}
