package core.autoserviceapp.service;

import core.autoserviceapp.model.Favor;
import java.util.List;

public interface FavorService {
    Favor getById(Long id);

    Favor save(Favor favor);

    Favor update(Long id, Favor favor);

    List<Favor> getFavorsByIdIn(List<Long> ids);
}
