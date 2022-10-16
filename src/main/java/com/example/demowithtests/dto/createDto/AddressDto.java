package com.example.demowithtests.dto.createDto;

import java.time.Instant;
import java.util.Date;

public class AddressDto {
    public Long id;
    public Boolean addressHasActive = Boolean.TRUE;
    public String city;
    public String street;
    public String postalCode;
    public Date date = Date.from(Instant.now());
}
