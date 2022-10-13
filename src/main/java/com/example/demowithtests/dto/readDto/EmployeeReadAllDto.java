package com.example.demowithtests.dto.readDto;

import com.example.demowithtests.dto.createDto.AddressDto;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReadAllDto {
    public Integer id;
    public String name;
    public String country;
    public String email;
    public Integer age;
    public Set<AddressDto> addresses = new HashSet<>();
}
