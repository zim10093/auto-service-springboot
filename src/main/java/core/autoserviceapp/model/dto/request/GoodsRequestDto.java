package core.autoserviceapp.model.dto.request;

import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class GoodsRequestDto {
    private String name;
    private BigDecimal price;
}
