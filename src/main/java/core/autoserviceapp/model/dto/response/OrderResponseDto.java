package core.autoserviceapp.model.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDto {
    private Long id;
    private Long carId;
    private String problem;
    private LocalDate acceptedDate;
    private List<Long> includedFavorIds;
    private List<Long> includedGoodsIds;
    private String orderStatus;
    private BigDecimal totalCost;
    private LocalDate finishDate;
}
