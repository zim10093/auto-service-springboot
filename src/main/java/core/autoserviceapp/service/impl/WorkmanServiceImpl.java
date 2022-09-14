package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.FavorStatus;
import core.autoserviceapp.model.Workman;
import core.autoserviceapp.repository.WokmanRepository;
import core.autoserviceapp.service.FavorService;
import core.autoserviceapp.service.WorkmanService;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkmanServiceImpl implements WorkmanService {
    private static final double SALARY_PERCENT = 0.4;
    private final WokmanRepository wokmanRepository;
    private final FavorService favorService;

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

    @Override
    public BigDecimal calculateSalary(Long id) {
        List<Favor> unpaidFavors = favorService
                .getFavorsByWorkmanIdAndFavorStatus(id, FavorStatus.UNPAID);

        BigDecimal salary = unpaidFavors.stream()
                .map(Favor::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .multiply(BigDecimal.valueOf(SALARY_PERCENT));
        unpaidFavors.forEach(f -> f.setFavorStatus(FavorStatus.PAID));
        favorService.saveAll(unpaidFavors);
        return salary;
    }
}
