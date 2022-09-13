package core.autoserviceapp.service;

import core.autoserviceapp.model.Favor;

public interface FavorService {
    Favor getById(Long id);

    Favor save(Favor favor);

    Favor update(Long id, Favor favor);
}
