package core.autoserviceapp.model.dto.request;

import java.util.List;
import lombok.Getter;

@Getter
public class OrderRequestDto {
    private Long carId;
    private String problem;
    private List<Long> includedFavorIds;
    private List<Long> includedGoodsIds;
}
