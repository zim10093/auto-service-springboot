package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.FavorStatus;
import core.autoserviceapp.repository.FavorRepository;
import core.autoserviceapp.service.FavorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FavorServiceImpl implements FavorService {
    private final FavorRepository favorRepository;

    @Override
    public Favor getById(Long id) {
        return favorRepository.getReferenceById(id);
    }

    @Override
    public Favor save(Favor favor) {
        return favorRepository.save(favor);
    }

    @Override
    public Favor update(Long id, Favor favor) {
        favor.setId(id);
        return favorRepository.save(favor);
    }

    @Override
    public List<Favor> getFavorsByIdIn(List<Long> ids) {
        return favorRepository.getFavorsByIdIn(ids);
    }

    @Override
    public List<Favor> getFavorsByWorkmanIdAndFavorStatus(Long id, FavorStatus status) {
        return favorRepository.getFavorsByWorkmanIdAndFavorStatus(id, status);
    }

    @Override
    public List<Favor> saveAll(Iterable<Favor> favors) {
        return favorRepository.saveAll(favors);
    }
}
