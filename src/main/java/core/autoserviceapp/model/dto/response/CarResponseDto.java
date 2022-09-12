package core.autoserviceapp.model.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarResponseDto {
    private long id;
    private String manufacturer;
    private String model;
    private int year;
    private String licenseNumber;
    private long carOwnerId;
}
