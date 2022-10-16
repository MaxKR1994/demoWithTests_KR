package com.example.demowithtests.dto.updateDto;

import com.example.demowithtests.domain.Gender;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUpdateDto {
    public Integer id;
    public String name;
    public String country;
    public Integer age;
    public Gender gender;
}
