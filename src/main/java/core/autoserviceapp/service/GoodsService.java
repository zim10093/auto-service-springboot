package core.autoserviceapp.service;


import core.autoserviceapp.model.Goods;

public interface GoodsService {
    Goods getById(Long id);

    Goods save(Goods goods);

    Goods update(Long id, Goods goods);
}
