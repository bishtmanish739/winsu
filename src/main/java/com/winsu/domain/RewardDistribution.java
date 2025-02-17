package com.winsu.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "reward_distribution")
public class RewardDistribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long distributionId;

    private LocalDate date;
    private float totalAmount; // Use BigDecimal for NUMERIC
    private float perPointValue; // Use BigDecimal for NUMERIC
}