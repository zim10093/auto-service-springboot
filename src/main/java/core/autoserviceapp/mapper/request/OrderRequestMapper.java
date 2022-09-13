package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.OrderStatus;
import core.autoserviceapp.model.dto.request.OrderRequestDto;
import core.autoserviceapp.service.CarService;
import core.autoserviceapp.service.FavorService;
import core.autoserviceapp.service.GoodsService;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderRequestMapper implements ToModelMapper<OrderRequestDto, Order> {
    private final CarService carService;
    private final FavorService favorService;
    private final GoodsService goodsService;

    @Override
    public Order toModel(OrderRequestDto dto) {
        Order order = new Order();
        order.setCar(carService.getById(dto.getCarId()));
        order.setProblem(dto.getProblem());
        order.setAcceptedDate(LocalDate.now());
        order.setIncludedFavors(favorService.getFavorsByIdIn(dto.getIncludedFavorIds()));
        order.setIncludedGoods(goodsService.getGoodsByIdIn(dto.getIncludedGoodsIds()));
        order.setOrderStatus(OrderStatus.ACCEPTED);
        return order;
    }
}
