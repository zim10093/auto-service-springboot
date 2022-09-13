package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.Goods;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.dto.response.OrderResponseDto;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseMapper implements ToDtoMapper<OrderResponseDto, Order> {
    @Override
    public OrderResponseDto toDto(Order order) {
        OrderResponseDto dto = new OrderResponseDto();
        dto.setId(order.getId());
        dto.setCarId(order.getCar().getId());
        dto.setProblem(order.getProblem());
        dto.setAcceptedDate(order.getAcceptedDate());
        dto.setIncludedFavorIds(order.getIncludedFavors().stream()
                .map(Favor::getId)
                .collect(Collectors.toList()));
        dto.setIncludedGoodsIds(order.getIncludedGoods().stream()
                .map(Goods::getId)
                .collect(Collectors.toList()));
        dto.setOrderStatus(order.getOrderStatus().name());
        dto.setTotalCost(order.getTotalCost());
        dto.setFinishDate(order.getFinishDate());
        return dto;
    }
}
