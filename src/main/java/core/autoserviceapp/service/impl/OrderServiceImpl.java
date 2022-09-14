package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.Goods;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.OrderStatus;
import core.autoserviceapp.repository.OrderRepository;
import core.autoserviceapp.service.OrderService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private static final double GOODS_DISCOUNT = 0.01;
    private static final double FAVOR_DISCOUNT = 0.02;
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

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Long id, Order order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    @Override
    public Order changeStatus(Long id, OrderStatus status) {
        Order order = getById(id);
        order.setOrderStatus(status);
        if (status.equals(OrderStatus.SUCCESSFULLY_COMPLETED)
                || status.equals(OrderStatus.UNSUCCESSFULLY_COMPLETED)) {
            order.setFinishDate(LocalDate.now());
        }
        return orderRepository.save(order);
    }

    @Override
    public Order addGoodsToOrder(Long orderId, Iterable<Long> goodsId) {
        return orderRepository.addGoodsToOrder(orderId, goodsId);
    }

    @Override
    public Order getOrderCost(Long id) {
        Order order = orderRepository.getReferenceById(id);
        long orders = orderRepository
                .countOrdersByCarOwnerId(order.getCar().getCarOwner().getId());

        BigDecimal favorTotalCost = order.getIncludedFavors().stream()
                .map(Favor::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .subtract(BigDecimal.valueOf(FAVOR_DISCOUNT).multiply(BigDecimal.valueOf(orders)));

        BigDecimal goodsTotalCost = order.getIncludedGoods().stream()
                .map(Goods::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .subtract(BigDecimal.valueOf(GOODS_DISCOUNT).multiply(BigDecimal.valueOf(orders)));

        order.setTotalCost(favorTotalCost.add(goodsTotalCost));
        return orderRepository.save(order);
    }
}
