package core.autoserviceapp.model.dto.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarOwnerResponseDto {
    private Long id;
    private String name;
    private List<Long> carIds;
    private List<Long> ordersIds;
}
