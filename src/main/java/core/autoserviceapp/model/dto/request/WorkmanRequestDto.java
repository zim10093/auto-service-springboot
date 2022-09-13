package core.autoserviceapp.model.dto.request;

import java.util.List;
import lombok.Getter;

@Getter
public class WorkmanRequestDto {
    private String name;
    private List<Long> completedOrderIds;
}
