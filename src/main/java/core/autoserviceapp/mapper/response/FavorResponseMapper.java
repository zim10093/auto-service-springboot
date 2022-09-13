package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.dto.response.FavorResponseDto;
import org.springframework.stereotype.Component;

@Component
public class FavorResponseMapper implements ToDtoMapper<FavorResponseDto, Favor> {
    @Override
    public FavorResponseDto toDto(Favor favor) {
        FavorResponseDto dto = new FavorResponseDto();
        dto.setId(favor.getId());
        dto.setOrderId(favor.getOrder().getId());
        dto.setWorkmanId(favor.getWorkman().getId());
        dto.setPrice(favor.getPrice());
        dto.setFavorStatus(favor.getFavorStatus().name());
        return dto;
    }
}
