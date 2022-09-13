package core.autoserviceapp.model.dto.request;

import java.util.List;
import lombok.Getter;

@Getter
public class AddGoodsToOrderRequestDto {
    private List<Long> goodsId;
}
