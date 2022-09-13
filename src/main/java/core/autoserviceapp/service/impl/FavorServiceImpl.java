package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.repository.FavorRepository;
import core.autoserviceapp.service.FavorService;
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
}
