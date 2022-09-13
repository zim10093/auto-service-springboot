package core.autoserviceapp.model.dto.request;

import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class FavorRequestDto {
    private Long orderId;
    private Long workmanId;
    private BigDecimal price;
    private String status;
}
