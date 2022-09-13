package core.autoserviceapp.service;

import core.autoserviceapp.model.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAllById (Iterable<Long> ids);

    List<Order> findAllByCarOwnerId(Long id);
}
