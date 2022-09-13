package core.autoserviceapp.service;


import core.autoserviceapp.model.Goods;
import java.util.List;

public interface GoodsService {
    Goods getById(Long id);

    Goods save(Goods goods);

    Goods update(Long id, Goods goods);

    List<Goods> getGoodsByIdIn(List<Long> ids);
}
