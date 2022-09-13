package core.autoserviceapp.model.dto.response;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavorResponseDto {
    private Long id;
    private Long orderId;
    private Long workmanId;
    private BigDecimal price;
    private String favorStatus;

}
