package com.example.demowithtests.dto.createDto;

import java.time.Instant;
import java.util.Date;

public class SecurityCardDto {
    public String number;
    public Boolean cardHasActive = Boolean.TRUE;
    public Date date = Date.from(Instant.now());
}
