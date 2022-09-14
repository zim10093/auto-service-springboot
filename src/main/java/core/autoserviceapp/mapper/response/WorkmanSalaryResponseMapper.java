package core.autoserviceapp.mapper.response;

import core.autoserviceapp.mapper.ToDtoMapper;
import core.autoserviceapp.model.dto.response.WorkmanSalaryResponseDto;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class WorkmanSalaryResponseMapper implements
        ToDtoMapper<WorkmanSalaryResponseDto, BigDecimal> {
    @Override
    public WorkmanSalaryResponseDto toDto(BigDecimal salary) {
        WorkmanSalaryResponseDto dto = new WorkmanSalaryResponseDto();
        dto.setSalary(salary);
        return dto;
    }
}
