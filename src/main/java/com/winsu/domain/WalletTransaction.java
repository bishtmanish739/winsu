package com.winsu.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private double amount;
    private String transactionType; // REWARD, REDEMPTION
    private LocalDateTime timestamp;
}