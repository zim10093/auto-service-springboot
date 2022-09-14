package core.autoserviceapp.service;

import core.autoserviceapp.model.Workman;
import java.math.BigDecimal;

public interface WorkmanService {
    Workman getById(Long id);

    Workman save(Workman workman);

    Workman update(Long id, Workman workman);

    BigDecimal calculateSalary(Long id);
}
