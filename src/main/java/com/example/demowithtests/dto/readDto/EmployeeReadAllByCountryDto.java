package com.example.demowithtests.dto.readDto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReadAllByCountryDto {
    public String name;
    public String country;
    public String email;
    public Integer age;
}
