package com.example.demowithtests.domain;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cards")
public class SecurityCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number")
    private String number;
    @Column(name = "card_has_active")
    private Boolean cardHasActive = Boolean.TRUE;
    public Date date = Date.from(Instant.now());
}
