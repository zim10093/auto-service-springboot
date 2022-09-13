package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.OrderStatus;
import core.autoserviceapp.model.dto.request.ChangeOrderStatusDto;
import org.springframework.stereotype.Component;

@Component
public class ChangeOrderRequestMapper implements ToModelMapper<ChangeOrderStatusDto, OrderStatus> {
    @Override
    public OrderStatus toModel(ChangeOrderStatusDto dto) {
        return OrderStatus.valueOf(dto.getOrderStatus());
    }
}
