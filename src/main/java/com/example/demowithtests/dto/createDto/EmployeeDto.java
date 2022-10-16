package com.example.demowithtests.dto.createDto;

import com.example.demowithtests.domain.Gender;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    public String name;
    public String country;
    public String email;
    public Integer age;
    public Gender gender;

    public Set<AddressDto> addresses = new HashSet<>();
    public SecurityCardDto card;
}
