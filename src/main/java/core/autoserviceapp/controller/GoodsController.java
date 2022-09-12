package core.autoserviceapp.controller;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Goods;
import core.autoserviceapp.model.dto.request.GoodsRequestDto;
import core.autoserviceapp.model.dto.response.GoodsResponseDto;
import core.autoserviceapp.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController {
    private final ToModelMapper<GoodsRequestDto, Goods> toGoodsMapper;
    private final ToDtoMapper<GoodsResponseDto, Goods> toGoodsDtoMapper;
    private final GoodsService goodsService;

    @PostMapping
    public GoodsResponseDto createGoods(@RequestBody GoodsRequestDto dto) {
        return toGoodsDtoMapper.toDto(goodsService.save(toGoodsMapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public GoodsResponseDto updateGoods(@PathVariable long id, @RequestBody GoodsRequestDto dto) {
        return toGoodsDtoMapper.toDto(goodsService.update(id, toGoodsMapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public GoodsResponseDto getById(@PathVariable long id) {
        return toGoodsDtoMapper.toDto(goodsService.getById(id));
    }
}
