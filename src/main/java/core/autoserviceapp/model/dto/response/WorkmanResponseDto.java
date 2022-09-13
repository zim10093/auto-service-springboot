package core.autoserviceapp.model.dto.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkmanResponseDto {
   private Long id;
   private String name;
   private List<Long> completedOrderIds;
}
