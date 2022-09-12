package core.autoserviceapp.model.dto.response;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsResponseDto {
    private long id;
    private String name;
    private BigDecimal price;
}
