package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.dto.request.FavorRequestDto;
import core.autoserviceapp.model.dto.response.FavorResponseDto;
import core.autoserviceapp.service.FavorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
    private final FavorService favorService;
    private final ToModelMapper<FavorRequestDto, Favor> toFavorMapper;
    private final ToDtoMapper<FavorResponseDto, Favor> toFavorDtoMapper;

    @PostMapping
    public FavorResponseDto createFavor(@RequestBody FavorRequestDto dto) {
        return toFavorDtoMapper.toDto(favorService.save(toFavorMapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public FavorResponseDto updateFavor(@PathVariable Long id,
                                          @RequestBody FavorRequestDto dto) {
        return toFavorDtoMapper.toDto(favorService.update(id, toFavorMapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public FavorResponseDto getById(@PathVariable Long id) {
        return toFavorDtoMapper.toDto(favorService.getById(id));
    }
}
