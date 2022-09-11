package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.FavorRequestDto;
import core.autoserviceapp.model.dto.response.FavorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favors")
@RequiredArgsConstructor
public class FavorController {
    @PostMapping
    public FavorResponseDto createFavor(@RequestBody FavorRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public FavorResponseDto updateFavor(@PathVariable long id,
                                          @RequestBody FavorRequestDto dto) {
        return null;
        //TODO
    }
}
