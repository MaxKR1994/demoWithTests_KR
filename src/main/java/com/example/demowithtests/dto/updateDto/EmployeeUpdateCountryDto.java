package com.example.demowithtests.dto.updateDto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUpdateCountryDto {
    public Integer id;
    public String country;

}
