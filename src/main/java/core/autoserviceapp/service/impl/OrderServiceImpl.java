package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Order;
import core.autoserviceapp.repository.OrderRepository;
import core.autoserviceapp.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public List<Order> findAllById(Iterable<Long> ids) {
        return orderRepository.findAllById(ids);
    }

    @Override
    public List<Order> findAllByCarOwnerId(Long id) {
        return orderRepository.findAllByCarOwnerId(id);
    }

    @Override
    public List<Order> findAllByWokrmanId(Long id) {
        return orderRepository.findAllByWorkmanId(id);
    }

    @Override
    public Order getById(Long id) {
        return orderRepository.getReferenceById(id);
    }
}
