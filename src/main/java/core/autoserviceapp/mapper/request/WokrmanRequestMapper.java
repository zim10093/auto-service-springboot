package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Workman;
import core.autoserviceapp.model.dto.request.WorkmanRequestDto;
import core.autoserviceapp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WokrmanRequestMapper implements ToModelMapper<WorkmanRequestDto, Workman> {
    private final OrderService orderService;

    @Override
    public Workman toModel(WorkmanRequestDto dto) {
        Workman workman = new Workman();
        workman.setName(dto.getName());
        workman.setCompletedOrders(orderService.findAllById(dto.getCompletedOrderIds()));
        return workman;
    }
}
