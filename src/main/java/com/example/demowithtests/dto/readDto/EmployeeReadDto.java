package com.example.demowithtests.dto.readDto;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.example.demowithtests.dto.createDto.AddressDto;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReadDto {
    public String name;
    public String country;
    public String email;
    public Integer age;
    public Set<AddressDto> addresses = new HashSet<>();
    //add technical field
    public Date date = Date.from(Instant.now());
}
