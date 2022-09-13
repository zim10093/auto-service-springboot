package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Goods;
import core.autoserviceapp.model.dto.request.GoodsRequestDto;
import org.springframework.stereotype.Component;

@Component
public class GoodsRequestMapper implements ToModelMapper<GoodsRequestDto, Goods> {
    @Override
    public Goods toModel(GoodsRequestDto dto) {
        Goods goods = new Goods();
        goods.setName(dto.getName());
        goods.setPrice(dto.getPrice());
        return goods;
    }
}
