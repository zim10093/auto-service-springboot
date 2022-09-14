package core.autoserviceapp.service;

import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.OrderStatus;
import java.util.List;

public interface OrderService {
    List<Order> findAllById(Iterable<Long> ids);

    List<Order> findAllByCarOwnerId(Long id);

    List<Order> findAllByWokrmanId(Long id);

    Order getById(Long id);

    Order save(Order order);

    Order update(Long id, Order order);

    Order changeStatus(Long id, OrderStatus status);

    Order addGoodsToOrder(Long orderId, Iterable<Long> goodsId);

    Order getOrderCost(Long id);
}
