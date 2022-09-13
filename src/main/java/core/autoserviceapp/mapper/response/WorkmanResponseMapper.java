package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Order;
import core.autoserviceapp.model.Workman;
import core.autoserviceapp.model.dto.response.WorkmanResponseDto;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class WorkmanResponseMapper implements ToDtoMapper<WorkmanResponseDto, Workman> {
    @Override
    public WorkmanResponseDto toDto(Workman workman) {
        WorkmanResponseDto dto = new WorkmanResponseDto();
        dto.setId(workman.getId());
        dto.setName(workman.getName());
        dto.setCompletedOrderIds(workman.getCompletedOrders().stream()
                .map(Order::getId)
                .collect(Collectors.toList()));
        return dto;
    }
}
