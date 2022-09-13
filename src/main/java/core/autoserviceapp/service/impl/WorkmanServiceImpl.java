package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Workman;
import core.autoserviceapp.repository.WokmanRepository;
import core.autoserviceapp.service.WorkmanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkmanServiceImpl implements WorkmanService {
    private final WokmanRepository wokmanRepository;

    @Override
    public Workman getById(Long id) {
        return wokmanRepository.getReferenceById(id);
    }

    @Override
    public Workman save(Workman workman) {
        return wokmanRepository.save(workman);
    }

    @Override
    public Workman update(Long id, Workman workman) {
        workman.setId(id);
        return wokmanRepository.save(workman);
    }
}
