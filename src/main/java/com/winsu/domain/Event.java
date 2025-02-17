package com.winsu.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status; // UPCOMING, LIVE, COMPLETED
}