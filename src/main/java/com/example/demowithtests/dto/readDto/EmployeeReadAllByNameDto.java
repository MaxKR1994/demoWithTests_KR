package com.example.demowithtests.dto.readDto;

import com.example.demowithtests.domain.Gender;
import com.example.demowithtests.dto.createDto.AddressDto;
import com.example.demowithtests.dto.createDto.SecurityCardDto;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReadAllByNameDto {
    public String name;
    public String country;
    public String email;
    public Integer age;
    public Gender gender;
    public Set<AddressDto> addresses = new HashSet<>();
    public SecurityCardDto card;
}
