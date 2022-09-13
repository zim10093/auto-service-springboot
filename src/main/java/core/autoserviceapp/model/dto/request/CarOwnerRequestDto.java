package core.autoserviceapp.model.dto.request;

import java.util.List;
import lombok.Getter;

@Getter
public class CarOwnerRequestDto {
    private String name;
    private List<Long> carIds;
    private List<Long> orderIds;
}
