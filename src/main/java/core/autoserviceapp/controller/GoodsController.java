package core.autoserviceapp.controller;

import core.autoserviceapp.model.dto.request.GoodsRequestDto;
import core.autoserviceapp.model.dto.response.GoodsResponseDto;
import lombok.RequiredArgsConstructor;
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
    @PostMapping
    public GoodsResponseDto createGoods(@RequestBody GoodsRequestDto dto) {
        return null;
        //TODO
    }

    @PutMapping("/{id}")
    public GoodsResponseDto updateGoods(@PathVariable long id, @RequestBody GoodsRequestDto dto) {
        return null;
        //TODO
    }
}
