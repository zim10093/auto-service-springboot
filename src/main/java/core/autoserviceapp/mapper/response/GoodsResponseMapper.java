package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Goods;
import core.autoserviceapp.model.dto.response.GoodsResponseDto;
import org.springframework.stereotype.Component;

@Component
public class GoodsResponseMapper implements ToDtoMapper<GoodsResponseDto, Goods> {
    @Override
    public GoodsResponseDto toDto(Goods model) {
        GoodsResponseDto dto = new GoodsResponseDto();
        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setPrice(model.getPrice());
        return dto;
    }
}
