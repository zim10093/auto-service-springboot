package core.autoserviceapp.model.dto.request;

import lombok.Getter;

@Getter
public class CarRequestDto {
    private String manufacturer;
    private String model;
    private int year;
    private String licenseNumber;
    private long carOwner_id;
}
