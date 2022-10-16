package com.example.demowithtests.dto.readDto;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.example.demowithtests.domain.Gender;
import com.example.demowithtests.dto.createDto.AddressDto;
import com.example.demowithtests.dto.createDto.SecurityCardDto;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReadAdminDto {

    public Integer id;
    public String name;
    public String country;
    public String email;
    public Integer age;
    public Gender gender;
    public Boolean isAdult;
    public Boolean isDeleted;
    public Set<AddressDto> addresses = new HashSet<>();
    public SecurityCardDto card;

    public Date date = Date.from(Instant.now());
}
