package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Goods;
import core.autoserviceapp.repository.GoodsRepository;
import core.autoserviceapp.service.GoodsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository goodsRepository;

    @Override
    public Goods getById(Long id) {
        return goodsRepository.getReferenceById(id);
    }

    @Override
    public Goods save(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public Goods update(Long id, Goods goods) {
        goods.setId(id);
        return goodsRepository.save(goods);
    }

    @Override
    public List<Goods> getGoodsByIdIn(List<Long> ids) {
        return goodsRepository.getGoodsByIdIn(ids);
    }
}
