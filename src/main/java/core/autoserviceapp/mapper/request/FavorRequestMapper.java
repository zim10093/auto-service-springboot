package core.autoserviceapp.mapper.request;

import core.autoserviceapp.mapper.ToModelMapper;
import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.FavorStatus;
import core.autoserviceapp.model.dto.request.FavorRequestDto;
import core.autoserviceapp.service.OrderService;
import core.autoserviceapp.service.WorkmanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FavorRequestMapper implements ToModelMapper<FavorRequestDto, Favor> {
    private final OrderService orderService;
    private final WorkmanService workmanService;

    @Override
    public Favor toModel(FavorRequestDto dto) {
        Favor favor = new Favor();
        favor.setOrder(orderService.getById(dto.getOrderId()));
        favor.setWorkman(workmanService.getById(dto.getWorkmanId()));
        favor.setPrice(dto.getPrice());
        favor.setFavorStatus(FavorStatus.valueOf(dto.getStatus().toUpperCase()));
        return favor;
    }
}
