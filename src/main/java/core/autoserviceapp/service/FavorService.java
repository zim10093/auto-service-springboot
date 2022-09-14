package core.autoserviceapp.service;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.FavorStatus;
import java.util.List;

public interface FavorService {
    Favor getById(Long id);

    Favor save(Favor favor);

    Favor update(Long id, Favor favor);

    List<Favor> getFavorsByIdIn(List<Long> ids);

    List<Favor> getFavorsByWorkmanIdAndFavorStatus(Long id, FavorStatus status);

    List<Favor> saveAll(Iterable<Favor> favors);
}
